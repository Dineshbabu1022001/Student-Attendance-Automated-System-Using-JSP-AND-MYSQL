package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Student Attendance Automated System</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/arial.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cuf_run.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("          <h2 align=\"center\">            \n");
      out.write("                STUDENT ATTENDANCE AUTOMATED SYSTEM\n");
      out.write("        </h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"AdminLogin.jsp\">Admin</a></li>\n");
      out.write("            <li><a href=\"StaffLogin.jsp\">Staffs</a></li>\n");
      out.write("            <li><a href=\"StudentLogin.jsp\">Students</a></li>\n");
      out.write("            <li><a href=\"About.jsp\">About us</a></li>\n");
      out.write("            <li class=\"last\"><a href=\"Contact.jsp\">Contact us</a></li>            \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"header_img\"> \n");
      out.write("          <img src=\"images/college.png\" alt=\"\" width=\"395\" height=\"180\" />\n");
      out.write("          <img src=\"images/psna.jpg\" alt=\"\" width=\"395\" height=\"180\" />\n");
      out.write("          <img src=\"images/3.jpg\" alt=\"\" width=\"395\" height=\"180\" />\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"clr\"></div>\n");
      out.write("  <div class=\"content\">\n");
      out.write("    <div class=\"content_resize\">\n");
      out.write("      <div class=\"mainbar\">\n");
      out.write("        <div class=\"article\">\n");
      out.write("          <h2><span>Student Attendance Portal</span></h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <img src=\"images/logo.png\" width=\"200\" height=\"180\" alt=\"\" />\n");
      out.write("          \n");
      out.write("          <form name=\"form1\" method=\"post\" action=\"AdminLogin.jsp\">\n");
      out.write("               <table border=\"0 \" align=\"center\" cellpadding=\"5\" cellspacing=\"6\">\n");
      out.write("               <tr>\n");
      out.write("               <td colspan=\"2\" style=\"text-align:center;color: deeppink;font-weight: bold;font-size: x-large;\">\n");
      out.write("                    Administrator Login\n");
      out.write("               </td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("               <td>Username</td>\n");
      out.write("               <td><input type=\"text\" name=\"t1\"/></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("               <td>Password</td>\n");
      out.write("               <td><input type=\"password\" name=\"t2\"/></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                   <td></td>\n");
      out.write("                   <td>\n");
      out.write("                       <input type=\"submit\" name=\"s1\" value=\"Login\"/>\n");
      out.write("                   <input type=\"reset\" name=\"s2\" value=\"Clear\"/>\n");
      out.write("                   </td>\n");
      out.write("               </tr>\n");
      out.write("               </table>\n");
      out.write("               </form>\n");
      out.write("               ");

                   if(request.getParameter("s1")!=null){
                       String uid=request.getParameter("t1");
                       String pwd=request.getParameter("t2");
                       if(uid.equals("Admin") && pwd.equals("Admin")){
                           session.setAttribute("userid", "Admin");
                           response.sendRedirect("AdminHome.jsp");
                       }
                       else{
                           out.println("<center><span style='color:red;font-size:medium;'>Your login attempt was not successful. Please try again.</span></center>");
                       }
                   }
               
      out.write("\n");
      out.write("               <br/><br/><br/>\n");
      out.write("        </div>     \n");
      out.write("      </div>      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"fbg\">    \n");
      out.write("    <div class=\"footer\">\n");
      out.write("      <p class=\"lf\">&copy; Copyright <a href=\"#\">Student Attendance Portal Team</a>.</p>\n");
      out.write("       <p class=\"rf\">Developed By<a href=\"https://www.psnacet.edu.in//\">&nbsp;PSNA</a></p>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
