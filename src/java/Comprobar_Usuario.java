/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.cmongo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
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
@WebServlet(urlPatterns = {"/Comprobar_Usuario"})
public class Comprobar_Usuario extends HttpServlet {

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
           String DNI = request.getParameter("DNI").trim();
           String Password = request.getParameter("Password").trim();
            //response.sendRedirect("index_Admi.html");
        
           cmongo Conexion = new cmongo();
           DBCollection Info = Conexion.Documentos("Usuarios");
           DBCursor Datos = Info.find();
           String Respuesta = "";
            while(Datos.hasNext()) {
                BasicDBObject obj = (BasicDBObject) Datos.next();
                String Estado = obj.getString("ESTADO").toString();
                if(DNI.equals(obj.getString("DNI").toString()))
                {
                    if(Password.equals(obj.getString("PASSWORD").toString()))
                    {
                        if(obj.getString("TIPO").equals("Admin"))
                        {
                            Cookie C_dni = new Cookie("DNI", DNI);
                            C_dni.setMaxAge(3600);
                            Cookie C_Estado = new Cookie("Estado",Estado);
                            C_Estado.setMaxAge(3600);
                            response.addCookie(C_dni);
                            response.addCookie(C_Estado);
                            Respuesta = "index_Admi.html";
                            break;
                            
                        }else if(obj.getString("TIPO").equals("Paciente"))
                        {
                            Cookie C_dni = new Cookie("DNI", DNI);
                            C_dni.setMaxAge(3600);
                            Cookie C_Estado = new Cookie("Estado",Estado);
                            C_Estado.setMaxAge(3600);
                            response.addCookie(C_dni);
                            response.addCookie(C_Estado);
                            Respuesta = "index.html";
                            
                            break;
                        }
                        else if(obj.getString("TIPO").equals("Medico"))
                        {
                            Cookie C_dni = new Cookie("DNI", DNI);
                            C_dni.setMaxAge(3600);
                            Cookie C_Estado = new Cookie("Estado",Estado);
                            C_Estado.setMaxAge(3600);
                            response.addCookie(C_dni);
                            response.addCookie(C_Estado);
                            Respuesta = "index_Medico.jsp";
                            break;
                        }
                       
                    }else
                    {
                        Respuesta = "Inicio_Sesion.jsp";
                        //response.sendRedirect("Inicio_Sesion.jsp");
                    }
                }else
                {
                    Respuesta = "Inicio_Sesion.jsp";
                }
             }            
                response.sendRedirect(Respuesta);
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
