<%@page import="CRUD.Flight.DAO.UserDao"%>
<jsp:useBean id="u" class="CRUD.Flight.Bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDao.update(u);
response.sendRedirect("EditFlights.jsp"); 
%>