<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="CRUD.Flight.DAO.UserDao,CRUD.Flight.Bean.User"%>

<%
String id=request.getParameter("fid2");
User u=UserDao.getRecordById(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form action="edituser.jsp" method="post">
<input type="hidden" name="fid2" value="<%=u.getfid2() %>"/>
<table>
<tr><td>Name:</td><td><input type="text" name="airname2" value="<%= u.getairname2()%>"/></td></tr>
<tr><td>Name:</td><td><input type="date" name="date2" value="<%= u.getdate2()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="tickprice2" value="<%= u.gettickprice2()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="depair2" value="<%= u.getdepair2()%>"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="arrair2" value="<%= u.getarrair2()%>"/></td></tr>








<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
</table>
</form>

</body>
</html>