package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class StaffRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    Connection con;
    PreparedStatement ps;


                                ResultSet rs;
                                int staffid;
                            
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
      out.write("          <img src=\"images/psna.jpg\" alt=\"\" width=\"395\" height=\"180\" />\n");
      out.write("          <img src=\"images/3.jpg\" alt=\"\" width=\"395\" height=\"180\" />\n");
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
      out.write("                            <img src=\"images/logo.png\" width=\"200\" height=\"180\" alt=\"\" />\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            ");

                                ps = con.prepareStatement("select ifnull(max(staffid),100)+1 from Staffs");
                                rs = ps.executeQuery();
                                if (rs.next()) {
                                    staffid = rs.getInt(1);
                                }
                                rs.close();
                                ps.close();
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <form name=\"form1\" action=\"StaffRegistration.jsp\" method=\"post\">\n");
      out.write("                                <table cellpadding=\"10\" align=\"center\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th colspan=\"2\" style=\"text-align: center;font-size: x-large;\">Staff Registration Form</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Staff Id</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"staffid\" value=\"");
      out.print(staffid);
      out.write("\" required readonly/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Staff Name</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"staffname\" value=\"\" required placeholder=\"Enter Name\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Gender</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"radio\" name=\"gender\" value=\"Male\" required/>Male\n");
      out.write("                                            <input type=\"radio\" name=\"gender\" value=\"Female\" required/>Female\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Address</td>\n");
      out.write("                                        <td><textarea name=\"address\" rows=\"3\" cols=\"18\"></textarea></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>E-Mail Id</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"mailid\" value=\"\" required placeholder=\"Enter Mail Id\" pattern=\".+@[a-z]+\\.[a-z]+\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Mobile No</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"mobileno\" value=\"\" required placeholder=\"Enter Mobile No\" pattern=\"(^6|^7|^8|^9)\\d{9}\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Qualification</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"qualification\" value=\"\" required placeholder=\"Enter Qualification\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Dept</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"dept\">\n");
      out.write("                                                <option>--Dept--</option>\n");
      out.write("                                                <option>MCA</option>\n");
      out.write("                                                <option>MBA</option>\n");
      out.write("                                                <option>EEE</option>\n");
      out.write("                                                <option>BCA</option>\n");
      out.write("                                                <option>BSc(Computer Science)</option>\n");
      out.write("                                                <option>BSc(Chemistry)</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Incharge Year</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"inchargeyear\">\n");
      out.write("                                                <option>--Incharge Year--</option>\n");
      out.write("                                                <option>I Year</option>\n");
      out.write("                                                <option>II Year</option>\n");
      out.write("                                                <option>III Year</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Password</td>\n");
      out.write("                                        <td><input type=\"password\" name=\"pwd\" required placeholder=\"Enter Password\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>   \n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"submit\" value=\"Submit\" name=\"s1\" />&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                            <input type=\"reset\" value=\"Clear\" name=\"s2\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                            <center><h3 style=\"color:blue;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3></center>\n");
      out.write("                            ");

                                if (request.getParameter("staffid") != null) {
                                    String staffid = request.getParameter("staffid");
                                    String staffname = request.getParameter("staffname");
                                    String gender = request.getParameter("gender");
                                    String address = request.getParameter("address");
                                    String qualififcation = request.getParameter("qualification");
                                    String mobileno = request.getParameter("mobileno");
                                    String mailid = request.getParameter("mailid");
                                    String dept = request.getParameter("dept");
                                    String inchargeyear = request.getParameter("inchargeyear");
                                    String pwd = request.getParameter("pwd");

                                    ps = con.prepareStatement("insert into Staffs values(?,?,?,?,?,?,?,?,?,?)");
                                    ps.setString(1, staffid);
                                    ps.setString(2, staffname);
                                    ps.setString(3, gender);
                                    ps.setString(4, address);
                                    ps.setString(5, mailid);
                                    ps.setString(6, mobileno);
                                    ps.setString(7, qualififcation);
                                    ps.setString(8, dept);
                                    ps.setString(9, inchargeyear);
                                    ps.setString(10, pwd);
                                    ps.executeUpdate();
                                    ps.close();
                                    response.sendRedirect("StaffRegistration.jsp?msg=Staff Details Registered!!");
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
