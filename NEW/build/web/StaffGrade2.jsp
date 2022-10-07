<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
    
<%
    
    
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    if(session.getAttribute("staffid")==null)
        response.sendRedirect("LoginPageStaff.html");
    
    %>
    
    
    <!-- page Navigation -->
    <nav class="navbar custom-navbar navbar-expand-md navbar-light fixed-top" data-spy="affix" data-offset-top="10">
        <div class="container">
            <a class="navbar-brand" href="Home.html">
                <img src="assets/imgs/Airline 1.png" alt="">
            </a>
            <button class="navbar-toggler ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">                     
                   <!-- <li class="nav-item">
                        <a class="nav-link" href="#service">Flight Management</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#about">Ticket Management</a>
                    </li>-->
                    <li class="nav-item">
                        <a class="nav-link" href="#AddFlight">Flights Management</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#Ticket">Tickets Details</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#Account">Accounts Details</a>
                    </li>
                    <li class="nav-item">
                       
                     <form action="StaffLogout">
                            
                            <input type="submit" class="btn btn-primary rounded" value="Logout" >
                            
                            
                        </form>     
                                                                            
                    </li>
                    
                    
                </ul>
            </div>
        </div>
    </nav>
    <!-- End Of Second Navigation -->
   



    <!-- Page Header -->
    <header class="header">
        <div class="overlay">
            <h1 class="subtitle">Fly High </h1>
            <h1 class="title">Pheoni <img src="assets/imgs/x.png" height="110px" width="90px">         Airlines</h1>  
            <h1 class="subtitle">Staff Grade 02 </h1>
        </div>  
        <div class="shape">
            <svg viewBox="0 0 1500 200">
                <path d="m 0,240 h 1500.4828 v -71.92164 c 0,0 -286.2763,-81.79324 -743.19024,-81.79324 C 300.37862,86.28512 0,168.07836 0,168.07836 Z"/>
            </svg>
        </div>  
       <div class="mouse-icon"><div class="wheel"></div></div>
    </header>



<section class="section" id="AddFlight">
<div class="container">
<br><br>
 <h3>Add Flight</h3>
 <hr>
 <div class="row mt-5">
    <div class="col-md-6">
      
         <form action="AddFlightServlet2" method="post">
             
          <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Flight ID" name="fid1" style="border-radius: 15px;">
        
          <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Airline Name" name="airname1" style="border-radius: 15px;">
       
          <input type="date" class="form-control" id="exampleFormControlInput1" placeholder="Date" name="date1" style="border-radius: 15px;">
       
          <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Ticket Price" name="tickprice1" style="border-radius: 15px;">
        
     
   
      
        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Depature Airport" name="depair1" style="border-radius: 15px;">
     
        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Arrival Airport" name="arrair1" style="border-radius: 15px;">
     
        
        <br>  <br>  <br>  <br> 
    
         <input type="submit" class="btn btn-primary rounded" style="width:250px; "  aria-haspopup="true" aria-expanded="false" value="Save" >
            
         <br>  <br> 
         
         <button type="reset" class="btn btn-primary rounded" style="width: 100px;">Cancel</button>
            
    
        
         </form>
    </div>
 </div> 
    
 <br><br><br>
 <h3> Flights Details</h3>
     <hr>
     <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Flight ID" title="Type in a name" style="width:250px; border-radius: 15px;">
     <div class="row mt-5" style="overflow: auto; height: 250px;">
                 
      <hr>
      
      <table class="table" id="myTable">
        <thead style="position: sticky;  top: 0; background-color:#E8E8E8">
         <tr>
           
            <th scope="col">Flight ID</th>
            <th scope="col">Airline Name</th>
            <th scope="col">Depature Airport</th>
            <th scope="col">Arrival Airport</th>
            <th scope="col">Date</th>
            <th scope="col">Price</th>
            
         </tr>
      </thead>
      <tbody>
           <%
         
     
     try{
         
         Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
       Statement st= con.createStatement();
         
       String str="select * from flightdetails";
       ResultSet rs=st.executeQuery(str);
       
       while(rs.next()){
               %>       
         <tr>
           
             <td><%=rs.getInt("FlightID")%></td>
            <td><%=rs.getString("AirlineName")%></td>
            <td><%=rs.getString("DepartureAirport")%></td>
            <td><%=rs.getString("ArrivalAirport")%></td>
            <td><%=rs.getString("Date")%></td>
            <td><%=rs.getDouble("TicketPrice")%></td>
         </tr>
         <%    }
}
catch(Exception e){
}

