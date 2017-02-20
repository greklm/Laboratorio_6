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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GREG-PC
 */
@WebServlet(urlPatterns = {"/Cargar_Datos_Personales_Paciente"})
public class Cargar_Datos_Personales_Paciente extends HttpServlet {

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
            
            String Datos_Enviar="";
            cmongo Conexion = new cmongo();
            DBCursor Cursor2 = Conexion.Registro(new String[]{"dni"}, new String[]{DNI}, "Pacientes");
             
            while(Cursor2.hasNext()) {
                 BasicDBObject obj = (BasicDBObject) Cursor2.next();
                 String contraseña = obj.getString("contraseña");
                 String apellidos = obj.getString("apellidos");
                 String nombres = obj.getString("nombres");
                 String telefono = obj.getString("telefono");
                 String correo = obj.getString("correo");
                 String direccion = obj.getString("direccion");
                 String fecha_nac = obj.getString("fecha_nac");
                 String sexo = obj.getString("sexo");

                 Datos_Enviar+="<div class=\"form-group\">\n" +
"                      <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-user bigicon\"></i></span>\n" +
"\n" +
"                      <div class=\"col-md-6 col-xs-10\">\n" +
"                          <input id=\"dni\" name=\"dni\" placeholder=\"DNI\" value='"+DNI+"' class=\"form-control\" required>\n" +
"                      </div>\n" +
"                </div></br></br>\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                      <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-lock bigicon\"></i></span>\n" +
"                      <div class=\"col-md-6 col-xs-10\">\n" +
"                          <input id=\"Password\" type=\"Password\" name=\"contraseña\" value='"+contraseña+"' placeholder=\"Password\" class=\"form-control\" required>\n" +
"                      </div>\n" +
"                </div></br></br>\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                      <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-user bigicon\"></i></span>\n" +
"\n" +
"                      <div class=\"col-md-6 col-xs-10\">\n" +
"                          <input id=\"Nombres\" name=\"nombres\" placeholder=\"Nombres\" value='"+nombres+"' class=\"form-control\" required>\n" +
"                      </div>\n" +
"                </div></br></br>\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                      <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-user bigicon\"></i></span>\n" +
"\n" +
"                      <div class=\"col-md-6 col-xs-10\">\n" +
"                          <input id=\"Apellidos\" name=\"apellidos\" placeholder=\"Apellidos\" value='"+apellidos+"' class=\"form-control\" required>\n" +
"                      </div>\n" +
"                </div></br></br>\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                      <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-calendar bigicon\"></i></span>\n" +
"\n" +
"                      <div class=\"col-md-6 col-xs-10\">\n" +
"                          <input id=\"Fecha_Nacimiento\" name=\"fecha_nacimiento\" value='"+fecha_nac+"' type =\"date\" class=\"form-control\" required>\n" +
"                      </div>\n" +
"                </div></br></br>\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                    <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-user bigicon\"></i></span>\n" +
"\n" +
"                    <div class=\"col-md-6 col-xs-10\">\n" +
"                        <select class=\"form-control\" id=\"Sexo\" value='"+sexo+"' name=\"sexo\">\n" +
"                          <option>MASCULINO</option>\n" +
"                          <option>FEMENINO</option>\n" +
"                        </select>\n" +
"                    </div>\n" +
"                </div></br></br>\n" +
"\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                      <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-phone bigicon\"></i></span>\n" +
"\n" +
"                      <div class=\"col-md-6 col-xs-10\">\n" +
"                          <input id=\"Telefono\" name=\"telefono\" value='"+telefono+"' placeholder=\"Teléfono\" class=\"form-control\" required>\n" +
"                      </div>\n" +
"                </div></br></br>\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                      <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-envelope-o bigicon\"></i></span>\n" +
"\n" +
"                      <div class=\"col-md-6 col-xs-10\">\n" +
"                          <input id=\"E_mail\" name=\"correo\" value='"+correo+"' placeholder=\"E-Mail\" type=\"Email\" class=\"form-control\" required>\n" +
"                      </div>\n" +
"                </div></br></br>\n" +
"\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                      <span class=\"col-md-1 col-xs-1 col-md-offset-2 text-center\"><i class=\"fa fa-home bigicon\"></i></span>\n" +
"\n" +
"                      <div class=\"col-md-6 col-xs-10\">\n" +
"                          <input id=\"Direccion\" name=\"direccion\" value='"+direccion+"' placeholder=\"dirección\" class=\"form-control\" required>\n" +
"                      </div>\n" +
"                </div></br></br>\n" +
"\n" +
"                <div class=\"form-group\">\n" +
"                      <div class=\"col-md-12 text-center\">\n" +
"                          <input type=\"submit\" style=\"width:80px\" class=\"btn btn-success\" align=\"center\" class=\"form-control\" value=\"Guardar\">\n" +
"                          <button type=\"reset\" style=\"width:80px\" class=\"btn btn-primary\" class=\"form-control\" >Limpiar</button>\n" +
"\n" +
"                      </div>\n" +
"                </div></br></br>";
                 
             } 
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
