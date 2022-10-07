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
    
<%@page import="com.Ticket.dao.TicketDao,com.Ticket.bean.Ticket"%>

<%
String id=request.getParameter("h");
Ticket u=TicketDao.getRecordById(Integer.parseInt(id));
%>
 
<section class="section" id="AddFlight">
<div class="container">
<br><br>
 <h3>Update Reservation Details</h3>
 <hr>
 <div class="row mt-5">
    <div class="col-md-6">
      
     <form action="edituser.jsp" method="post">
       
          <input type="hidden"  name="h"  value="<%=u.geth()%>">
        
          <input type="text" class="form-control" id="exampleFormControlInput1"  name="a" style="border-radius: 15px;" value="<%=u.geta()%>">
       
          <input type="text" class="form-control" id="exampleFormControlInput1"  name="b" style="border-radius: 15px;" value="<%=u.getb()%>">
       
          <input type="text" class="form-control" id="exampleFormControlInput1" name="c" style="border-radius: 15px;" value="<%=u.getc()%>">
        
     
   
      
        <input type="date" class="form-control" id="exampleFormControlInput1" name="d" style="border-radius: 15px;" value="<%=u.getd()%>">
     
        <input type="date" class="form-control" id="exampleFormControlInput1" name="i" style="border-radius: 15px;" value="<%=u.geti()%>">
        
        <input type="text" class="form-control" id="exampleFormControlInput1" name="e" style="border-radius: 15px;" value="<%=u.gete()%>">
        
        <input type="text" class="form-control" id="exampleFormControlInput1" name="f" style="border-radius: 15px;" value="<%=u.getf()%>">
        
       <input type="text" class="form-control" id="exampleFormControlInput1" name="g" style="border-radius: 15px;" value="<%=u.getg()%>">
     
        
        <br>  <br>  <br>  <br> 
    
          <input type="submit" class="btn btn-primary rounded" style="width:250px; "  aria-haspopup="true" aria-expanded="false" value="Update" >
            
         <br>  <br> 
         
         <button type="reset" class="btn btn-primary rounded" style="width: 100px;">Cancel</button>
        </form>

    </div>
 </div
</section>
    
   
    
</body>
</html>