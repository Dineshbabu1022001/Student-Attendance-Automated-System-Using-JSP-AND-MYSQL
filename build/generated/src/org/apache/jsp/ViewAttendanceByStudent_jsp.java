package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.*;
import java.sql.*;

public final class ViewAttendanceByStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    Connection con;
    PreparedStatement ps;

                                ResultSet rs;
                                int count_present, count_absent;
                                int total_working_days;
                                float attendance_percentage;
                                NumberFormat fmt;
                            
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/db.jsp");
  }

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

      out.write('\n');
      out.write('\n');
      out.write('\n');

    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentFacultySystem","root","");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <title>Student Attendance Automated System</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/arial.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/cuf_run.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"header_resize\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <h2 align=\"center\">            \n");
      out.write("                            STUDENT ATTENDANCE AUTOMATED SYSTEM\n");
      out.write("                        </h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clr\"></div>\n");
      out.write("                    <div class=\"menu_nav\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"active\"><a href=\"MyDetails_Student.jsp\">My Details</a></li>\n");
      out.write("                            <li><a href=\"ViewStaffsByStudent.jsp\">View Staffs</a></li>\n");
      out.write("                            <li><a href=\"ViewAttendanceByStudent.jsp\">View Attendance</a></li>\n");
      out.write("                            <li><a href=\"ViewEventsByStudent.jsp\">View Events</a></li>\n");
      out.write("                            <li class=\"last\"><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clr\"></div>\n");
      out.write("                    <div class=\"header_img\"> \n");
      out.write("                        <img src=\"images/college.png\" alt=\"\" width=\"395\" height=\"180\" />\n");
      out.write("                        <img src=\"images/psna.jpg\" alt=\"\" width=\"395\" height=\"180\" />\n");
      out.write("                        <img src=\"images/3.jpg\" alt=\"\" width=\"395\" height=\"180\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"content_resize\">\n");
      out.write("                    <div class=\"mainbar\">\n");
      out.write("                        <div class=\"article\">\n");
      out.write("                            <h2><span>Student Attendance Portal</span></h2>\n");
      out.write("                            <div class=\"clr\"></div>\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <table id=\"attendanceTable\" border=\"1\" align=\"center\" cellpadding=\"5\" cellspacing=\"0\" width=\"85%\" rules=\"rows\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"8\" style=\"font-size: x-large; font-weight: bold;text-align: center;color: white;background-color: hotpink;letter-spacing: 5px;\">View Student's Attendance Details by Staff</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr style=\"background-color: cadetblue;color: navy;font-size: 15px;font-weight: bold;\">\n");
      out.write("                                    <td> Reg. No</td>\n");
      out.write("                                    <td> Name</td>\n");
      out.write("                                    <td> Degree</td>\n");
      out.write("                                    <td> Studying Year</td>\n");
      out.write("                                    <td> Attendance</td>\n");
      out.write("                                    <td> Attendance Date</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
                                    fmt = NumberFormat.getPercentInstance();
                                    fmt.setMinimumFractionDigits(2);
                                    fmt.setMaximumFractionDigits(2);
                                    ps = con.prepareStatement("select * from AttendanceEntry where registerno=?");
                                    ps.setString(1, session.getAttribute("RegisterNo").toString());
                                    rs = ps.executeQuery();
                                    while (rs.next()) {
                                
      out.write("\n");
      out.write("                                <tr style=\"background-color: lavender;\">\n");
      out.write("                                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    }
                                    rs.close();
                                    ps.close();

                                    ps = con.prepareStatement("select count(*) from AttendanceEntry where registerno=? and attendance='Present'");
                                    ps.setString(1, session.getAttribute("RegisterNo").toString());
                                    rs = ps.executeQuery();
                                    if (rs.next()) {
                                        count_present = rs.getInt(1);
                                    }
                                    rs.close();
                                    ps.close();

                                    ps = con.prepareStatement("select count(*) from AttendanceEntry where registerno=? and attendance='Absent'");
                                    ps.setString(1, session.getAttribute("RegisterNo").toString());
                                    rs = ps.executeQuery();
                                    if (rs.next()) {
                                        count_absent = rs.getInt(1);
                                    }
                                    rs.close();
                                    ps.close();

                                    ps = con.prepareStatement("select count(distinct(attendancedate)) from AttendanceEntry");
                                    rs = ps.executeQuery();
                                    if (rs.next()) {
                                        total_working_days = rs.getInt(1);
                                    }
                                    rs.close();
                                    ps.close();

                                    attendance_percentage = (float) count_present / total_working_days * 100;
                                
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                            <center>\n");
      out.write("                                <table cellpadding=\"7\" style=\"font-weight: bold;font-size: medium;\" >\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"text-decoration: underline;\">Total Working Days</td>\n");
      out.write("                                        <td>");
      out.print(total_working_days);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"text-decoration: underline;\">Total Present</td>\n");
      out.write("                                        <td>");
      out.print(count_present);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"text-decoration: underline;\">Total Absent</td>\n");
      out.write("                                        <td>");
      out.print(count_absent);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"text-decoration: underline;\">Attendance Percentage</td>\n");
      out.write("                                        <td>");
      out.print(fmt.format(attendance_percentage / 100));
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                                <div style=\"text-align: center; margin-top: 20px;\">\n");
      out.write("                                    <button onclick=\"printPDF()\" style=\"padding: 10px 20px;border: none;border-radius: 3px;background-color: #2cadff;color: #fff;cursor: pointer;transition: background-color 0.3s;\">Print</button>\n");
      out.write("                                </div>\n");
      out.write("                            </center>\n");
      out.write("\n");
      out.write("                            <br/>\n");
      out.write("                        </div>     \n");
      out.write("                    </div>      \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fbg\">    \n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <p class=\"lf\">&copy; Copyright <a href=\"#\">Student Attendance Portal Team</a>.</p>\n");
      out.write("                    <p class=\"rf\">Developed By<a href=\"https://www.psnacet.edu.in//\">&nbsp;PSNA</a></p>\n");
      out.write("                    <div class=\"clr\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function printPDF() {\n");
      out.write("                var originalContent = document.body.innerHTML;\n");
      out.write("                var tableContent = document.getElementById('attendanceTable').outerHTML;\n");
      out.write("                document.body.innerHTML = tableContent;\n");
      out.write("                window.print();\n");
      out.write("                document.body.innerHTML = originalContent;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
