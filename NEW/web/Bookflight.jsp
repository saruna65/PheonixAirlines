	<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
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
	
		
	
	
		<link href="https://fonts.googleapis.com/css?family=Lato:400,700" rel="stylesheet">
	
		<link rel="stylesheet" href="css/bootstrap.min.css" >
		
	
		<link  rel="stylesheet" href="css/style.css" >

	
		
	</head>
	
	<body>
            
         
                  
<div id="booking" class="section">
  <a class="navbar-brand" href="Home.html">
      <img src="assets/imgs/Airline 1.png" alt="" height="70px;" width="60px;" style="margin-left: 100px; margin-top: 30px;">
            </a>
		<div class="section-center">
		<div class="container">
		<div class="row">
		<div class="col-md-4">
							
		</div>
		<div class="col-md-7 col-md-offset-1">
		<div class="booking-form">
                   
                       <form action="ReserveServelet" method="post">
			  
				<div class="row">
				<div class="col-md-6">
				<div class="form-group">
			<span class="form-label" >Flying From</span>
                        <select class="form-control" name="ff">
                                <%
            
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          Statement st= con.createStatement();
            
          String str="select * from flightdetails";
          ResultSet rs=st.executeQuery(str);
          
          while(rs.next()){
                  %>      
			<option><%=rs.getString("DepartureAirport")%></option>
			     <%    }
}
catch(Exception e){
}

   %> 
			</select>
			<span class="select-arrow"></span>
			</div>                                                                                  
			</div>
				<div class="col-md-6">
				<div class="form-group">
		                <span class="form-label" >Flying To</span>
                        <select class="form-control" name="ft">
                              <%
            
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          Statement st= con.createStatement();
            
          String str="select * from flightdetails";
          ResultSet rs=st.executeQuery(str);
          
          while(rs.next()){
                  %>
                            
                            
			       <option><%=rs.getString("ArrivalAirport")%></option>
                               
                               <%    }
}
catch(Exception e){
}

   %> 
                               
                               
                               
                               </select>
			<span class="select-arrow"></span>
				</div>
				</div>
			</div>
				<div class="row">
				<div class="col-md-6">
                                <div class="form-group">
				<span class="form-label">Departing</span>
				<input class="form-control" type="date" required name="de">
			</div>
			</div>
				<div class="col-md-6">
				<div class="form-group">
				<span class="form-label">Returning</span>
                                <input class="form-control" type="date" name="re">
			</div>
			</div>
			</div>
			<div class="row">
			<div class="col-md-4">
			<div class="form-group">
			<span class="form-label" >Adults (18+)</span>
                        <select class="form-control" name="ad">
			<option>1</option>
			<option>2</option>
			<option>3</option>
			</select>
			<span class="select-arrow"></span>
			</div>
			</div>
			<div class="col-md-4">
			<div class="form-group">
                        <span class="form-label" >Children (0-17)</span>
			<select class="form-control" name="ch">
			<option>0</option>
			<option>1</option>
			<option>2</option>
			</select>
			<span class="select-arrow"></span>
			</div>
			</div>
			<div class="col-md-4">
		<div class="form-group">
			<span class="form-label">Travel class</span>
                        <select class="form-control" name="cl">
			<option>Economy</option>
			<option>Business</option>
			<option>First</option>
			</select>
			<span class="select-arrow"></span>
		</div>
		</div>
			<div class="col-md-6">
			<div class="form-group">
			<span class="form-label">Passport No</span>
             <input class="form-control" type="text" placeholder="Passport No" name="pass">
		</div>
			</div>
			</div>
	<div class="form-btn">
            <button type="submit" class="submit-btn" style="color:007ACC ;" >Reserve</button>
	</div>
	</form>
        
	</div>
</div>
</div>
</div>
                    
</div>
            
  </body>
	
</html>