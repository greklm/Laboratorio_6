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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("body {\n");
      out.write("\tbackground: #eaeaea;\n");
      out.write("\tcolor: #999;\n");
      out.write("\tfont: 100%/1.5em sans-serif;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 { margin: 0; }\n");
      out.write("\n");
      out.write("a {\n");
      out.write("\tcolor: #999;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover { color: #1dabb8; }\n");
      out.write("\n");
      out.write("fieldset {\n");
      out.write("\tborder: none;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input {\n");
      out.write("\tborder: none;\n");
      out.write("\tfont-family: inherit;\n");
      out.write("\tfont-size: inherit;\n");
      out.write("\tmargin: 0;\n");
      out.write("\toutline: none;\n");
      out.write("\t-webkit-appearance: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"] { cursor: pointer; }\n");
      out.write("\n");
      out.write(".clearfix { *zoom: 1; }\n");
      out.write(".clearfix:before, .clearfix:after {\n");
      out.write("\tcontent: \"\";\n");
      out.write("\tdisplay: table;\t\n");
      out.write("}\n");
      out.write(".clearfix:after { clear: both; }\n");
      out.write("\n");
      out.write("/* ---------- LOGIN-FORM ---------- */\n");
      out.write("\n");
      out.write("#login-form {\n");
      out.write("\tmargin: 50px auto;\n");
      out.write("\twidth: 300px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form h1 {\n");
      out.write("\tbackground-color: #282830;\n");
      out.write("\tborder-radius: 5px 5px 0 0;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tpadding: 20px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form fieldset {\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tborder-radius: 0 0 5px 5px;\n");
      out.write("\tpadding: 20px;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form fieldset:before {\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\tcontent: \"\";\n");
      out.write("\theight: 8px;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tmargin: -4px 0 0 -4px;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\t-webkit-transform: rotate(45deg);\n");
      out.write("\t-moz-transform: rotate(45deg);\n");
      out.write("\t-ms-transform: rotate(45deg);\n");
      out.write("\t-o-transform: rotate(45deg);\n");
      out.write("\ttransform: rotate(45deg);\n");
      out.write("\twidth: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form input {\n");
      out.write("\tfont-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form input[type=\"text\"],\n");
      out.write("#login-form input[type=\"password\"] {\n");
      out.write("\tborder: 1px solid #dcdcdc;\n");
      out.write("\tpadding: 12px 10px;\n");
      out.write("\twidth: 238px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form input[type=\"text\"] {\n");
      out.write("\tborder-radius: 3px 3px 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form input[type=\"password\"] {\n");
      out.write("\tborder-top: none;\n");
      out.write("\tborder-radius: 0px 0px 3px 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form input[type=\"submit\"] {\n");
      out.write("\tbackground: #1dabb8;\n");
      out.write("\tborder-radius: 3px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfloat: right;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\tpadding: 12px 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-form input[type=\"submit\"]:hover { background: #198d98; }\n");
      out.write("\n");
      out.write("#login-form footer {\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tmargin-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info {\n");
      out.write("\tbackground: #e5e5e5;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\theight: 20px;\n");
      out.write("\tline-height: 20px;\n");
      out.write("\tmargin: 0 10px 0 0;\n");
      out.write("\ttext-align: center;\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <div id=\"login-form\">\n");
      out.write("\n");
      out.write("        <h1>Inicio de Sesión</h1>\n");
      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("\n");
      out.write("            <form action=\"Comprobar_Usuario\" method=\"get\">\n");
      out.write("\n");
      out.write("                <input id=\"DNI\" name=\"DNI\" type=\"text\" required value=\"Usuario\"> <!-- JS because of IE support; better: placeholder=\"Email\" -->\n");
      out.write("\n");
      out.write("                <input id=\"Password\" name=\"Password\" type=\"password\" required value=\"Password\" onBlur=\"if(this.value=='')this.value='Password'\" onFocus=\"if(this.value=='Password')this.value='' \"> <!-- JS because of IE support; better: placeholder=\"Password\" -->\n");
      out.write("\n");
      out.write("                <input href=\"\" type=\"submit\" value=\"Ingresar\">\n");
      out.write("\n");
      out.write("                <footer class=\"clearfix\">\n");
      out.write("                    <p><span class=\"info\">?</span><a href=\"#\">¿Olvidaste tu contraseña?</a></p>\n");
      out.write("\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </fieldset>\n");
      out.write("\n");
      out.write("    </div> <!-- end login-form -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
