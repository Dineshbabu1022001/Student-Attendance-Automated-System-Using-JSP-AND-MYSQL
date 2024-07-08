<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <li class="active"><a href="index.jsp">Home</a></li>
            <li><a href="AdminLogin.jsp">Admin</a></li>
            <li><a href="StaffLogin.jsp">Staffs</a></li>
            <li><a href="StudentLogin.jsp">Students</a></li>
            <li><a href="About.jsp">About us</a></li>
            <li class="last"><a href="Contact.jsp">Contact us</a></li>            
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
          
          <form name="form1" method="post" action="AdminLogin.jsp">
               <table border="0" align="center" cellpadding="5" cellspacing="6" style="box-sizing:border-box">
               <tr>
               <td colspan="2" style="text-align:center;color: deeppink;font-weight: bold;font-size: x-large;">
                    Administrator Login
               </td>
               </tr>
               <tr>
               <td style="color: deepskyblue;font-weight:bold; font-size: large">Username</td>
               <td><input type="text" name="t1" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/></td>
               </tr>
               <tr>
               <td style="color: deepskyblue;font-weight:bold;font-size: large">Password</td>
               <td><input type="password" name="t2" style="width:100%;border: 1px solid #c0c0c0;border-radius: 3px;box-sizing: border-box;padding: 10px;"/></td>
               </tr>
               <tr>
                   <td></td>
                   <td>
                       <input type="submit" name="s1" value="Login"style="padding: 10px 20px;border: none;border-radius: 3px;background-color: #2cadff;color: #fff;cursor: pointer;transition: background-color 0.3s;"/>
                   <input type="reset" name="s2" value="Clear" style="padding: 10px 20px;border: none;border-radius: 3px;background-color: #dc3545;color: #fff;cursor: pointer;transition: background-color 0.3s;"/>
                   </td>
               </tr>
               </table>
               </form>
               <%
                   if(request.getParameter("s1")!=null){
                       String uid=request.getParameter("t1");
                       String pwd=request.getParameter("t2");
                       if(uid.equals("Admin") && pwd.equals("Admin")){
                           session.setAttribute("userid", "Admin");
                           response.sendRedirect("StaffRegistration.jsp");
                       }
                       else{
                           out.println("<center><span style='color:red;font-size:medium;'>Your login attempt was not successful. Please try again.</span></center>");
                       }
                   }
               %>
               <br/><br/><br/>
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