<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%!
    Connection con;
    PreparedStatement ps;
%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentFacultySystem","root","");
%>