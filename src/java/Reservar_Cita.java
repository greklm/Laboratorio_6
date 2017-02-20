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
import java.text.DateFormat;
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
@WebServlet(urlPatterns = {"/Reservar_Cita"})
public class Reservar_Cita extends HttpServlet {

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
            
            String Id_Horario_Medico = request.getParameter("Id_Horario_Medico").trim();
            String Dia = request.getParameter("Dia").trim();
            String Hora = request.getParameter("Hora").trim();
           
            Cookie[] MyCookies = request.getCookies();
            String DNI = MyCookies[1].getValue().toString();
           
 
            Calendar now = Calendar.getInstance();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
            int Dias = Integer.parseInt(Dia)-dayOfWeek;
            
            now.add(Calendar.DAY_OF_WEEK, Dias);
            
            String Fecha = dateFormat.format(now.getTime()).toString();

            cmongo Conexion = new cmongo();
            
            
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar now2 = Calendar.getInstance();
            String Id_Cita = dateFormat2.format(now2.getTime());
            String[] Parametros = new String[]{Id_Cita,Fecha,Hora,"PENDIENTE",DNI,Id_Horario_Medico};
            Conexion.Insertar("Citas",new String[]{"ID CITA","FECHA","HORA","ESTADO","PACIENTE DNI","ID HORARIO MEDICO"}, Parametros);
            
            DBCursor Cursor = Conexion.Registro(new String[]{"ID HORARIO MEDICO"}, new String[]{Id_Horario_Medico}, "HorarioMedico");
             while(Cursor.hasNext()) {
                 BasicDBObject obj = (BasicDBObject) Cursor.next();
                 String Id_Medico = obj.getString("ID MEDICO");
                 String Id_Horario = obj.getString("ID HORARIO");                
                 Conexion.Actualizar("HorarioMedico", new String[]{"ID HORARIO MEDICO","ID MEDICO","ID HORARIO","ESTADO"}, new String[]{Id_Horario_Medico,Id_Medico,Id_Horario,"RESERVADO"});
             }
             
            DBCursor Cursor2 = Conexion.Registro(new String[]{"DNI"}, new String[]{DNI}, "Usuarios");
             while(Cursor2.hasNext()) {
                 BasicDBObject obj = (BasicDBObject) Cursor2.next();
                 String Password = obj.getString("PASSWORD");
                 String Tipo = obj.getString("TIPO");                
                 Conexion.Actualizar("Usuarios", new String[]{"DNI","PASSWORD","TIPO","ESTADO"}, new String[]{DNI,Password,Tipo,"Inhabilitado"});
                 
                 Cookie Estado = new Cookie("Estado", "Inhabilitado");
                 Estado.setMaxAge(3600);
                 MyCookies[2] = Estado; 
             } 
             
             String referer = request.getHeader("Referer");
             response.sendRedirect(referer);
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
