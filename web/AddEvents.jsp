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
                            <div class="clr"></div>
                            <img src="images/logo.png" width="200" height="180" alt="" />
                            <%!
                                ResultSet rs;
                                int eventid;
                            %>
                            <%
                                ps = con.prepareStatement("select ifnull(max(eventid),1000)+1 from Events");
                                rs = ps.executeQuery();
                                if (rs.next()) {
                                    eventid = rs.getInt(1);
                                }
                                rs.close();
                                ps.close();
                            %>
                            <div style="border: 4px solid #ccc; padding: 20px;">
                            <form name="form1" action="AddEvents.jsp" method="post">
    <table cellpadding="10" align="center" style="border-collapse: collapse; border: 2px solid #ccc;">
        <tr>
            <th colspan="2" style="text-align:center;color: deeppink;font-weight: bold;font-size: x-large;padding:0px;">Add New Events</th>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Event Id:</td>
            <td style="padding: 11px;">
                <input type="text" name="event_id" value="<%=eventid%>" required readonly style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/>
            </td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Name of Event:</td>
            <td style="padding: 11px;">
                <input type="text" name="event_name" value="" required placeholder="Enter Event Name" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/>
            </td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Event Details:</td>
            <td style="padding: 11px;">
                <textarea name="event_details" rows="5" cols="27"></textarea>
            </td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Other Details:</td>
            <td style="padding: 11px;">
                <textarea name="other_details" rows="5" cols="27"></textarea>
            </td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Event Organizer:</td>
            <td style="padding: 11px;">
                <textarea name="event_organizer" rows="5" cols="27"></textarea>
            </td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Date of Event:</td>
            <td style="padding: 11px;">
                <input type="date" name="event_date" value="" required placeholder="Enter Event Date" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/>
            </td>
        </tr>
        <tr>   
            <td style="color: deepskyblue;font-weight:bold; font-size: medium"></td>
            <td style="padding: 11px;">
                <input type="submit" value="Submit" name="s1" style="padding: 10px 20px; border: none; border-radius: 3px; background-color: #007bff; color: #fff; cursor: pointer; transition: background-color 0.3s;"/>&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" value="Clear" name="s2" style="padding: 10px 20px; border: none; border-radius: 3px; background-color: #dc3545; color: #fff; cursor: pointer; transition: background-color 0.3s;"/>
            </td>
        </tr>
    </table>
</form>
                        </div>
                            <center><h3 style="color:blue;">${param.msg}</h3></center>
                                <%
                                    if (request.getParameter("s1") != null) {
                                        String eventid = request.getParameter("event_id");
                                        String eventname = request.getParameter("event_name");
                                        String eventdetails = request.getParameter("event_details");
                                        String otherdetails = request.getParameter("other_details");
                                        String organizer = request.getParameter("event_organizer");
                                        String eventdate = request.getParameter("event_date");
                                        
                                        ps = con.prepareStatement("insert into Events values(?,?,?,?,?,?)");
                                        ps.setString(1, eventid);
                                        ps.setString(2, eventname);
                                        ps.setString(3, eventdetails);
                                        ps.setString(4, otherdetails);
                                        ps.setString(5, organizer);
                                        ps.setString(6, eventdate);
                                        ps.executeUpdate();
                                        ps.close();
                                        response.sendRedirect("AddEvents.jsp?msg=New Event Details Stored!!");
                                    }
                                %>


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