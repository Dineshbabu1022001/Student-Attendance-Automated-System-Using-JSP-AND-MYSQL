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
                            %>
                            <div style="border: 4px solid #ccc; padding: 18px;">
                           <form name="form1" action="StudentRegistration.jsp" method="post">
    <table cellspacing="5" cellpadding="5" align="center" style="border-collapse: collapse; border: 2px solid #ccc;">
        <tr>
            <th colspan="2" style="text-align:center;color: deeppink;font-weight: bold;font-size: x-large;padding:0px;">Student Registration Form</th>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium"><label for="regno">Student Reg.No:</label></td>
            <td style="padding: 11px;"><input type="text" id="regno" name="regno" value="" required placeholder="Enter Reg.No" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;" /></td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="studentname">Student Name:</label></td>
            <td style="padding: 11px;"><input type="text" id="studentname" name="studentname" value="" required placeholder="Enter Name" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;" /></td>
        </tr>   
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;">Gender:</td>
            <td style="padding: 11px;">
                <label style="margin-right: 15px;"><input type="radio" name="gender" value="Male" style="margin-right: 5px;" />Male</label>
                <label><input type="radio" name="gender" value="Female" style="margin-right: 5px;" />Female</label>
            </td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="dob">DOB:</label></td>
            <td style="padding: 11px;"><input type="date" id="dob" name="dob" required style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;" /></td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="age">Age:</label></td>
            <td style="padding: 11px;"><input type="text" id="age" name="age" required placeholder="Enter Age" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;" /></td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="fathername">Father Name:</label></td>
            <td style="padding: 11px;"><input type="text" id="fathername" name="fathername" value="" required placeholder="Enter Father Name" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;" /></td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="address">Address:</label></td>
            <td><textarea id="address" name="address" rows="3" cols="18" required style="width:250px;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"></textarea></td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="mailid">E-Mail Id:</label></td>
            <td style="padding: 11px;"><input type="text" id="mailid" name="mailid" value="" required placeholder="Enter Mail Id" pattern=".+@[a-z]+\.[a-z]+" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;" /></td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="mobile">Mobile No:</label></td>
            <td style="padding: 11px;"><input type="text" id="mobile" name="mobile" value="" required placeholder="Enter Mobile No" pattern="(^6|^7|^8|^9)\d{9}" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;" /></td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="degree">Degree:</label></td>
            <td>
                <select id="degree" name="degree" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;">
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
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="studying_year">Year of Studying:</label></td>
            <td>
                <select id="studying_year" name="studying_year" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;">
                    <option>--Year--</option>
                    <option>I Year</option>
                    <option>II Year</option>
                    <option>III Year</option>
                </select>
            </td>
        </tr>
        <tr>
            <td style="color: deepskyblue;font-weight:bold; font-size: medium;"><label for="pwd">Password:</label></td>
            <td style="padding: 11px;"><input type="password" id="pwd" name="pwd" required placeholder="Enter Password" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;" /></td>
        </tr>
        <tr>
            <td></td>
            <td style="padding: 11px;">
                <input type="submit" value="Submit" name="s1" style="padding: 10px 20px; border: none; border-radius: 3px; background-color: #007bff; color: #fff; cursor: pointer; transition: background-color 0.3s;" />&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" value="Reset" name="s2" style="padding: 10px 20px; border: none; border-radius: 3px; background-color: #dc3545; color: #fff; cursor: pointer; transition: background-color 0.3s;" />
            </td>
        </tr>
    </table>
</form>
</div>


                            <%!
                            String regno, name, gender, dob, fathername, mobileno, mailid, address, degree, studyingyear,pwd;
                            int age;
                            %>
                            <%
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
                                    out.println("<script>alert('Student Information Registered.')</script>");
                                }
                            %>

                            <center><h3 style="color:blue;">${param.msg}</h3></center>
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