<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   
    <title> Pheoni X Airlines</title>
    
    <link rel="icon" type="image/x-icon" href="assets/imgs/Airline1.png">
        
    
    <link rel="stylesheet" href="assets/vendors/themify-icons/css/themify-icons.css">

    <link rel="stylesheet" href="assets/css/leadmark.css">

    <link rel="stylesheet" href="assets/css/Form.css">

</head>
<body data-spy="scroll" data-target=".navbar" data-offset="40" id="home">
    
    
<nav class="navbar custom-navbar navbar-expand-md navbar-light fixed-top" data-spy="affix" data-offset-top="10">
        <div class="container">
            <a class="navbar-brand" href="#">
                <img src="assets/imgs/Airline1.png" alt="">
            </a>
            <button class="navbar-toggler ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">                     
                    
                  
                    
                </ul>
            </div>
        </div>
    </nav>
    
<%
    
    
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    if(session.getAttribute("username")==null)
        response.sendRedirect("LoginPageAdmin.html");
    
    %>
<%@page import="com.Staff.dao.StaffDao,com.Staff.bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%
List<Staff> list=StaffDao.getAllRecords();
request.setAttribute("list",list);
%>
<div class="container" style="margin-top: 250px;">

    <h1>Manage Staff</h1>
        <div class="row mt-5" style="overflow: auto; height: 400px;">
            <table class="table" id="myTable1">
               <thead style="position: sticky;  top: 0; background-color:#e9a1a1">
                  <tr>
            <th >Staff Id</th>
            <th >First Name</th>
            <th >Last Name</th>
            <th>Country</th>
            <th >Province</th>
            <th >Address</th>
            <th >NIC</th>
            <th >Password</th>
            <th >Grade</th>
            <th >DOB</th>
            <th >Phone</th>
             <th >Approve Status</th>
            <th >Action</th>
            
                  </tr>
               </thead>
               <tbody>

<c:forEach items="${list}" var="u">
    <tr>
	<td>${u.getsidn()}</td>
        <td>${u.getfnamen()}</td>
        <td>${u.getlnamen()}</td>
        <td>${u.getcntn()}</td>
        <td>${u.getprvn()}</td>
        <td>${u.getaddn()}</td>
        <td>${u.getnicn()}</td>
        <td>${u.getpswn()}</td>
        <td>${u.getselectn()}</td>
        <td>${u.getdobn()}</td>
        <td>${u.getphonen()}</td>
        <td>${u.getappn()}</td>
    
        <td><a href="editform.jsp?sidn=${u.getsidn()}">Approve</a><a href="deleteuser.jsp?sidn=${u.getsidn()} " style="margin-left: 30px">Delete</a></td>
          </tr>
                  </c:forEach>
               </tbody>
            </table>
            
           </div>
           


    </div>

    
</body>
</html>