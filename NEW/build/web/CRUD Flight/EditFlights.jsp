<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   
    <title> Pheoni X Airlines</title>
    
    <link rel="icon" type="image/x-icon" href="assets/imgs/Airline 1.png">
        
    <!-- font icons -->
    <link rel="stylesheet" href="assets/vendors/themify-icons/css/themify-icons.css">
    <!-- Bootstrap + LeadMark main styles -->
    
    
    <link rel="stylesheet" href="assets/css/leadmark.css">

    <link rel="stylesheet" href="assets/css/Form.css">

</head>
<body data-spy="scroll" data-target=".navbar" data-offset="40" id="home">
    
    
<%@page import="CRUD.Flight.DAO.UserDao,CRUD.Flight.Bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
    <nav class="navbar custom-navbar navbar-expand-md navbar-light fixed-top" data-spy="affix" data-offset-top="10">
        <div class="container">
            <a class="navbar-brand" href="#">
                <img src="assets/imgs/Airline 1.png" alt="">
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
    if(session.getAttribute("staffid")==null)
        response.sendRedirect("LoginPageStaff.html");
    
    %>
    
<%
List<User> list=UserDao.getAllRecords();
request.setAttribute("list",list);
%>
   

    <div class="container" style="margin-top: 250px;">


        <div class="row mt-5" style="overflow: auto; height: 400px;">
            <table class="table" id="myTable1">
               <thead style="position: sticky;  top: 0; background-color:#e9a1a1">
                  <tr>
               <th>Flight ID</th>
               <th>Airline Name</th>
               <th>Depature Airport</th>
               <th>Arrival Airport</th>
               <th>Date</th>
               <th>Price</th>
               <th>Action</th>
               
                  </tr>
               </thead>
               <tbody>
                   <c:forEach items="${list}" var="u">
                  <tr>
                     
                     <td>${u.getfid2()}</td>
                     <td>${u.getairname2()}</td>
                     <td>${u.getdepair2()}</td>
                     <td>${u.getarrair2()}</td>
                     <td>${u.getdate2()}</td>
                     <td>${u.gettickprice2()}</td>
                     <td><a href="FlightForm.jsp?fid2=${u.getfid2()}">Edit</a> <a href="deleteuser.jsp?fid2=${u.getfid2()}" style="margin-left: 30px;">Delete</a></td>
                     
                     
                  </tr>
                  </c:forEach>
               </tbody>
            </table>
            
           </div>
           


    </div>

    
</body>
</html>