%>         
         
         
      </tbody> 
     
   </table>
   




  </div> 
  <a class="btn btn-primary rounded" href="CRUD Flight/EditFlights.jsp">Manage Details</a>
 </div>
 </section>




    <section class="section" id="Ticket">
     <div class="container">


  <h3>Tickets Details</h3>
  <hr>
  <input type="text" id="myInput1" onkeyup="myFunction1()" placeholder="Ticket ID" title="Type in a name" style="width:250px; border-radius: 15px;">
  <div class="row mt-5" style="overflow: auto; height: 250px;">
              
   <hr>
           
   <hr>
         
   <table class="table" id="myTable1">
       <thead style="position: sticky;  top: 0; background-color:#E8E8E8">
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
         </tr>
      </thead>
      <tbody>
         <%
        
           
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          Statement st= con.createStatement();
            
          String str="select * from reservationdetails";
          ResultSet rs=st.executeQuery(str);
          
          while(rs.next()){
                  %>    
                       <tr>
                          <td><%=rs.getInt("TicketID")%></td>   
                          <td><%=rs.getInt("PassportNo")%></td>
                          <td><%=rs.getString("FlyingFrom")%></td>
                          <td><%=rs.getString("FlyingTo")%></td>
                          <td><%=rs.getString("DepartingDate")%></td>
                          <td><%=rs.getString("ReturningDate")%></td>
                          <td><%=rs.getString("Adults")%></td>
                          <td><%=rs.getString("Children")%></td>
                          <td><%=rs.getString("TravelClass")%></td>
                       
                       </tr>
                      
                    </tbody>
                    <%    }
}
catch(Exception e){
}

   %>       
        
      </tbody>
   </table>
   




  </div>  

</div>
</section>



<section class="section" id="Account">
  <div class="container">

     <br>
          <h3>Accounts Details</h3>
          <hr>
          <input type="text" id="myInput3" onkeyup="myFunction2()" placeholder="Passport No" title="Type in a name" style="width:250px; border-radius: 15px;">
         <div class="row mt-5" style="overflow: auto; height: 250px;">
          <hr>
        

    <table class="table" id="myTable2">
        <thead style="position: sticky;  top: 0; background-color:#E8E8E8">
           <tr>
             <th scope="col">Passport No</th>
             <th scope="col">First Name</th>
             <th scope="col">Last Name</th>             
             <th scope="col">E-mail</th>
             <th scope="col">Password</th>
             <th scope="col">Country</th>
             <th scope="col">Province/State</th>
             <th scope="col">Address</th>
             <th scope="col">DOB</th>
             <th scope="col">Mobile No</th>
       </thead>
      <tbody>
        <%
         
     
     try{
         
         Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
       Statement st= con.createStatement();
         
       String str="select * from membersdetails";
       ResultSet rs=st.executeQuery(str);
       
       while(rs.next()){
               %> 
          <tr>
            <td><%=rs.getInt("Passportid")%></td>
            <td><%=rs.getString("FirstName")%></td>
            <td><%=rs.getString("LastName")%></td>
            <td><%=rs.getString("Email")%></td>
            <td><%=rs.getString("Password")%></td>
            <td><%=rs.getString("Country")%></td>
            <td><%=rs.getString("Province")%></td>
            <td><%=rs.getString("Address")%></td>
            <td><%=rs.getString("DOB")%></td>
            <td><%=rs.getString("PhoneNo")%></td>
            
          </tr>
         
          <%    }
}
catch(Exception e){
}

   %>         
   
      </tbody>
   </table>
         </div></div></section>

    
 <!-- Contact Section -->
 <section id="contact" class="section has-img-bg pb-0">
    
<div class="container">
<!-- Page Footer -->
<footer class="mt-5 py-4 border-top border-secondary">
    <p class="mb-0 small">&copy; <script>document.write(new Date().getFullYear())</script>
</footer>
<!-- End of Page Footer -->  
</div>
</section>

<!-- core  -->
<script src="assets/vendors/jquery/jquery-3.4.1.js"></script>
<script src="assets/vendors/bootstrap/bootstrap.bundle.js"></script>

<!-- bootstrap 3 affix -->
<script src="assets/vendors/bootstrap/bootstrap.affix.js"></script>

<!-- Isotope -->
<script src="assets/vendors/isotope/isotope.pkgd.js"></script>

<!-- LeadMark js -->
<script src="assets/js/leadmark.js"></script>



<script>
    function myFunction() {
      var input, filter, table, tr, td, i, txtValue;
      input = document.getElementById("myInput");
      filter = input.value.toUpperCase();
      table = document.getElementById("myTable");
      tr = table.getElementsByTagName("tr");
      for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[0];
        if (td) {
          txtValue = td.textContent || td.innerText;
          if (txtValue.toUpperCase().indexOf(filter) > -1) {
            tr[i].style.display = "";
          } else {
            tr[i].style.display = "none";
          }
        }       
      }
    }
    </script>
    

    <script>
      function myFunction1() {
        var input, filter, table, tr, td, i, txtValue;
        input = document.getElementById("myInput1");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable1");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) {
          td = tr[i].getElementsByTagName("td")[0];
          if (td) {
            txtValue = td.textContent || td.innerText;
            if (txtValue.toUpperCase().indexOf(filter) > -1) {
              tr[i].style.display = "";
            } else {
              tr[i].style.display = "none";
            }
          }       
        }
      }
      </script>

<script>
  function myFunction2() {
    var input, filter, table, tr, td, i, txtValue;
    input = document.getElementById("myInput2");
    filter = input.value.toUpperCase();
    table = document.getElementById("myTable2");
    tr = table.getElementsByTagName("tr");
    for (i = 0; i < tr.length; i++) {
      td = tr[i].getElementsByTagName("td")[0];
      if (td) {
        txtValue = td.textContent || td.innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
          tr[i].style.display = "";
        } else {
          tr[i].style.display = "none";
        }
      }       
    }
  }
  </script>
  
      


</body>
</html>
