<%@page import="com.Ticket.dao.TicketDao"%>
<jsp:useBean id="u" class="com.Ticket.bean.Ticket"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=TicketDao.save(u);
response.sendRedirect("EditReserv.jsp");
%>