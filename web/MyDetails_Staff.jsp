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
                            <li class="active"><a href="MyDetails_Staff.jsp">My Details</a></li>
                            <li><a href="ViewStudentByStaff.jsp">View Students</a></li>
                            <li><a href="Attendance.jsp">Attendance</a></li>
                            <li><a href="ViewAttendanceByStaff.jsp">View Attendance</a></li>
                            <li><a href="ViewAttendancePercentage.jsp">Attendance Percentage</a></li>
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
                            <div class="clr"></div>
                            <img src="images/logo.png" width="200" height="180" alt="" />

                            <%!
                                ResultSet rs;
                            %>
                            <%
                                ps = con.prepareStatement("select * from Staffs where staffid=?");
                                ps.setString(1, session.getAttribute("StaffId").toString());
                                rs = ps.executeQuery();
                                if (rs.next()) {
                            %>
                            <center>
                                <table cellpadding="10" rules="rows" border="5" width="35%" style="color: black"> 
                                    <tr style="background-color: plum;">
                                        <th colspan="2" style="font-size: 20px;text-align: center;">My Account Info</th>
                                    </tr>
                                    <tr style="background-color: lightgray">
                                        <th style="text-align: left;">Staff Id</th>
                                        <td><%=rs.getString(1)%></td>
                                    </tr>
                                    <tr style="background-color: lavenderblush;">
                                        <th style="text-align: left;">Name</th>
                                        <td><%=rs.getString(2)%></td>
                                    </tr>
                                    <tr style="background-color: lightgray">
                                        <th style="text-align: left;">Address</th>
                                        <td><%=rs.getString(4)%></td>
                                    </tr>
                                    <tr style="background-color: lavenderblush;">
                                        <th style="text-align: left;">Mail Id</th>
                                        <td><%=rs.getString(5)%></td>
                                    </tr>
                                    <tr style="background-color: lightgray">
                                        <th style="text-align: left;">Mobile No</th>
                                        <td><%=rs.getString(6)%></td>
                                    </tr>
                                    <tr style="background-color: lavenderblush;">
                                        <th style="text-align: left;">Qualification</th>
                                        <td><%=rs.getString(7)%></td>
                                    </tr>
                                    <tr style="background-color: lightgray">
                                        <th style="text-align: left;">Dept</th>
                                        <td><%=rs.getString(8)%></td>
                                    </tr>
                                    <tr style="background-color: lavenderblush;">
                                        <th style="text-align: left;">Incharge Year</th>
                                        <td><%=rs.getString(9)%></td>
                                    </tr>
                                </table>
                            </center>
                            <br/><br/><br/>
                            <%
                                }
                                rs.close();
                                ps.close();
                            %>


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