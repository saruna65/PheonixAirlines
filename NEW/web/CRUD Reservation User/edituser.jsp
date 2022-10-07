<%@page import="com.TicketUser.dao.TicketUserDao"%>
<jsp:useBean id="u" class="com.TicketUser.bean.TicketUser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=TicketUserDao.save(u);
response.sendRedirect("EditReservUser.jsp");
%>