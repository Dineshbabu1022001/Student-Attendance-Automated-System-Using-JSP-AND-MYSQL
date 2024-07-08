<%@include file="db.jsp" %>
<%!
    PreparedStatement ps2;
    ResultSet rs, rs2;
    String name, degree, studying_year;
%>
<%
    String register_nos[] = request.getParameterValues("c1");

    for (String regno : register_nos) {
        ps = con.prepareStatement("select name,degree,studyingyear from Students where registerno=?");
        ps.setString(1, regno);
        rs = ps.executeQuery();
        if (rs.next()) {
            name = rs.getString(1);
            degree = rs.getString(2);
            studying_year = rs.getString(3);
        }
        rs.close();
        ps.close();

        ps = con.prepareStatement("insert into AttendanceEntry values(?,?,?,?,?,?)");
        ps.setString(1, regno);
        ps.setString(2, name);
        ps.setString(3, degree);
        ps.setString(4, studying_year);
        ps.setString(5, "Present");
        ps.setString(6, new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
        ps.executeUpdate();
        ps.close();
    }
    
    
    ps2 = con.prepareStatement("select registerno,name,degree,studyingyear from Students where degree=(select dept from Staffs where staffid=?) and StudyingYear=(select InchargeYear from Staffs where staffid=?) and registerno not in (select registerno from AttendanceEntry where AttendanceDate=?)");
    ps2.setString(1, session.getAttribute("StaffId").toString());
    ps2.setString(2, session.getAttribute("StaffId").toString());
    ps2.setString(3, new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
    rs2=ps2.executeQuery();
    while(rs2.next()){
        String regno=rs2.getString(1);
        name=rs2.getString(2);
        degree=rs2.getString(3);
        studying_year=rs2.getString(4);
        
        ps = con.prepareStatement("insert into AttendanceEntry values(?,?,?,?,?,?)");
        ps.setString(1, regno);
        ps.setString(2, name);
        ps.setString(3, degree);
        ps.setString(4, studying_year);
        ps.setString(5, "Absent");
        ps.setString(6, new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
        ps.executeUpdate();
        ps.close();
    }
    rs2.close();
    ps2.close();
    
    response.sendRedirect("Attendance.jsp?msg=Attendance Entry Registered!!");
%>