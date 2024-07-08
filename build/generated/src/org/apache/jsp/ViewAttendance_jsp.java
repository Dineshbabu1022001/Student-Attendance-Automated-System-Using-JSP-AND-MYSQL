package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.*;
import java.sql.*;

public final class ViewAttendance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    Connection con;
    PreparedStatement ps;

 
                                PreparedStatement ps2;
                                ResultSet rs, rs2;
                                String regno;
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
      out.write("                            <li class=\"active\"><a href=\"StaffRegistration.jsp\">Staff Registration</a></li>\n");
      out.write("                            <li><a href=\"StudentRegistration.jsp\">Student Registration</a></li>\n");
      out.write("                            <li><a href=\"ViewStaffs.jsp\">View Staffs</a></li>\n");
      out.write("                            <li><a href=\"ViewStudents.jsp\">View Students</a></li>\n");
      out.write("                            <li><a href=\"AddEvents.jsp\">Add Events</a></li>\n");
      out.write("                            <li><a href=\"ViewEvents.jsp\">View Events</a></li>\n");
      out.write("                            <li><a href=\"ViewAttendance.jsp\">View Attendance</a></li>\n");
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
      out.write("                            <table id=\"attendanceTable\" border=\"1\" align=\"center\" cellpadding=\"5\" cellspacing=\"0\" width=\"65%\" rules=\"rows\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"8\" style=\"font-size: x-large; font-weight: bold;text-align: center;color: white;background-color: hotpink;letter-spacing: 5px;\">Attendance Percentage Details by Staff</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr style=\"background-color: cadetblue;color: navy;font-size: 15px;font-weight: bold;\">\n");
      out.write("                                    <td style=\"width: 65px;\"> Reg. No</td>\n");
      out.write("                                    <td style=\"width: 105px;\"> Name</td>\n");
      out.write("                                    <td style=\"width: 65px;\"> Degree</td>\n");
      out.write("                                    <td style=\"width: 65px;\"> Studying Year</td>\n");
      out.write("                                    <td style=\"width: 65px;\"> Total Working Days</td>\n");
      out.write("                                    <td style=\"width: 65px;\"> Total Present Days</td>\n");
      out.write("                                    <td style=\"width: 65px;\"> Total Absent Days</td>\n");
      out.write("                                    <td style=\"width: 65px;\"> Att.Percentage</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    fmt = NumberFormat.getPercentInstance();
                                    fmt.setMinimumFractionDigits(2);
                                    fmt.setMaximumFractionDigits(2);

                                    ps = con.prepareStatement("select registerno,name,degree,studyingyear from Students");
                                    rs = ps.executeQuery();
                                    while (rs.next()) {
                                        regno = rs.getString(1);
                                        System.out.println("\n" + regno + "\n");

                                        ps2 = con.prepareStatement("select count(*) from AttendanceEntry where registerno=? and attendance='Present'");
                                        ps2.setString(1, regno);
                                        rs2 = ps2.executeQuery();
                                        if (rs2.next()) {
                                            count_present = rs2.getInt(1);
                                        }
                                        rs2.close();
                                        ps2.close();

                                        ps2 = con.prepareStatement("select count(*) from AttendanceEntry where registerno=? and attendance='Absent'");
                                        ps2.setString(1, regno);
                                        rs2 = ps2.executeQuery();
                                        if (rs2.next()) {
                                            count_absent = rs2.getInt(1);
                                        }
                                        rs2.close();
                                        ps2.close();

                                        ps2 = con.prepareStatement("select count(distinct(attendancedate)) from AttendanceEntry");
                                        rs2 = ps2.executeQuery();
                                        if (rs2.next()) {
                                            total_working_days = rs2.getInt(1);
                                        }
                                        rs2.close();
                                        ps2.close();

                                        attendance_percentage = (float) count_present / total_working_days * 100;

                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(regno);
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
      out.print(total_working_days);
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(count_present);
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(count_absent);
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(fmt.format(attendance_percentage / 100));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    }
                                    rs.close();
                                    ps.close();
                                
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                            <div style=\"text-align: center; margin-top: 20px;\">\n");
      out.write("            <button onclick=\"printPDF()\" style=\"padding: 10px 20px;border: none;border-radius: 3px;background-color: #2cadff;color: #fff;cursor: pointer;transition: background-color 0.3s;\">Print</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                            <br/>\n");
      out.write("                        </div>     \n");
      out.write("                    </div>      \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fbg\">    \n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <p class=\"lf\">&copy; Copyright <a href=\"#\">Student Attendance Portal Team</a>.</p>\n");
      out.write("                     <p class=\"rf\">Developed By<a href=\"https://www.psnacet.edu.in//\">&nbsp;PSNA</a></p>\n");
      out.write("                    <div class=\"clr\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                            <script>\n");
      out.write("        function printPDF() {\n");
      out.write("            var originalContent = document.body.innerHTML;\n");
      out.write("            var tableContent = document.getElementById('attendanceTable').outerHTML;\n");
      out.write("            document.body.innerHTML = tableContent;\n");
      out.write("            window.print();\n");
      out.write("            document.body.innerHTML = originalContent;\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
