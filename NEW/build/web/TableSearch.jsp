<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!doctype html>
<html lang="en">
  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title> Pheoni X Airlines</title>
    
    <link rel="icon" type="image/x-icon" href="assets/imgs/Airline 1.png">
	<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="csstable/styletable.css">

	</head>
	<body>
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="table-wrap">
						<table class="table">
						  <thead class="thead-primary">
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
            
          
          String from=request.getParameter("from"); 
          String to=request.getParameter("to"); 
         
          
          String str="select * from flightdetails where DepartureAirport='"+from+"' and ArrivalAirport='"+to+"'";
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
				</div>
			</div>
		</div>
	</section>

<script src="jstable/jquery.min1.js"></script>
  <script src="jstable/popper1.js"></script>
  <script src="jstable/bootstrap.min1.js"></script>
  <script src="jstable/main1.js"></script>

	</body>
</html>

