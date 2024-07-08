<%@page import="java.text.*" contentType="text/html" pageEncoding="UTF-8"%>
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
                            <li class="active"><a href="MyDetails_Student.jsp">My Details</a></li>
                            <li><a href="ViewStaffsByStudent.jsp">View Staffs</a></li>
                            <li><a href="ViewAttendanceByStudent.jsp">View Attendance</a></li>
                            <li><a href="ViewEventsByStudent.jsp">View Events</a></li>
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

                            <%!                                ResultSet rs;
                                int count_present, count_absent;
                                int total_working_days;
                                float attendance_percentage;
                                NumberFormat fmt;
                            %>
                            <table id="attendanceTable" border="1" align="center" cellpadding="5" cellspacing="0" width="85%" rules="rows">
                                <tr>
                                    <td colspan="8" style="font-size: x-large; font-weight: bold;text-align: center;color: white;background-color: hotpink;letter-spacing: 5px;">View Student's Attendance Details by Staff</td>
                                </tr>
                                <tr style="background-color: cadetblue;color: navy;font-size: 15px;font-weight: bold;">
                                    <td> Reg. No</td>
                                    <td> Name</td>
                                    <td> Degree</td>
                                    <td> Studying Year</td>
                                    <td> Attendance</td>
                                    <td> Attendance Date</td>
                                </tr>
                                <%                                    fmt = NumberFormat.getPercentInstance();
                                    fmt.setMinimumFractionDigits(2);
                                    fmt.setMaximumFractionDigits(2);
                                    ps = con.prepareStatement("select * from AttendanceEntry where registerno=?");
                                    ps.setString(1, session.getAttribute("RegisterNo").toString());
                                    rs = ps.executeQuery();
                                    while (rs.next()) {
                                %>
                                <tr style="background-color: lavender;">
                                    <td><%=rs.getString(1)%></td>
                                    <td><%=rs.getString(2)%></td>
                                    <td><%=rs.getString(3)%></td>
                                    <td><%=rs.getString(4)%></td>
                                    <td><%=rs.getString(5)%></td>
                                    <td><%=rs.getString(6)%></td>
                                </tr>
                                <%
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
                                %>
                            </table>
                            <center>
                                <table cellpadding="7" style="font-weight: bold;font-size: medium;" >
                                    <tr>
                                        <td style="text-decoration: underline;">Total Working Days</td>
                                        <td><%=total_working_days%></td>
                                    </tr>
                                    <tr>
                                        <td style="text-decoration: underline;">Total Present</td>
                                        <td><%=count_present%></td>
                                    </tr>
                                    <tr>
                                        <td style="text-decoration: underline;">Total Absent</td>
                                        <td><%=count_absent%></td>
                                    </tr>
                                    <tr>
                                        <td style="text-decoration: underline;">Attendance Percentage</td>
                                        <td><%=fmt.format(attendance_percentage / 100)%></td>
                                    </tr>
                                </table>
                                <div style="text-align: center; margin-top: 20px;">
                                    <button onclick="printPDF()" style="padding: 10px 20px;border: none;border-radius: 3px;background-color: #2cadff;color: #fff;cursor: pointer;transition: background-color 0.3s;">Print</button>
                                </div>
                            </center>

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
        <script>
            function printPDF() {
                var originalContent = document.body.innerHTML;
                var tableContent = document.getElementById('attendanceTable').outerHTML;
                document.body.innerHTML = tableContent;
                window.print();
                document.body.innerHTML = originalContent;
            }
        </script>
    </body>
</html>