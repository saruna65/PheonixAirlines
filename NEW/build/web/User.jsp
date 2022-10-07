<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   
   
   <title> Pheoni X Airlines</title>
    
    <link rel="icon" type="image/x-icon" href="assets/imgs/Airline 1.png">
        
  
    <link rel="stylesheet" href="assets/vendors/themify-icons/css/themify-icons.css">
 
	<link rel="stylesheet" href="assets/css/leadmark.css">

    <link rel="stylesheet" href="assets/css/Form.css">

</head>
<body data-spy="scroll" data-target=".navbar" data-offset="40" id="home">

<%
    
    
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    if(session.getAttribute("Passportid")==null)
        response.sendRedirect("LoginPageMember.html");
    
    %>
    
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
                    <li class="nav-item">
                    <img src="img/user.png" alt="" height="25px;" width="25px;" style="margin-left: 0em; margin-top:5px;">
                      </li>
                  <li class="nav-item">
                      

                        <a class="nav-link"href="#myprofile">My Profile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#Reser">Reservations</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#FlightD">Search Flights</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Bookflight.jsp">Book Flight</a>
                    </li>
                    
                    <li class="nav-item">
                          
                     <form action="MemberLogout">
                            
                            <input type="submit" class="btn btn-primary rounded" value="Logout" >
                            
                            
                        </form>
                       
                    </li>
                    
                </ul>
            </div>
        </div>
    </nav>

   

    <header class="header">
        <div class="overlay">
            <h1 class="subtitle">Fly High </h1>
            <h1 class="title">Pheoni <img src="assets/imgs/x.png" height="110px" width="90px">         Airlines</h1> 
            <h1 class="subtitle">Welcome </h1>
        </div>  
        <div class="shape">
            <svg viewBox="0 0 1500 200">
                <path d="m 0,240 h 1500.4828 v -71.92164 c 0,0 -286.2763,-81.79324 -743.19024,-81.79324 C 300.37862,86.28512 0,168.07836 0,168.07836 Z"/>
            </svg>
        </div>  
       <div class="mouse-icon"><div class="wheel"></div></div>
    </header>


    <section class="section" id="FlightD">
        <div class="container">
            
            
            <br>
        
            <h3> Search Flights Details</h3>
            <hr>
            <form action="TableSearch2.jsp">
     
              <div class="form-row">
                 
                  <div class="form-group col-sm-4">
                      <input type="text"  name="to" placeholder="Arrival Destination" style="  border-radius: 15px;">
                     
                  </div>
                  <div class="form-group col-sm-4">
                      <input type="date" class="form-control text-black rounded-0 " name="date"  style="height: 60px">
                   
                </div>
                  <div class="form-group col-sm-4">
                      <button type="submit" class="btn btn-primary rounded w-md mt-3" type="submit" style="width: 250px">Search</button>
                </div>
                                      
              </div>  
      
          </form>
       
       
       
            </div>  
           </div>
           </section>


 
           <section class="section" id="Reser">
            <div class="container">
                
                
                <br>
            
                <h3>My Reservations</h3>
                <hr>
                <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Ticket ID" title="Type in a name" style="width:250px;">
    
                <div class="row mt-5" style="overflow: auto; height: 250px;">
                            
                 <hr>
                 
                 <table class="table" id="myTable" >
                      
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
           String r = (String) session.getAttribute("Passportid");
           
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          Statement st= con.createStatement();
            
          String str="select * from reservationdetails where PassportNo='"+r+"'";
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
                 </table>
                 
           
             
           
           
                </div>
                 <a class="btn btn-primary rounded" href="CRUD Reservation User/EditReservUser.jsp">Update Reservations</a>
               </div>
               </section>
    

           <section class="section" id="myprofile">
            <div class="container">
    
                <br>
           
                
    <h1  style="text-align: center;"> My Profile</h1>
    <table class="table table-bordered"  >
       
           
       
       <tbody>
             <%
           String pass = (String) session.getAttribute("Passportid");
           
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          Statement st= con.createStatement();
            
          String str="select * from membersdetails where Passportid='"+pass+"'";
          ResultSet rs=st.executeQuery(str);
          
          while(rs.next()){
                  %>    
          <tr>
             <th scope="row" style="width:100px ;">First Name</th>
             <td style="width:300px ;"><%=rs.getString("FirstName")%></td>
             
          </tr>
          <tr>
            <th scope="row" style="width:100px ;">Last Name</th>
             <td style="width:200px ;"><%=rs.getString("LastName")%></td>
             
          </tr>
         
          <tr>
            <th scope="row" style="width:100px ;">Passport No</th>
            <td style="width:200px ;"><%=rs.getInt("Passportid")%></td>
         </tr>
         <tr>
            <th scope="row" style="width:100px ;">Email</th>
            <td style="width:200px ;"><%=rs.getString("Email")%></td>
         </tr>
         <tr>
            <th scope="row" style="width:100px ;">Password</th>
            <td style="width:200px ;"><%=rs.getString("Password")%></td>
         </tr>
         <tr>
            <th scope="row" style="width:100px ;">Country</th>
            <td style="width:200px ;"><%=rs.getString("Country")%></td>
         </tr>
         <tr>
            <th scope="row" style="width:100px ;">Province</th>
            <td style="width:200px ;"><%=rs.getString("Province")%></td>
         </tr>
         <tr>
            <th scope="row" style="width:100px ;">Address</th>
            <td style="width:200px ;"><%=rs.getString("Address")%></td>
         <tr>
            <th scope="row" style="width:100px ;">Date of birth</th>
            <td style="width:200px ;"><%=rs.getString("DOB")%></td>
         </tr>
         <tr>
            <th scope="row" style="width:100px ;">Mobile number</th>
            <td style="width:200px ;"><%=rs.getString("PhoneNo")%></td>
         </tr>
          <%    }
}
catch(Exception e){
}

   %>       
       </tbody>
    </table>
       <a class="btn btn-primary rounded" href="CRUD Flight/EditFlights.jsp" style="margin-left: 500px;">Edit Profile</a>
            </div>
       
           </section>
               
               
    

 <section id="contact" class="section has-img-bg pb-0">
    
<div class="container">

<footer class="mt-5 py-4 border-top border-secondary">
    <p class="mb-0 small">&copy; <script>document.write(new Date().getFullYear())</script>
</footer>

</div>
</section>


<script src="assets/vendors/jquery/jquery-3.4.1.js"></script>
<script src="assets/vendors/bootstrap/bootstrap.bundle.js"></script>


<script src="assets/vendors/bootstrap/bootstrap.affix.js"></script>


<script src="assets/vendors/isotope/isotope.pkgd.js"></script>


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
  

</body>
</html>
