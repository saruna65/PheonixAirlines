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
    
<%@page import="CRUD.Flight.DAO.UserDao,CRUD.Flight.Bean.User"%>

<%
String id=request.getParameter("fid2");
User u=UserDao.getRecordById(Integer.parseInt(id));
%>
 
<section class="section" id="AddFlight">
<div class="container">
<br><br>
 <h3>Update Flight Details</h3>
 <hr>
 <div class="row mt-5">
    <div class="col-md-6">
      
     <form action="edituser.jsp" method="post">
       
          <input type="hidden"  name="fid2"  value="<%=u.getfid2()%>">
        
          <input type="text" class="form-control" id="exampleFormControlInput1"  name="airname2" style="border-radius: 15px;" value="<%=u.getairname2()%>">
       
          <input type="date" class="form-control" id="exampleFormControlInput1"  name="date2" style="border-radius: 15px;" value="<%=u.getdate2()%>">
       
          <input type="text" class="form-control" id="exampleFormControlInput1" name="tickprice2" style="border-radius: 15px;" value="<%=u.gettickprice2()%>">
        
     
   
      
        <input type="text" class="form-control" id="exampleFormControlInput1" name="depair2" style="border-radius: 15px;" value="<%=u.getdepair2()%>">
     
        <input type="text" class="form-control" id="exampleFormControlInput1" name="arrair2" style="border-radius: 15px;" value="<%=u.getarrair2()%>">
     
        
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