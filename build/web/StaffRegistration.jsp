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
                            <%!                                ResultSet rs;
                                int staffid;
                            %>
                            <%                                ps = con.prepareStatement("select ifnull(max(staffid),100)+1 from Staffs");
                                rs = ps.executeQuery();
                                if (rs.next()) {
                                    staffid = rs.getInt(1);
                                }
                                rs.close();
                                ps.close();
                            %>
                            <div style="border: 4px solid #ccc; padding: 20px;">

                                <form name="form1" action="StaffRegistration.jsp" method="post">
                                    <table cellpadding="10" align="center" style="border-collapse: collapse; border: 2px solid #ccc;">
                                        <tr>
                                            <th colspan="2" style="text-align:center;color: deeppink;font-weight: bold;font-size: x-large;padding:0px;">Staff Registration Form</th>
                                            <td style="padding: 11px;"></td>


                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Staff Id:</td>
                                            <td style="padding: 11px;">
                                                <input type="text" name="staffid" value="<%=staffid%>" required readonly style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Staff Name:</td>
                                            <td style="padding: 11px;">
                                                <input type="text" name="staffname" value="" required placeholder="Enter Name" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Gender:</td>
                                            <td style="padding: 11px;">
                                                <input type="radio" name="gender" value="Male" required style="margin-right: 5px;"/><label style="margin-right: 15px;">Male</label>
                                                <input type="radio" name="gender" value="Female" required style="margin-right: 5px;"/><label>Female</label>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Address:</td>
                                            <td style="padding: 11px;"><textarea name="address" rows="3" cols="18" style="width:250px;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"></textarea></td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">E-Mail Id:</td>
                                            <td style="padding: 11px;">
                                                <input type="text" name="mailid" value="" required placeholder="Enter Mail Id" pattern=".+@[a-z]+\.[a-z]+" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Mobile No:</td>
                                            <td style="padding: 11px;">
                                                <input type="text" name="mobileno" value="" required placeholder="Enter Mobile No" pattern="(^6|^7|^8|^9)\d{9}" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Qualification:</td>
                                            <td style="padding: 11px;">
                                                <input type="text" name="qualification" value="" required placeholder="Enter Qualification" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Dept:</td>
                                            <td style="padding: 11px;">
                                                <select name="dept" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;">
                                                    <option>--Dept--</option>
                                                    <option>MCA</option>
                                                    <option>MBA</option>
                                                    <option>EEE</option>
                                                    <option>BCA</option>
                                                    <option>BSc(Computer Science)</option>
                                                    <option>BSc(Chemistry)</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Incharge Year:</td>
                                            <td style="padding: 11px;">
                                                <select name="inchargeyear" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;">
                                                    <option>--Incharge Year--</option>
                                                    <option>I Year</option>
                                                    <option>II Year</option>
                                                    <option>III Year</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="color: deepskyblue;font-weight:bold; font-size: medium">Password:</td>
                                            <td style="padding: 11px;"><input type="password" name="pwd" required placeholder="Enter Password" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/></td>
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