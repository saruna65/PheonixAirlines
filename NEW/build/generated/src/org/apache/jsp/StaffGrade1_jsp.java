package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.Connection;

public final class StaffGrade1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <title> Pheoni X Airlines</title>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/imgs/Airline 1.png\">\r\n");
      out.write("        \r\n");
      out.write("   \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/themify-icons/css/themify-icons.css\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/leadmark.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Form.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"40\" id=\"home\">\r\n");
      out.write("\r\n");
      out.write("     ");

    
    
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    if(session.getAttribute("staffid")==null)
        response.sendRedirect("LoginPageStaff.html");
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- page Navigation -->\r\n");
      out.write("    <nav class=\"navbar custom-navbar navbar-expand-md navbar-light fixed-top\" data-spy=\"affix\" data-offset-top=\"10\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("              <a class=\"navbar-brand\" href=\"Home.html\">\r\n");
      out.write("                <img src=\"assets/imgs/Airline 1.png\" alt=\"\">\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">                     \r\n");
      out.write("                   <!-- <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#service\">Flight Management</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#about\">Ticket Management</a>\r\n");
      out.write("                    </li>-->\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#AddFlight\">Flight Management</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#Ticket\">Ticket Management</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#Account\">Account Management</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                   <li class=\"nav-item\">\r\n");
      out.write("                       \r\n");
      out.write("                   <form action=\"StaffLogout\">\r\n");
      out.write("                            \r\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary rounded\" value=\"Logout\" >\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                        </form>                                                \r\n");
      out.write("                         \r\n");
      out.write("                  </li>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- End Of Second Navigation -->\r\n");
      out.write("   \r\n");
      out.write("    <!-- Page Header -->\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <div class=\"overlay\">\r\n");
      out.write("            <h1 class=\"subtitle\">Fly High </h1>\r\n");
      out.write("            <h1 class=\"title\">Pheoni <img src=\"assets/imgs/x.png\" height=\"110px\" width=\"90px\">         Airlines</h1>\r\n");
      out.write("            <h1 class=\"subtitle\">Staff Grade 01 </h1>\r\n");
      out.write("        </div>  \r\n");
      out.write("        <div class=\"shape\">\r\n");
      out.write("            <svg viewBox=\"0 0 1500 200\">\r\n");
      out.write("                <path d=\"m 0,240 h 1500.4828 v -71.92164 c 0,0 -286.2763,-81.79324 -743.19024,-81.79324 C 300.37862,86.28512 0,168.07836 0,168.07836 Z\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("        </div>  \r\n");
      out.write("       <div class=\"mouse-icon\"><div class=\"wheel\"></div></div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("<section class=\"section\" id=\"AddFlight\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<br><br>\r\n");
      out.write(" <h3>Add Flight</h3>\r\n");
      out.write(" <hr>\r\n");
      out.write(" <div class=\"row mt-5\">\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("      \r\n");
      out.write("      <form action=\"AddFlightServlet\" method=\"post\">\r\n");
      out.write("       \r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Flight ID\" name=\"fid\" style=\"border-radius: 15px;\">\r\n");
      out.write("        \r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Airline Name\" name=\"airname\" style=\"border-radius: 15px;\">\r\n");
      out.write("       \r\n");
      out.write("          <input type=\"date\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Date\" name=\"date\" style=\"border-radius: 15px;\">\r\n");
      out.write("       \r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Ticket Price\" name=\"tickprice\" style=\"border-radius: 15px;\">\r\n");
      out.write("        \r\n");
      out.write("     \r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Depature Airport\" name=\"depair\" style=\"border-radius: 15px;\">\r\n");
      out.write("     \r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Arrival Airport\" name=\"arrair\" style=\"border-radius: 15px;\">\r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("        <br>  <br>  <br>  <br> \r\n");
      out.write("    \r\n");
      out.write("          <input type=\"submit\" class=\"btn btn-primary rounded\" style=\"width:250px; \"  aria-haspopup=\"true\" aria-expanded=\"false\" value=\"Save\" >\r\n");
      out.write("            \r\n");
      out.write("         <br>  <br> \r\n");
      out.write("         \r\n");
      out.write("         <button type=\"reset\" class=\"btn btn-primary rounded\" style=\"width: 100px;\">Cancel</button>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write(" </div> \r\n");
      out.write("    \r\n");
      out.write("    <br><br><br>\r\n");
      out.write("    <h3> Flights Details</h3>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Flight ID\" title=\"Type in a name\" style=\"width:250px; border-radius: 15px;\">\r\n");
      out.write("        <div class=\"row mt-5\" style=\"overflow: auto; height: 250px;\">\r\n");
      out.write("                    \r\n");
      out.write("         <hr>\r\n");
      out.write("         \r\n");
      out.write("         <table class=\"table\" id=\"myTable\">\r\n");
      out.write("         <thead style=\"position: sticky;  top: 0; background-color:#E8E8E8\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              \r\n");
      out.write("               <th scope=\"col\">Flight ID</th>\r\n");
      out.write("               <th scope=\"col\">Airline Name</th>\r\n");
      out.write("               <th scope=\"col\">Depature Airport</th>\r\n");
      out.write("               <th scope=\"col\">Arrival Airport</th>\r\n");
      out.write("               <th scope=\"col\">Date</th>\r\n");
      out.write("               <th scope=\"col\">Price</th>\r\n");
      out.write("               \r\n");
      out.write("            </tr>\r\n");
      out.write("         </thead>\r\n");
      out.write("         <tbody>\r\n");
      out.write("              ");

            
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          Statement st= con.createStatement();
            
          String str="select * from flightdetails";
          ResultSet rs=st.executeQuery(str);
          
          while(rs.next()){
                  
      out.write("       \r\n");
      out.write("            <tr>\r\n");
      out.write("              \r\n");
      out.write("                <td>");
      out.print(rs.getInt("FlightID"));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString("AirlineName"));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString("DepartureAirport"));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString("ArrivalAirport"));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString("Date"));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getDouble("TicketPrice"));
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
    }
}
catch(Exception e){
}

   
      out.write("         \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("         </tbody> \r\n");
      out.write("        \r\n");
      out.write("      </table>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     </div> \r\n");
      out.write("   \r\n");
      out.write("     <a class=\"btn btn-primary rounded\" href=\"CRUD Flight/EditFlights.jsp\">Manage Details</a>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"section\" id=\"Ticket\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("         <div class=\"row mt-5\">\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <h3>Update And Delete Ticket Details</h3>\r\n");
      out.write("     <hr>\r\n");
      out.write("          \r\n");
      out.write("     <input type=\"text\" id=\"myInput2\" onkeyup=\"myFunction1()\" placeholder=\"Ticket ID\" title=\"Type in a name\" style=\"width:250px; border-radius: 15px;\">\r\n");
      out.write("     <div class=\"row mt-5\" style=\"overflow: auto; height: 250px;\">\r\n");
      out.write("      <table class=\"table\" id=\"myTable1\">\r\n");
      out.write("         <thead style=\"position: sticky;  top: 0; background-color:#E8E8E8\">\r\n");
      out.write("            <tr>\r\n");
      out.write("               <th scope=\"col\">Ticket ID</th>\r\n");
      out.write("                          <th scope=\"col\">Passport No</th>\r\n");
      out.write("                          <th scope=\"col\">Flying From</th>\r\n");
      out.write("                          <th scope=\"col\">Flying To</th>\r\n");
      out.write("                          <th scope=\"col\">Departing Date</th>\r\n");
      out.write("                          <th scope=\"col\">Returning Date</th>\r\n");
      out.write("                          <th scope=\"col\">Adults</th>\r\n");
      out.write("                          <th scope=\"col\">Children</th>\r\n");
      out.write("                          <th scope=\"col\">Travel Class</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("         </thead>\r\n");
      out.write("         <tbody>\r\n");
      out.write("         ");

        
           
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          Statement st= con.createStatement();
            
          String str="select * from reservationdetails";
          ResultSet rs=st.executeQuery(str);
          
          while(rs.next()){
                  
      out.write("    \r\n");
      out.write("                       <tr>\r\n");
      out.write("                          <td>");
      out.print(rs.getInt("TicketID"));
      out.write("</td>   \r\n");
      out.write("                          <td>");
      out.print(rs.getInt("PassportNo"));
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print(rs.getString("FlyingFrom"));
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print(rs.getString("FlyingTo"));
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print(rs.getString("DepartingDate"));
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print(rs.getString("ReturningDate"));
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print(rs.getString("Adults"));
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print(rs.getString("Children"));
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print(rs.getString("TravelClass"));
      out.write("</td>\r\n");
      out.write("                       \r\n");
      out.write("                       </tr>\r\n");
      out.write("                      \r\n");
      out.write("                    </tbody>\r\n");
      out.write("                    ");
    }
}
catch(Exception e){
}

   
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("      </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      \r\n");
      out.write("     </div>\r\n");
      out.write("      <a class=\"btn btn-primary rounded\" href=\"CRUD Reservation/EditReserv.jsp\">Manage Details</a>\r\n");
      out.write(" </div> \r\n");
      out.write(" </section>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("<section class=\"section\" id=\"Account\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("       <br>\r\n");
      out.write("            <h3>Manage Accounts</h3>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <input type=\"text\" id=\"myInput3\" onkeyup=\"myFunction2()\" placeholder=\"Passport No\" title=\"Type in a name\" style=\"width:250px; border-radius: 15px;\">\r\n");
      out.write("           <div class=\"row mt-5\" style=\"overflow: auto; height: 250px;\">\r\n");
      out.write("            <hr>\r\n");
      out.write("          \r\n");
      out.write(" \r\n");
      out.write("       <table class=\"table\" id=\"myTable2\">\r\n");
      out.write("       <thead style=\"position: sticky;  top: 0; background-color:#E8E8E8\">\r\n");
      out.write("           <tr>\r\n");
      out.write("             <th scope=\"col\">Passport No</th>\r\n");
      out.write("             <th scope=\"col\">First Name</th>\r\n");
      out.write("             <th scope=\"col\">Last Name</th>             \r\n");
      out.write("             <th scope=\"col\">E-mail</th>\r\n");
      out.write("             <th scope=\"col\">Password</th>\r\n");
      out.write("             <th scope=\"col\">Country</th>\r\n");
      out.write("             <th scope=\"col\">Province/State</th>\r\n");
      out.write("             <th scope=\"col\">Address</th>\r\n");
      out.write("             <th scope=\"col\">DOB</th>\r\n");
      out.write("             <th scope=\"col\">Mobile No</th>\r\n");
      out.write("       </thead>\r\n");
      out.write("      <tbody>\r\n");
      out.write("        ");

         
     
     try{
         
         Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
       Statement st= con.createStatement();
         
       String str="select * from membersdetails";
       ResultSet rs=st.executeQuery(str);
       
       while(rs.next()){
               
      out.write(" \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>");
      out.print(rs.getInt("Passportid"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("FirstName"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("LastName"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("Email"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("Password"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("Country"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("Province"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("Address"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("DOB"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("PhoneNo"));
      out.write("</td>\r\n");
      out.write("            \r\n");
      out.write("          </tr>\r\n");
      out.write("         \r\n");
      out.write("          ");
    }
}
catch(Exception e){
}

   
      out.write("         \r\n");
      out.write("   \r\n");
      out.write("      </tbody>\r\n");
      out.write("   </table>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("   <br>\r\n");
      out.write("            <a class=\"btn btn-primary rounded\" href=\"CRUD Flight/EditFlights.jsp\">Manage Account Details</a>\r\n");
      out.write("        <br><br> \r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("    </div> \r\n");
      out.write("</section>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!-- Contact Section -->\r\n");
      out.write("\r\n");
      out.write(" <section id=\"contact\" class=\"section has-img-bg pb-0\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- Page Footer -->\r\n");
      out.write("        <footer class=\"mt-5 py-4 border-top border-secondary\">\r\n");
      out.write("            <p class=\"mb-0 small\">&copy; <script>document.write(new Date().getFullYear())</script>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- End of Page Footer -->  \r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- core  -->\r\n");
      out.write("<script src=\"assets/vendors/jquery/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script src=\"assets/vendors/bootstrap/bootstrap.bundle.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- bootstrap 3 affix -->\r\n");
      out.write("<script src=\"assets/vendors/bootstrap/bootstrap.affix.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Isotope -->\r\n");
      out.write("<script src=\"assets/vendors/isotope/isotope.pkgd.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- LeadMark js -->\r\n");
      out.write("<script src=\"assets/js/leadmark.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function myFunction() {\r\n");
      out.write("      var input, filter, table, tr, td, i, txtValue;\r\n");
      out.write("      input = document.getElementById(\"myInput\");\r\n");
      out.write("      filter = input.value.toUpperCase();\r\n");
      out.write("      table = document.getElementById(\"myTable\");\r\n");
      out.write("      tr = table.getElementsByTagName(\"tr\");\r\n");
      out.write("      for (i = 0; i < tr.length; i++) {\r\n");
      out.write("        td = tr[i].getElementsByTagName(\"td\")[0];\r\n");
      out.write("        if (td) {\r\n");
      out.write("          txtValue = td.textContent || td.innerText;\r\n");
      out.write("          if (txtValue.toUpperCase().indexOf(filter) > -1) {\r\n");
      out.write("            tr[i].style.display = \"\";\r\n");
      out.write("          } else {\r\n");
      out.write("            tr[i].style.display = \"none\";\r\n");
      out.write("          }\r\n");
      out.write("        }       \r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        function myFunction1() {\r\n");
      out.write("          var input, filter, table, tr, td, i, txtValue;\r\n");
      out.write("          input = document.getElementById(\"myInput2\");\r\n");
      out.write("          filter = input.value.toUpperCase();\r\n");
      out.write("          table = document.getElementById(\"myTable1\");\r\n");
      out.write("          tr = table.getElementsByTagName(\"tr\");\r\n");
      out.write("          for (i = 0; i < tr.length; i++) {\r\n");
      out.write("            td = tr[i].getElementsByTagName(\"td\")[0];\r\n");
      out.write("            if (td) {\r\n");
      out.write("              txtValue = td.textContent || td.innerText;\r\n");
      out.write("              if (txtValue.toUpperCase().indexOf(filter) > -1) {\r\n");
      out.write("                tr[i].style.display = \"\";\r\n");
      out.write("              } else {\r\n");
      out.write("                tr[i].style.display = \"none\";\r\n");
      out.write("              }\r\n");
      out.write("            }       \r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("    <script>\r\n");
      out.write("      function myFunction2() {\r\n");
      out.write("        var input, filter, table, tr, td, i, txtValue;\r\n");
      out.write("        input = document.getElementById(\"myInput3\");\r\n");
      out.write("        filter = input.value.toUpperCase();\r\n");
      out.write("        table = document.getElementById(\"myTable2\");\r\n");
      out.write("        tr = table.getElementsByTagName(\"tr\");\r\n");
      out.write("        for (i = 0; i < tr.length; i++) {\r\n");
      out.write("          td = tr[i].getElementsByTagName(\"td\")[0];\r\n");
      out.write("          if (td) {\r\n");
      out.write("            txtValue = td.textContent || td.innerText;\r\n");
      out.write("            if (txtValue.toUpperCase().indexOf(filter) > -1) {\r\n");
      out.write("              tr[i].style.display = \"\";\r\n");
      out.write("            } else {\r\n");
      out.write("              tr[i].style.display = \"none\";\r\n");
      out.write("            }\r\n");
      out.write("          }       \r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      </script>\r\n");
      out.write("<!--\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  function preventBack() { window.history.forward(); }\r\n");
      out.write("  setTimeout(\"preventBack()\", 0);\r\n");
      out.write("  window.onunload = function () { null };\r\n");
      out.write("</script>\r\n");
      out.write("-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
