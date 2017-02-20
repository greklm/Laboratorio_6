/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.cmongo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GREG-PC
 */
@WebServlet(urlPatterns = {"/Recuperar_Citas_Pendientes"})
public class Recuperar_Citas_Pendientes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            Cookie[] MyCookies = request.getCookies();
            String DNI = MyCookies[1].getValue().toString();
            
            String Datos_Enviar = "<table class='table-responsive table-bordered table-hover'><tr><th>Hora</th>";
            Datos_Enviar += "<th>Fecha</th><th>Paciente</th></tr>";
             Calendar now = Calendar.getInstance();
             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
             String Fecha = dateFormat.format(now.getTime()).toString();

            cmongo Conexion = new cmongo();
            DBCursor Cursor = Conexion.Registro(new String[]{"dni"}, new String[]{DNI}, "Medicos");
             while(Cursor.hasNext()) {
                 BasicDBObject obj = (BasicDBObject) Cursor.next();
                 String Id_Medico = obj.getString("idmedico");
                 
                 DBCursor Cursor2 = Conexion.Registro(new String[]{"ID MEDICO"}, new String[]{Id_Medico}, "HorarioMedico");
                    while(Cursor2.hasNext()) {
                    BasicDBObject obj2 = (BasicDBObject) Cursor2.next();
                    String Id_Horario_Medico = obj2.getString("idmedico");
                        
                        DBCursor Cursor3 = Conexion.Registro(new String[]{"ID HORARIO MEDICO","ESTADO","FECHA"}, new String[]{Id_Horario_Medico,"PENDIENTE",Fecha},"Citas");
                            while(Cursor3.hasNext()) {
                            BasicDBObject obj3 = (BasicDBObject) Cursor3.next();
                            String Fecha_Cita = obj3.getString("FECHA");
                            String Hora_Cita = obj3.getString("HORA");
                            String Paciente = obj3.getString("PACIENTE DNI");
                            
                            Datos_Enviar += "<tr><td>"+Hora_Cita+"</td><td>"+Fecha_Cita+"</td><td>"+Paciente+"</td></tr>";
                        }
                    }
                }
             
             Datos_Enviar+="</table>";
             response.setContentType("text/plain");
            response.getWriter().write(Datos_Enviar);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
