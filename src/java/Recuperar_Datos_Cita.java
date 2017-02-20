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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GREG-PC
 */
@WebServlet(urlPatterns = {"/Recuperar_Datos_Cita"})
public class Recuperar_Datos_Cita extends HttpServlet {

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
               String Datos_Enviar = "<form id='Form_Reservar_Cita' action='Reservar_Cita' method='get' class='form-horizontal'>";
            
             String[] Datos = request.getParameter("Id_Horario").trim().split("-");
             String Especialidad = request.getParameter("Especialidad").trim();
             String Dia = Datos[0];
             String Hora = Datos[1];
             String[] Dias = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
             
             cmongo Conexion = new cmongo();
            
             DBCursor Cursor = Conexion.Registro(new String[]{"DIA","HORA INICIO"}, new String[]{Dia,Hora}, "Horarios");
              while(Cursor.hasNext()) {
                 BasicDBObject obj = (BasicDBObject) Cursor.next();
                 String Id_Horario = obj.getString("ID HORARIO");

                DBCursor Cursor2 = Conexion.Registro(new String[]{"ID HORARIO"}, new String[]{Id_Horario}, "HorarioMedico");
                while(Cursor2.hasNext()) {
                    BasicDBObject obj2 = (BasicDBObject) Cursor2.next();
                    String Id_Medico = obj2.getString("ID MEDICO");
                    String Id_Horario_Medico = obj2.getString("ID HORARIO MEDICO");

                    DBCursor Cursor3 = Conexion.Registro(new String[]{"idmedico"}, new String[]{Id_Medico}, "Medicos");
                    while(Cursor3.hasNext()) {
                        BasicDBObject obj3 = (BasicDBObject) Cursor3.next();
                        String Id_Especialidad = obj3.getString("especialidad_codigo");
                        String Apellidos = obj3.getString("Apellidos");
                        String Nombres = obj3.getString("nombres");

                        DBCursor Cursor4 = Conexion.Registro(new String[]{"codigo"}, new String[]{Id_Especialidad}, "Especialidades");
                        while(Cursor4.hasNext()) {
                            BasicDBObject obj4 = (BasicDBObject) Cursor4.next();
                            String Nombre_Especialidad = obj4.getString("nombre");
                            String Ubicacion = obj4.getString("idconsultorio");
                            if(Id_Especialidad.equals(Especialidad))
                            {
                                Datos_Enviar+="<input id='Id_Horario_Medico' name='Id_Horario_Medico' type='hidden' value='"+Id_Horario_Medico+"'>";
                                Datos_Enviar+="<input id='Dia' name='Dia' type='hidden' value='"+Dia+"'>";
                                Datos_Enviar+="<input id='Hora' name='Hora' type='hidden' value='"+Hora+"'>";
                                
                                
                                Datos_Enviar+="<div class='form-group'><label align='right' class='col-sm-3' for='Especialidad'>Especialidad:</label><div class='col-sm-9'><input id='Especialidad' class='form-control' readonly='readonly' value='"+Nombre_Especialidad+"'></div></div>";
                                Datos_Enviar+="<div class='form-group'><label align='right' class='col-sm-3' for='Medico'>Médico:</label><div class='col-sm-9'><input id='Medico' class='form-control' readonly='readonly' value='"+Nombres+" "+Apellidos+"'></div></div>";
                                Datos_Enviar+="<div class='form-group'><label align='right' class='col-sm-3' for='Hora'>Hora:</label><div class='col-sm-9'><input id='Hora' class='form-control' readonly='readonly' value='"+Hora+":00"+"'></div></div>";
                                Datos_Enviar+="<div class='form-group'><label align='right' class='col-sm-3' for='Dia'>Día:</label><div class='col-sm-9'><input id='Dia' class='form-control' readonly='readonly' value='"+Dias[Integer.parseInt(Dia)]+"'></div></div>";
                                Datos_Enviar+="<div class='form-group'><label align='right' class='col-sm-3' for='Consultorio'>Consultorio:</label><div class='col-sm-9'><input id='Consultorio' class='form-control' readonly='readonly' value='"+Ubicacion+"'></div></div>";
                                break;
                            }   
                        }       
                    }
                }
              }
              
              Datos_Enviar+="<input for='Form_Reservar_Cita' type=\"submit\" class=\"btn btn-primary\" value=\"Confirmar\">\n" +
"              <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Cancelar</button>";
              Datos_Enviar+="<form>";
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
