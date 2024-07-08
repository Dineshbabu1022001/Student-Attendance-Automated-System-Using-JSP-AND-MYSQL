package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <li class=\"active\"><a href=\"StaffRegistration.jsp\">Staff Registration</a></li>\n");
      out.write("            <li><a href=\"StudentRegistration.jsp\">Student Registration</a></li>\n");
      out.write("            <li><a href=\"ViewStaffs.jsp\">View Staffs</a></li>\n");
      out.write("            <li><a href=\"ViewStudents.jsp\">View Students</a></li>\n");
      out.write("            <li><a href=\"AddEvents.jsp\">Add Events</a></li>\n");
      out.write("            <li><a href=\"ViewEvents.jsp\">View Events</a></li>\n");
      out.write("            <li><a href=\"ViewAttendance.jsp\">View Attendance</a></li>\n");
      out.write("            <li class=\"last\"><a href=\"logout.jsp\">Logout</a></li>\n");
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
      out.write("          <p style=\"text-align: justify;text-indent: 50px;line-height: 25px;\">\n");
      out.write("                The website hosts the STUDENT ATTENDANCE AUTOMATED SYSTEM by online.  \n");
      out.write("                Every Students and staffs details can register their information and their working and studying \n");
      out.write("                details in the site to process the attendance system using this application. Administrator creates\n");
      out.write("                the students and staffs information and uploads it on the site to refer them in future. This system \n");
      out.write("                allows the staffs who can take the students attendance by online. So calculation will be evaluated \n");
      out.write("                very quickly and automatically. Students can verify the attendance status and attendance \n");
      out.write("                percentage for the month or semester. Administrator also update the notifications related to \n");
      out.write("                the functions and competitions which are conducting in the college or department.\n");
      out.write("          </p>          \n");
      out.write("          <br/>\n");
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
