package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fDashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("Relation Is Fav Between ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("     <head>\r\n");
      out.write("\r\n");
      out.write("          <meta charset=\"utf-8\">\r\n");
      out.write("          <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("          <meta name=\"description\" content=\"\">\r\n");
      out.write("          <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("          <title>Welcome UserName</title>         <!---I Have To Show UserName Using request.getParameter()---!>\r\n");
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
      out.write("     <body>\r\n");
      out.write("\r\n");
      out.write("          <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("               <!-- Navigation -->\r\n");
      out.write("               <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                         <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                              <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                              <span class=\"icon-bar\"></span>\r\n");
      out.write("                              <span class=\"icon-bar\"></span>\r\n");
      out.write("                              <span class=\"icon-bar\"></span>\r\n");
      out.write("                         </button>\r\n");
      out.write("                         <a class=\"navbar-brand\" href=\"index.html\">Rumours Group</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.navbar-header -->\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("                         <li class=\"dropdown\">\r\n");
      out.write("                              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                                   <i class=\"fa fa-envelope fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                              </a>\r\n");
      out.write("                              <ul class=\"dropdown-menu dropdown-messages\">\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a href=\"#\">\r\n");
      out.write("                                             <div>\r\n");
      out.write("                                                  <strong>Sender Name</strong>         <!--- I Have To Show The UserName Of Sender But Using For Loop Whole \r\n");
      out.write("                                                                                                                                  Message Must Be Maintained---!--->\r\n");
      out.write("                                                  <span class=\"pull-right text-muted\">\r\n");
      out.write("                                                       <em>Time Of Sending</em>\r\n");
      out.write("                                                  </span>\r\n");
      out.write("                                             </div>\r\n");
      out.write("                                             <div>Message / Notification Data</div>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("\r\n");
      out.write("                                   <li class=\"divider\"></li>\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                             <strong>Read All Messages Link I Have To Give</strong>\r\n");
      out.write("                                             <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                              </ul>\r\n");
      out.write("                              <!-- /.dropdown-messages -->\r\n");
      out.write("                         </li>\r\n");
      out.write("                         <!-- /.dropdown-tasks -->\r\n");
      out.write("                         </li>\r\n");
      out.write("                         <!-- /.dropdown -->\r\n");
      out.write("                         <li class=\"dropdown\">\r\n");
      out.write("                              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                                   <i class=\"fa fa-bell fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                              </a>\r\n");
      out.write("                              <ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("                                   <li class=\"divider\"></li>\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                             <strong>See All Alerts</strong>\r\n");
      out.write("                                             <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                              </ul>\r\n");
      out.write("                              <!-- /.dropdown-alerts -->\r\n");
      out.write("                         </li>\r\n");
      out.write("                         <!-- /.dropdown -->\r\n");
      out.write("                         <li class=\"dropdown\">\r\n");
      out.write("                              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                                   <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                              </a>\r\n");
      out.write("                              <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("                                   <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li class=\"divider\"></li>\r\n");
      out.write("                                   <li><a href=\"Login.jsp\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                              </ul>\r\n");
      out.write("                              <!-- /.dropdown-user -->\r\n");
      out.write("                         </li>\r\n");
      out.write("                         <!-- /.dropdown -->\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.navbar-top-links -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("                         <div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("                              <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                                   <li class=\"sidebar-search\">\r\n");
      out.write("                                        <div class=\"input-group custom-search-form\">\r\n");
      out.write("                                             <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("                                             <span class=\"input-group-btn\">\r\n");
      out.write("                                                  <button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("                                                       <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                                  </button>\r\n");
      out.write("                                             </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- /input-group -->\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a href=\"User_DashBoard.jsp\"><i class=\"fa fa-dashboard fa-fw\"></i> Dashboard Home</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a href=\"Report.jsp\"><i class=\"fa fa-table fa-fw\"></i> Report Generation</a>\r\n");
      out.write("                                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                             <li>\r\n");
      out.write("                                                  <a href=\"RecentBook.jsp\">Recent Books</a>\r\n");
      out.write("                                             </li>\r\n");
      out.write("                                             <li>\r\n");
      out.write("                                                  <a href=\"Transaction.jsp\">Transaction </a>\r\n");
      out.write("                                             </li>\r\n");
      out.write("                                             <li>\r\n");
      out.write("                                                  <a href=\"Fine_Transaction.jsp\">Fine</a>\r\n");
      out.write("                                             </li>\r\n");
      out.write("                                             <li>\r\n");
      out.write("                                                  <a href=\"Cash_Transaction.jsp\">Cash Transaction</a>\r\n");
      out.write("                                             </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a href=\"Profile.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Profile</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a href=\"Fav_Book.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Fav_Book</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a href=\"Suggest.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Suggestion</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a href=\"Rules.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Rules And Regulation</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                                   <li>\r\n");
      out.write("                                        <a href=\"Disposal.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Disposal</a>\r\n");
      out.write("                                   </li>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <!-- /.sidebar-collapse -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.navbar-static-side -->\r\n");
      out.write("               </nav>\r\n");
      out.write("\r\n");
      out.write("               <!-- Page Content -->\r\n");
      out.write("               <div id=\"page-wrapper\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                         <div class=\"col-lg-12\">\r\n");
      out.write("                              <h1 class=\"page-header\">User Name</h1><!---I Need To Show The User Name Here--->\r\n");
      out.write("                         </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                         <div class=\"panel panel-default\">\r\n");
      out.write("                              <div class=\"panel-heading\">\r\n");
      out.write("                                   Recent Books Detail\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <!-- /.panel-heading -->\r\n");
      out.write("                              <div class=\"panel-body\">\r\n");
      out.write("                                   <div class=\"table-responsive\"><!---Use For Loop For Data Setting--->\r\n");
      out.write("                                        <table class=\"table\">\r\n");
      out.write("                                             <thead>\r\n");
      out.write("                                                  <tr>\r\n");
      out.write("                                                       <th>Amt_Deposite</th>              <!---Using For Loop I Make A Table Of 5 Set Only--->\r\n");
      out.write("                                                       <th>Due_Date</th>\r\n");
      out.write("                                                       <th>Issue_Date</th>\r\n");
      out.write("                                                       <th>Book_Name</th>\r\n");
      out.write("                                                       <th>Book_Id</th>\r\n");
      out.write("                                                  </tr>\r\n");
      out.write("                                             </thead>\r\n");
      out.write("                                             <tbody>\r\n");
      out.write("                                                  <tr>\r\n");
      out.write("                                                       <td>500</td>\r\n");
      out.write("                                                       <td>27-May 2016</td>\r\n");
      out.write("                                                       <td>27-Dec 2015</td>\r\n");
      out.write("                                                       <td>Data_Structure</td>\r\n");
      out.write("                                                       <td>001</td>\r\n");
      out.write("                                                  </tr>\r\n");
      out.write("                                             </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <!-- /.panel-body -->\r\n");
      out.write("                         </div>   \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!---Here New Books Arrival Data Will Be Shown---->\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                         <div class=\"col-lg-6\">\r\n");
      out.write("                              <div class=\"panel panel-default\">\r\n");
      out.write("                                   <div class=\"panel-heading\">\r\n");
      out.write("                                        New Books Arrival\r\n");
      out.write("                                   </div>\r\n");
      out.write("                                   <!-- /.panel-heading -->\r\n");
      out.write("                                   <div class=\"panel-body\">\r\n");
      out.write("                                        <div class=\"table-responsive\">\r\n");
      out.write("                                             <table class=\"table table-hover\">\r\n");
      out.write("                                                  <thead>\r\n");
      out.write("                                                       <tr>\r\n");
      out.write("                                                            <th>Price</th>\r\n");
      out.write("                                                            <th>Rating</th>\r\n");
      out.write("                                                            <th>Author</th>\r\n");
      out.write("                                                            <th>Publisher</th>\r\n");
      out.write("                                                            <th>Book_Name</th>\r\n");
      out.write("                                                       </tr>\r\n");
      out.write("                                                  </thead>\r\n");
      out.write("                                                  <tbody>\r\n");
      out.write("                                                       <tr>\r\n");
      out.write("                                                            <td>200</td>\r\n");
      out.write("                                                            <td>4.0/5.0</td>\r\n");
      out.write("                                                            <td>Mudit_Khetan</td>\r\n");
      out.write("                                                            <td>Jnu Jaipur</td>\r\n");
      out.write("                                                            <td>Data Structure Using C</td>\r\n");
      out.write("                                                       </tr>\r\n");
      out.write("                                                  </tbody>\r\n");
      out.write("                                             </table>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- /.table-responsive -->\r\n");
      out.write("                                   </div>\r\n");
      out.write("                                   <!-- /.panel-body -->\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <!-- /.panel -->\r\n");
      out.write("                         </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!---Quotes Of Day Div--->\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                         <div class=\"panel panel-success\">\r\n");
      out.write("                              <div class=\"panel-heading\">\r\n");
      out.write("                                   Quotes of Day\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"panel-body\">\r\n");
      out.write("                                   <p>.Life Is Precious Gift Of God Don't Waste It</p>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"panel-footer\">\r\n");
      out.write("                                   Rumour's Group Of Science@\r\n");
      out.write("                              </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!---New Magzines And Basic Information Changes Link Div--->\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                         <div class=\"panel panel-info\">\r\n");
      out.write("                              <div class=\"panel-heading\">\r\n");
      out.write("                                   Info Panel\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"panel-body\">\r\n");
      out.write("                                   <td>\r\n");
      out.write("                                   <th>Name Of Magzine</th>\r\n");
      out.write("                                   <th>Link Of Magzine</th>\r\n");
      out.write("                                   </td>\r\n");
      out.write("                                   <td>\r\n");
      out.write("                                   <th>Kishan Kumar</th>\r\n");
      out.write("                                   <th>Kiss.com</th>\r\n");
      out.write("                                   </td>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"panel-footer\">\r\n");
      out.write("                                   Rumours Group Of Science@\r\n");
      out.write("                              </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("               <!-- jQuery Version 1.11.0 -->\r\n");
      out.write("               <script src=\"js/jquery-1.11.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("               <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("               <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("               <!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("               <script src=\"js/metisMenu/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("               <!-- Morris Charts JavaScript -->\r\n");
      out.write("               <script src=\"js/raphael/raphael.min.js\"></script>\r\n");
      out.write("               <script src=\"js/morris/morris.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("               <!-- Custom Theme JavaScript -->\r\n");
      out.write("               <script src=\"js/sb-admin-2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("     </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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