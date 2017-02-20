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
@WebServlet(urlPatterns = {"/Recuperar_Horario"})
public class Recuperar_Horario extends HttpServlet {

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
            String Especialidad = request.getParameter("Especialidad").trim();
            Calendar now = Calendar.getInstance();
                    
	
            int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
            int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
            
            String[] Dias = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
            String Datos_Enviar = "<table class='table-responsive table-bordered table-hover'><tr><th>Hora</th>";
            
            String[] Lunes = new String[]{"","","","","","","","","","","","","","","","","","","","","","","",""};
            String[] Martes = new String[]{"","","","","","","","","","","","","","","","","","","","","","","",""};
            String[] Miercoles = new String[]{"","","","","","","","","","","","","","","","","","","","","","","",""};
            String[] Jueves = new String[]{"","","","","","","","","","","","","","","","","","","","","","","",""};
            String[] Viernes = new String[]{"","","","","","","","","","","","","","","","","","","","","","","",""};
            String[] Sabado = new String[]{"","","","","","","","","","","","","","","","","","","","","","","",""};
            
            for(int i=0;i<7;i++)
            {
               now.add(Calendar.DAY_OF_WEEK, 1);
               int Nro_Dia = now.get(Calendar.DAY_OF_WEEK);
               if(Nro_Dia!=1)
               {
                   Datos_Enviar += "<th>"+Dias[Nro_Dia-1]+"</th>";
               }
            }   
            
            Datos_Enviar+="</tr>";
            
            Cookie[] MyCookies = request.getCookies();
            String DNI = MyCookies[1].getValue().toString();
            cmongo Conexion = new cmongo();
            
            //Recuperar el medico de la especialidad
            DBCursor Cursor = Conexion.Registro(new String[]{"especialidad_codigo"}, new String[]{Especialidad}, "Medicos");
             while(Cursor.hasNext()) {
                 BasicDBObject obj = (BasicDBObject) Cursor.next();
                 String Medico = obj.getString("idmedico");
                 
                 //Recuperar los Horarios_Medico
                  DBCursor Cursor2 = Conexion.Registro(new String[]{"ID MEDICO"}, new String[]{Medico}, "HorarioMedico");
                    while(Cursor2.hasNext()) {
                    BasicDBObject obj2 = (BasicDBObject) Cursor2.next();
                    String Id_Horario = obj2.getString("ID HORARIO");
                    String Estado = obj2.getString("ESTADO");
                    
                    //Recuperar cada horario
                      
                        DBCursor Cursor3 = Conexion.Registro(new String[]{"ID HORARIO"}, new String[]{Id_Horario}, "Horarios");
                        while(Cursor3.hasNext()) {
                            BasicDBObject obj3 = (BasicDBObject) Cursor3.next();
                            
                            if(obj3.getString("DIA").equals("1"))
                            {
                                if(Estado.equals("DISPONIBLE"))
                                {
                                    Lunes[Integer.parseInt(obj3.getString("HORA INICIO"))] = "DISPONIBLE";
                                }else
                                {
                                    Lunes[Integer.parseInt(obj3.getString("HORA INICIO"))] = "RESERVADO";
                                }
                                
                            }
                            if(obj3.getString("DIA").equals("2"))
                            {
                                if(Estado.equals("DISPONIBLE"))
                                {
                                    Martes[Integer.parseInt(obj3.getString("HORA INICIO"))] = "DISPONIBLE";
                                }else
                                {
                                    Martes[Integer.parseInt(obj3.getString("HORA INICIO"))] = "RESERVADO";
                                }
                            }
                            if(obj3.getString("DIA").equals("3"))
                            {
                                if(Estado.equals("DISPONIBLE"))
                                {
                                    Miercoles[Integer.parseInt(obj3.getString("HORA INICIO"))] = "DISPONIBLE";
                                }else
                                {
                                    Miercoles[Integer.parseInt(obj3.getString("HORA INICIO"))] = "RESERVADO";
                                }
                            }
                            if(obj3.getString("DIA").equals("4"))
                            {
                                if(Estado.equals("DISPONIBLE"))
                                {
                                    Jueves[Integer.parseInt(obj3.getString("HORA INICIO"))] = "DISPONIBLE";
                                }else
                                {
                                    Jueves[Integer.parseInt(obj3.getString("HORA INICIO"))] = "RESERVADO";
                                }
                            }
                            if(obj3.getString("DIA").equals("5"))
                            {
                                if(Estado.equals("DISPONIBLE"))
                                {
                                    Viernes[Integer.parseInt(obj3.getString("HORA INICIO"))] = "DISPONIBLE";
                                }else
                                {
                                    Viernes[Integer.parseInt(obj3.getString("HORA INICIO"))] = "RESERVADO";
                                }
                            }
                            if(obj3.getString("DIA").equals("6"))
                            {
                                if(Estado.equals("DISPONIBLE"))
                                {
                                    Sabado[Integer.parseInt(obj3.getString("HORA INICIO"))] = "DISPONIBLE";
                                }else
                                {
                                    Sabado[Integer.parseInt(obj3.getString("HORA INICIO"))] = "RESERVADO";
                                }
                            }
                        }
                    
                    }
             }
             
