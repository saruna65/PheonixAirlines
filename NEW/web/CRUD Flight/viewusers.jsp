<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
</head>
<body>

<%@page import="CRUD.Flight.DAO.UserDao,CRUD.Flight.Bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Users List</h1>

<%
List<User> list=UserDao.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Sex</th><th>Country</th><th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u">
	<tr><td>${u.getfid2()}</td><td>${u.getairname2()}</td><td>${u.getdepair2()}</td><td>${u.getarrair2()}</td><td>${u.getdate2()}</td><td>${u.gettickprice2()}</td><td><a href="FlightForm.jsp?fid2=${u.getfid2()}">Edit</a></td><td><a href="deleteuser.jsp?fid2=${u.getfid2()}">Delete</a></td></tr>
</c:forEach>
</table>



</body>
</html>