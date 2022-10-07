<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="com.TicketUser.dao.TicketUserDao,com.TicketUser.bean.TicketUser"%>

<%
String id=request.getParameter("hh");
TicketUser u=TicketUserDao.getRecordById(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form action="edituser.jsp" method="post">
<input type="hidden" name="hh" value="<%=u.gethh() %>"/>


<table>
<tr><td>Name:</td><td><input type="text" name="aa" value="<%= u.getaa()%>"/></td></tr>
<tr><td>Name:</td><td><input type="date" name="bb" value="<%= u.getbb()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="cc" value="<%= u.getcc()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="dd" value="<%= u.getdd()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="ii" value="<%= u.getii()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="ee" value="<%= u.getee()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="ff" value="<%= u.getff()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="gg" value="<%= u.getgg()%>"/></td></tr>





<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
</table>
</form>

</body>
</html>