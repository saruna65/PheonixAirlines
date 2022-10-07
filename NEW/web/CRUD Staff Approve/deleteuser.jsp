<%@page import="com.Staff.dao.StaffDao"%>
<jsp:useBean id="u" class="com.Staff.bean.Staff"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
StaffDao.delete(u);
response.sendRedirect("viewstaff.jsp");
%>