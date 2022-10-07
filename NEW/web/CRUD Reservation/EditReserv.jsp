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
    
    
<%@page import="com.Ticket.dao.TicketDao,com.Ticket.bean.*,java.util.*"%>
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
List<Ticket> list=TicketDao.getAllRecords();
request.setAttribute("list",list);
%>
   

    <div class="container" style="margin-top: 250px;">

        <h1>Manage Reservations</h1>
        <div class="row mt-5" style="overflow: auto; height: 400px;">
            <table class="table" id="myTable1">
               <thead style="position: sticky;  top: 0; background-color:#e9a1a1">
                  <tr>
              <th scope="col">Ticket ID</th>
                          <th scope="col">Passport No</th>
                          <th scope="col">Flying From</th>
                          <th scope="col">Flying To</th>
                          <th scope="col">Departing Date</th>
                          <th scope="col">Returning Date</th>
                          <th scope="col">Adults</th>
                          <th scope="col">Children</th>
                          <th scope="col">Travel Class</th>
                          <th scope="col">Action</th>
               
                  </tr>
               </thead>
               <tbody>
                   <c:forEach items="${list}" var="u">
                  <tr>
                     
                     <td>${u.geth()}</td>
                     <td>${u.geta()}</td>
                     <td>${u.getb()}</td>
                     <td>${u.getc()}</td>
                     <td>${u.getd()}</td>
                     <td>${u.geti()}</td>
                     <td>${u.gete()}</td>
                     <td>${u.getf()}</td>
                     <td>${u.getg()}</td>
                    
                     <td><a href="Rform.jsp?h=${u.geth()}">Edit</a> <a href="deleteuser.jsp?h=${u.geth()}" style="margin-left: 30px;">Delete</a></td>
                     
                     
                  </tr>
                  </c:forEach>
               </tbody>
            </table>
            
           </div>
           


    </div>

    
</body>
</html>