             for(int i =7;i<20;i++)
             {
                 Datos_Enviar+= "<tr><td>"+((i<10)?"0"+i:i)+":00"+"</td>"+((Lunes[i].equals("DISPONIBLE"))?"<td value='"+"1-"+i+"' class='Hora_Cita_Libre'>DISPONIBLE</td>":(((Lunes[i].equals("RESERVADO"))?"<td class='Hora_Cita_Ocupado'>RESERVADO</td>":"<td class='Hora_Cita_Ocupado'></td>"))).toString()+
                         ((Martes[i].equals("DISPONIBLE"))?"<td value='"+"1-"+i+"' class='Hora_Cita_Libre'>DISPONIBLE</td>":(((Martes[i].equals("RESERVADO"))?"<td class='Hora_Cita_Ocupado'>RESERVADO</td>":"<td class='Hora_Cita_Ocupado'></td>"))).toString()+
                         ((Miercoles[i].equals("DISPONIBLE"))?"<td value='"+"1-"+i+"' class='Hora_Cita_Libre'>DISPONIBLE</td>":(((Miercoles[i].equals("RESERVADO"))?"<td class='Hora_Cita_Ocupado'>RESERVADO</td>":"<td class='Hora_Cita_Ocupado'></td>"))).toString()+
                         ((Jueves[i].equals("DISPONIBLE"))?"<td value='"+"1-"+i+"' class='Hora_Cita_Libre'>DISPONIBLE</td>":(((Jueves[i].equals("RESERVADO"))?"<td class='Hora_Cita_Ocupado'>RESERVADO</td>":"<td class='Hora_Cita_Ocupado'></td>"))).toString()+
                         ((Viernes[i].equals("DISPONIBLE"))?"<td value='"+"1-"+i+"' class='Hora_Cita_Libre'>DISPONIBLE</td>":(((Viernes[i].equals("RESERVADO"))?"<td class='Hora_Cita_Ocupado'>RESERVADO</td>":"<td class='Hora_Cita_Ocupado'></td>"))).toString()+
                         ((Sabado[i].equals("DISPONIBLE"))?"<td value='"+"1-"+i+"' class='Hora_Cita_Libre'>DISPONIBLE</td>":(((Sabado[i].equals("RESERVADO"))?"<td class='Hora_Cita_Ocupado'>RESERVADO</td>":"<td class='Hora_Cita_Ocupado'></td>"))).toString()+"</tr>";
             }
            
             Datos_Enviar+="</table>";
             
             
             DBCursor Cursor2 = Conexion.Registro(new String[]{"DNI"}, new String[]{DNI}, "Usuarios");
             while(Cursor2.hasNext()) {
                 BasicDBObject obj = (BasicDBObject) Cursor2.next();
                 String Estado = obj.getString("ESTADO");
                 
                 if(!Estado.equals("Habilitado"))
                    {
                        Datos_Enviar = "<h1>Solo se puede hacer una reserva a la vez</h1>";
                    }
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
