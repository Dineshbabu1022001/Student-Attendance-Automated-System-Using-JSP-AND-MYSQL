<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="db.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Student Attendance Automated System</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="style.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/arial.js"></script>
        <script type="text/javascript" src="js/cuf_run.js"></script>
    </head>
    <body>
        <div class="main">
            <div class="header">
                <div class="header_resize">
                    <div class="logo">
                        <h2 align="center">            
                            STUDENT ATTENDANCE AUTOMATED SYSTEM
                        </h2>
                    </div>
                    <div class="clr"></div>
                    <div class="menu_nav">
                        <ul>
                            <li class="active"><a href="StaffRegistration.jsp">Staff Registration</a></li>
                            <li><a href="StudentRegistration.jsp">Student Registration</a></li>
                            <li><a href="ViewStaffs.jsp">View Staffs</a></li>
                            <li><a href="ViewStudents.jsp">View Students</a></li>
                            <li><a href="AddEvents.jsp">Add Events</a></li>
                            <li><a href="ViewEvents.jsp">View Events</a></li>
                            <li><a href="ViewAttendance.jsp">View Attendance</a></li>
                            <li class="last"><a href="logout.jsp">Logout</a></li>
                        </ul>
                    </div>
                    <div class="clr"></div>
                    <div class="header_img"> 
                        <img src="images/college.png" alt="" width="395" height="180" />
                        <img src="images/psna.jpg" alt="" width="395" height="180" />
                        <img src="images/3.jpg" alt="" width="395" height="180" />
                    </div>
                </div>
            </div>
            <div class="clr"></div>
            <div class="content">
                <div class="content_resize">
                    <div class="mainbar">
                        <div class="article">
                            <h2><span>Student Attendance Portal</span></h2>
                            <%!
                                ResultSet rs;
                            %>
                            <table border="1" align="center" cellpadding="5" cellspacing="0" width="85%" rules="rows">
                                <tr>
                                    <td colspan="8" style="font-size: x-large; font-weight: bold;text-align: center;color: white;background-color: darkslateblue;letter-spacing: 5px;">View Student Details by Admin</td>
                                </tr>
                                <tr style="background-color: pink;color: darkgreen;font-size: 15px;font-weight: bold;">
                                    <td> Reg. No</td>
                                    <td> Name</td>
                                    <td> Father Name</td>
                                    <td> Address</td>
                                    <td> Mail Id</td>
                                    <td> Mobile No</td>
                                    <td> Degree</td>
                                    <td> Studying Year</td>
                                </tr>
                                <%
                                    ps = con.prepareStatement("select * from Students");
                                    rs = ps.executeQuery();
                                    while (rs.next()) {
                                %>
                                <tr style="background-color: lavenderblush;">
                                    <td><%=rs.getString(1)%></td>
                                    <td><%=rs.getString(2)%></td>
                                    <td><%=rs.getString(6)%></td>
                                    <td><%=rs.getString(7)%></td>
                                    <td><%=rs.getString(8)%></td>
                                    <td><%=rs.getString(9)%></td>
                                    <td><%=rs.getString(10)%></td>
                                    <td><%=rs.getString(11)%></td>
                                </tr>
                                <%
                                    }
                                    rs.close();
                                    ps.close();
                                %>
                            </table>



                            <br/>
                        </div>     
                    </div>      
                </div>
            </div>
            <div class="fbg">    
                <div class="footer">
                    <p class="lf">&copy; Copyright <a href="#">Student Attendance Portal Team</a>.</p>
                     <p class="rf">Developed By<a href="https://www.psnacet.edu.in//">&nbsp;PSNA</a></p>
                    <div class="clr"></div>
                </div>
            </div>
        </div>
    </body>
</html>