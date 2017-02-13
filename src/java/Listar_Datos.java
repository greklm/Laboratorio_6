/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.cmongo;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GREG-PC
 */
@WebServlet(urlPatterns = {"/Listar_Datos"})
public class Listar_Datos extends HttpServlet {

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
        String Coleccion = request.getParameter("Coleccion").trim();
        String[] Atributos = request.getParameter("Atributos").split(",");
        cmongo Conexion = new cmongo();
        DBCollection Info = Conexion.Documentos(Coleccion);
        
        DBCursor Datos = Info.find();
        
        String Datos_Enviar =" <thead><tr>";
        for(int i=0;i<Atributos.length;i++)
            {
                Datos_Enviar += "<th>"+Atributos[i]+"</th>";
            }
        Datos_Enviar += "<th>Operaciones</th></tr> </thead>";
        
         while(Datos.hasNext()) {
            BasicDBObject obj = (BasicDBObject) Datos.next();
            String Linea="<tbody><tr>";
            String Valores = "";
            for(int i=0;i<Atributos.length;i++)
            {
                Linea += "<td>"+obj.getString(Atributos[i])+"</td>";
                Valores += obj.getString(Atributos[i])+",";
            }
            Linea +="<td><button type='button' class='btn btn-danger btn_Eliminar' value='"+Atributos[0]+","+obj.getString(Atributos[0])+"'>Eliminar</button><button type='button' style='width:80px' class='btn btn-success btn_Editar' value='"+Valores.substring(0,Valores.length()-1)+"'>Editar</button></td></tr></tbody>";
            Datos_Enviar += Linea;
         }
         
        response.setContentType("text/plain");
        
	response.getWriter().write(Datos_Enviar);
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
        
        String Coleccion = request.getParameter("Coleccion").trim();
        String[] Atributos = request.getParameter("Atributos").split(",");
        cmongo Conexion = new cmongo();
        DBCollection Info = Conexion.Documentos(Coleccion);
        
        DBCursor Datos = Info.find();
        
        String Datos_Enviar ="<tr>";
        for(int i=0;i<Atributos.length;i++)
            {
                Datos_Enviar += "<th>"+Atributos[i]+"</th>";
            }
        Datos_Enviar += "</tr>";
        
         while(Datos.hasNext()) {
            BasicDBObject obj = (BasicDBObject) Datos.next();
            String Linea="<tr>";
            
            for(int i=0;i<Atributos.length;i++)
            {
                Linea += "<td>"+obj.getString(Atributos[i])+"</td>";
            }
            Linea +="</tr>";
            Datos_Enviar += Linea;
         }
         

        response.setContentType("text/plain");
        

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
