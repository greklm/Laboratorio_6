package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_005fSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        \r\n");
      out.write("body {\r\n");
      out.write("\tbackground: #eaeaea;\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("\tfont: 100%/1.5em sans-serif;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 { margin: 0; }\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover { color: #1dabb8; }\r\n");
      out.write("\r\n");
      out.write("fieldset {\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tfont-family: inherit;\r\n");
      out.write("\tfont-size: inherit;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\t-webkit-appearance: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"submit\"] { cursor: pointer; }\r\n");
      out.write("\r\n");
      out.write(".clearfix { *zoom: 1; }\r\n");
      out.write(".clearfix:before, .clearfix:after {\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\tdisplay: table;\t\r\n");
      out.write("}\r\n");
      out.write(".clearfix:after { clear: both; }\r\n");
      out.write("\r\n");
      out.write("/* ---------- LOGIN-FORM ---------- */\r\n");
      out.write("\r\n");
      out.write("#login-form {\r\n");
      out.write("\tmargin: 50px auto;\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form h1 {\r\n");
      out.write("\tbackground-color: #282830;\r\n");
      out.write("\tborder-radius: 5px 5px 0 0;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form fieldset {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tborder-radius: 0 0 5px 5px;\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form fieldset:before {\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\theight: 8px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin: -4px 0 0 -4px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\t-webkit-transform: rotate(45deg);\r\n");
      out.write("\t-moz-transform: rotate(45deg);\r\n");
      out.write("\t-ms-transform: rotate(45deg);\r\n");
      out.write("\t-o-transform: rotate(45deg);\r\n");
      out.write("\ttransform: rotate(45deg);\r\n");
      out.write("\twidth: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form input {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form input[type=\"text\"],\r\n");
      out.write("#login-form input[type=\"password\"] {\r\n");
      out.write("\tborder: 1px solid #dcdcdc;\r\n");
      out.write("\tpadding: 12px 10px;\r\n");
      out.write("\twidth: 238px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form input[type=\"text\"] {\r\n");
      out.write("\tborder-radius: 3px 3px 0 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form input[type=\"password\"] {\r\n");
      out.write("\tborder-top: none;\r\n");
      out.write("\tborder-radius: 0px 0px 3px 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form input[type=\"submit\"] {\r\n");
      out.write("\tbackground: #1dabb8;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login-form input[type=\"submit\"]:hover { background: #198d98; }\r\n");
      out.write("\r\n");
      out.write("#login-form footer {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tmargin-top: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".info {\r\n");
      out.write("\tbackground: #e5e5e5;\r\n");
      out.write("\tborder-radius: 50%;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\tline-height: 20px;\r\n");
      out.write("\tmargin: 0 10px 0 0;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"login-form\">\r\n");
      out.write("\r\n");
      out.write("        <h1>Inicio de Sesión</h1>\r\n");
      out.write("\r\n");
      out.write("        <fieldset>\r\n");
      out.write("\r\n");
      out.write("            <form action=\"Comprobar_Usuario\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("                <input id=\"DNI\" name=\"DNI\" type=\"text\" required value=\"Usuario\"> <!-- JS because of IE support; better: placeholder=\"Email\" -->\r\n");
      out.write("\r\n");
      out.write("                <input id=\"Password\" name=\"Password\" type=\"password\" required value=\"Password\" onBlur=\"if(this.value=='')this.value='Password'\" onFocus=\"if(this.value=='Password')this.value='' \"> <!-- JS because of IE support; better: placeholder=\"Password\" -->\r\n");
      out.write("\r\n");
      out.write("                <input href=\"\" type=\"submit\" value=\"Ingresar\">\r\n");
      out.write("\r\n");
      out.write("                <footer class=\"clearfix\">\r\n");
      out.write("                    <p><span class=\"info\">?</span><a href=\"#\">¿Olvidaste tu contraseña?</a></p>\r\n");
      out.write("\r\n");
      out.write("                </footer>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </fieldset>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end login-form -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
