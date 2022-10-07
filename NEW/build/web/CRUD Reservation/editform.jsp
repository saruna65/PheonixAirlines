<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="com.Ticket.dao.TicketDao,com.Ticket.bean.Ticket"%>

<%
String id=request.getParameter("h");
Ticket u=TicketDao.getRecordById(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form action="edituser.jsp" method="post">
<input type="hidden" name="h" value="<%=u.geth() %>"/>


<table>
<tr><td>Name:</td><td><input type="text" name="a" value="<%= u.geta()%>"/></td></tr>
<tr><td>Name:</td><td><input type="date" name="b" value="<%= u.getb()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="c" value="<%= u.getc()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="d" value="<%= u.getd()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="i" value="<%= u.geti()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="e" value="<%= u.gete()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="f" value="<%= u.getf()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="g" value="<%= u.getg()%>"/></td></tr>





<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
</table>
</form>

</body>
</html>