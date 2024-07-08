package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class StudentRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    Connection con;
    PreparedStatement ps;

                                ResultSet rs;
                            

                            String regno, name, gender, dob, fathername, mobileno, mailid, address, degree, studyingyear,pwd;
                            int age;
                            
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
      out.write("        <title>Student Faculty System</title>\n");
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
      out.write("                            STUDENT FACULTY MANAGEMENT SYSTEM\n");
      out.write("                        </h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clr\"></div>\n");
      out.write("                    <div class=\"menu_nav\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"active\"><a href=\"StaffRegistration.jsp\">Staff Registration</a></li>\n");
      out.write("                            <li><a href=\"StudentRegistration.jsp\">Student Registration</a></li>\n");
      out.write("                            <li><a href=\"StudentLogin.jsp\">View Staffs</a></li>\n");
      out.write("                            <li><a href=\"StudentLogin.jsp\">View Students</a></li>\n");
      out.write("                            <li><a href=\"StudentLogin.jsp\">Add Events</a></li>\n");
      out.write("                            <li><a href=\"StudentLogin.jsp\">View Events</a></li>\n");
      out.write("                            <li><a href=\"StudentLogin.jsp\">View Attendance</a></li>\n");
      out.write("                            <li class=\"last\"><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clr\"></div>\n");
      out.write("                    <div class=\"header_img\"> \n");
      out.write("                        <img src=\"images/Dress1.jpg\" alt=\"\" width=\"310\" height=\"180\" />\n");
      out.write("                        <img src=\"images/Dress2.jpg\" alt=\"\" width=\"310\" height=\"180\" />\n");
      out.write("                        <img src=\"images/Dress3.jpg\" alt=\"\" width=\"320\" height=\"180\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"content_resize\">\n");
      out.write("                    <div class=\"mainbar\">\n");
      out.write("                        <div class=\"article\">\n");
      out.write("                            <h2><span>Student Faculty Portal</span></h2>\n");
      out.write("                            <div class=\"clr\"></div>\n");
      out.write("                            <img src=\"images/Dress4.jpg\" width=\"500\" height=\"225\" alt=\"\" />\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <form name=\"form1\" action=\"StudentRegistration.jsp\" method=\"post\">\n");
      out.write("                                <table cellspacing=\"5\" cellpadding=\"5\" align=\"center\" >\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th colspan=\"2\" style=\"font-size: x-large;\">\n");
      out.write("                                            Student Registration Form\n");
      out.write("                                        </th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Student Reg.No</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"regno\" value=\"\" required placeholder=\"Enter Reg.No\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Student Name</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"studentname\" value=\"\" required placeholder=\"Enter Name\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Gender</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"radio\" name=\"gender\" value=\"Male\" />Male\n");
      out.write("                                            <input type=\"radio\" name=\"gender\" value=\"Female\" />Female\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>DOB</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"date\" name=\"dob\" required/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Age</td>\n");
      out.write("                                        <td><input type=\"text\" name=\"age\" required placeholder=\"Enter Age\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Father Name</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"fathername\" value=\"\" required placeholder=\"Enter Father Name\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Address</td>\n");
      out.write("                                        <td><textarea name=\"address\" rows=\"3\" cols=\"18\" required></textarea></td>\n");
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
      out.write("                                            <input type=\"text\" name=\"mobile\" value=\"\" required placeholder=\"Enter Mobile No\" pattern=\"(^7|^8|^9)\\d{9}\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Degree</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"degree\">\n");
      out.write("                                                <option>--Dept--</option>\n");
      out.write("                                                <option>BCA</option>\n");
      out.write("                                                <option>BSc(CS)</option>\n");
      out.write("                                                <option>BSc(IT)</option>\n");
      out.write("                                                <option>BSc(Maths)</option>\n");
      out.write("                                                <option>BSc(Physics)</option>\n");
      out.write("                                                <option>BSc(Chemistry)</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Year of Studying</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"studying_year\">\n");
      out.write("                                                <option>--Year--</option>\n");
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
      out.write("                                            <input type=\"reset\" value=\"Reset\" name=\"s2\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            ");

                                if (request.getParameter("s1") != null) {
                                    regno = request.getParameter("regno");
                                    name = request.getParameter("studentname");
                                    gender = request.getParameter("gender");
                                    dob = request.getParameter("dob");
                                    age = Integer.parseInt(request.getParameter("age"));
                                    fathername = request.getParameter("fathername");
                                    mobileno = request.getParameter("mobile");
                                    mailid = request.getParameter("mailid");
                                    address = request.getParameter("address");
                                    degree = request.getParameter("degree");
                                    studyingyear = request.getParameter("studying_year");
                                    pwd=request.getParameter("pwd");

                                    ps = con.prepareStatement("insert into Students values(?,?,?,?,?,?,?,?,?,?,?,?)");
                                    ps.setString(1, regno);
                                    ps.setString(2, name);
                                    ps.setString(3, gender);
                                    ps.setString(4, dob);
                                    ps.setInt(5, age);
                                    ps.setString(6, fathername);
                                    ps.setString(7, address);
                                    ps.setString(8, mailid);
                                    ps.setString(9, mobileno);
                                    ps.setString(10, degree);
                                    ps.setString(11, studyingyear);
                                    ps.setString(12, pwd);
                                    ps.executeUpdate();
                                    ps.close();

                                    response.sendRedirect("StudentRegistration.jsp?msg=Stud Info Registered.");
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <center><h3 style=\"color:blue;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3></center>\n");
      out.write("                        </div>     \n");
      out.write("                    </div>      \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fbg\">    \n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <p class=\"lf\">&copy; Copyright <a href=\"#\">Student Faculty Portal Team</a>.</p>\n");
      out.write("                    <p class=\"rf\">Developed By<a href=\"http://www.freewebsitetemplatez.com/\">&nbsp;AMS</a></p>\n");
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
