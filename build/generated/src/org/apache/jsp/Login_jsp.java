package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("     <head>\r\n");
      out.write("\r\n");
      out.write("          <meta charset=\"utf-8\">\r\n");
      out.write("          <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("          <meta name=\"description\" content=\"\">\r\n");
      out.write("          <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("          <title>Rumours Group Login</title>\r\n");
      out.write("\r\n");
      out.write("          <!-- Bootstrap Core CSS -->\r\n");
      out.write("          <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("          <!-- MetisMenu CSS -->\r\n");
      out.write("          <link href=\"css/plugins/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Timeline CSS -->\r\n");
      out.write("          <link href=\"css/plugins/timeline.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Custom CSS -->\r\n");
      out.write("          <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Morris Charts CSS -->\r\n");
      out.write("          <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Custom Fonts -->\r\n");
      out.write("          <link href=\"css/font-awesome/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("          <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("          <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("          <!--[if lt IE 9]>\r\n");
      out.write("              <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("              <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("          <![endif]-->\r\n");
      out.write("\r\n");
      out.write("     </head>\r\n");
      out.write("\r\n");
      out.write("     <body>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("               <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("                         <div class=\"login-panel panel panel-default\">\r\n");
      out.write("                              <div class=\"panel-heading\">\r\n");
      out.write("                                   <h3 class=\"panel-title\">Sign In</h3>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"panel-body\">\r\n");
      out.write("                                   <form action=\"User_DashBoard.jsp\" method=\"Post\">\r\n");
      out.write("                                        <fieldset>\r\n");
      out.write("                                             <div class=\"form-group\">\r\n");
      out.write("                                                  <input class=\"form-control\" placeholder=\"E-mail\" name=\"email\" type=\"email\" autofocus>\r\n");
      out.write("                                             </div>\r\n");
      out.write("                                             <div class=\"form-group\">\r\n");
      out.write("                                                  <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\r\n");
      out.write("                                             </div>\r\n");
      out.write("                                             <div>\r\n");
      out.write("                                                  <label>\r\n");
      out.write("                                                       <a href=\"Register.jsp\" align = \"Right\">Register As Member</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp    \r\n");
      out.write("                                                       <a href=\"Forgot.jsp\" align = \"Left\">Forgot Password</a>\r\n");
      out.write("                                                  </label>\r\n");
      out.write("                                             </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                             <!-- Change this to a button or input when using this as a form -->\r\n");
      out.write("                                             <input type=\"Submit\" name=\"Login\" value=\"Submit\">\r\n");
      out.write("                                        </fieldset>\r\n");
      out.write("                                   </form>\r\n");
      out.write("                              </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("               </div>\r\n");
      out.write("          </div>  </form>\r\n");
      out.write("\r\n");
      out.write("     <!-- jQuery Version 1.11.0 -->\r\n");
      out.write("     <script src=\"js/jquery-1.11.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("     <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("     <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("     <!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("     <script src=\"js/metisMenu/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("     <!-- Custom Theme JavaScript -->\r\n");
      out.write("     <script src=\"js/sb-admin-2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
