<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   
    <title> Pheoni X Airlines</title>
    
    <link rel="icon" type="image/x-icon" href="assets/imgs/Airline1.png">
        
    <!-- font icons -->
    <link rel="stylesheet" href="assets/vendors/themify-icons/css/themify-icons.css">
    <!-- Bootstrap + LeadMark main styles -->
    
    
    <link rel="stylesheet" href="assets/css/leadmark.css">

    <link rel="stylesheet" href="assets/css/Form.css">

</head>
<body data-spy="scroll" data-target=".navbar" data-offset="40" id="home">
<%@page import="com.Staff.dao.StaffDao,com.Staff.bean.Staff"%>

<%
String id=request.getParameter("sidn");
Staff u=StaffDao.getRecordById(Integer.parseInt(id));
%>

<section class="section" id="AddFlight">
<div class="container">
<br><br>
 <h3>Approve Staff</h3>
 <hr>
 <div class="row mt-5">
    <div class="col-md-6">
<form action="edituser.jsp" method="post">
<input type="hidden" name="sidn" value="<%=u.getsidn() %>">

<input type="text" class="form-control" name="fnamen" style="border-radius: 15px;" value="<%=u.getfnamen()%>">
<input type="text" class="form-control" name="lnamen" style="border-radius: 15px;" value="<%=u.getlnamen()%>">
<input type="text" class="form-control" name="cntn" style="border-radius: 15px;" value="<%=u.getcntn()%>">
<input type="text" class="form-control" name="prvn" style="border-radius: 15px;" value="<%=u.getprvn()%>">
<input type="text" class="form-control" name="addn" style="border-radius: 15px;" value="<%=u.getaddn()%>">
<input type="text" class="form-control" name="nicn" style="border-radius: 15px;" value="<%=u.getnicn()%>">
<input type="text" class="form-control" name="pswn" style="border-radius: 15px;" value="<%=u.getpswn()%>">
<input type="text" class="form-control" name="selectn" style="border-radius: 15px;" value="<%=u.getselectn()%>">
<input type="date" class="form-control" name="dobn" style="border-radius: 15px;" value="<%=u.getdobn()%>"/>
<input type="text" class="form-control" name="phonen" style="border-radius: 15px;" value="<%=u.getphonen()%>">
<input type="checkbox" id="vehicle1" name="appn" value="approved">
 <label for="vehicle1">Approve this staff member.</label><br>
 <br>  <br>  <br>  <br> 
    
          <input type="submit" class="btn btn-primary rounded" style="width:250px; "  aria-haspopup="true" aria-expanded="false" value="Update" >
            
         <br>  <br> 
         
         <button type="reset" class="btn btn-primary rounded" style="width: 100px;">Cancel</button>

</table>
</form>
</div>
 </div
</section>
</body>
</html>