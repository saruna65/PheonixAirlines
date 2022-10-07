package org.apache.jsp.CRUD_0020Reservation_0020User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.List;
import com.TicketUser.dao.TicketUserDao;
import com.TicketUser.bean.TicketUser;

public final class EditReservUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <title> Pheoni X Airlines</title>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/imgs/Airline 1.png\">\r\n");
      out.write("        \r\n");
      out.write("    <!-- font icons -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/themify-icons/css/themify-icons.css\">\r\n");
      out.write("    <!-- Bootstrap + LeadMark main styles -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/leadmark.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Form.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"40\" id=\"home\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <nav class=\"navbar custom-navbar navbar-expand-md navbar-light fixed-top\" data-spy=\"affix\" data-offset-top=\"10\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                <img src=\"assets/imgs/Airline 1.png\" alt=\"\">\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">                     \r\n");
      out.write("                    \r\n");
      out.write("                  \r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\" style=\"margin-top: 250px;\">\r\n");
      out.write("\r\n");
      out.write("        <h1>Manage Reservations</h1>\r\n");
      out.write("        <div class=\"row mt-5\" style=\"overflow: auto; height: 400px;\">\r\n");
      out.write("            <table class=\"table\" id=\"myTable1\">\r\n");
      out.write("               <thead style=\"position: sticky;  top: 0; background-color:#e9a1a1\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("              <th scope=\"col\">Ticket ID</th>\r\n");
      out.write("                          <th scope=\"col\">Passport No</th>\r\n");
      out.write("                          <th scope=\"col\">Flying From</th>\r\n");
      out.write("                          <th scope=\"col\">Flying To</th>\r\n");
      out.write("                          <th scope=\"col\">Departing Date</th>\r\n");
      out.write("                          <th scope=\"col\">Returning Date</th>\r\n");
      out.write("                          <th scope=\"col\">Adults</th>\r\n");
      out.write("                          <th scope=\"col\">Children</th>\r\n");
      out.write("                          <th scope=\"col\">Travel Class</th>\r\n");
      out.write("                          <th scope=\"col\">Action</th>\r\n");
      out.write("               \r\n");
      out.write("                  </tr>\r\n");
      out.write("               </thead>\r\n");
      out.write("               <tbody>\r\n");
      out.write("                   ");

                   
                       String rr = (String) session.getAttribute("Passportid"); 
                       
                       
                       try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
                   
                   PreparedStatement ps=con.prepareStatement("select * from reservationdetails where PassportNo='"+rr+"'");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
                    
                
			TicketUser u=new TicketUser();
			u.sethh(rs.getInt("TicketID"));
		
                   
                 
                   
      out.write("\r\n");
      out.write("                  <tr>\r\n");
      out.write("                     \r\n");
      out.write("                     <td>");
      out.print(rs.getInt("TicketID"));
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(rs.getInt("PassportNo"));
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(rs.getString("FlyingFrom"));
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(rs.getString("FlyingTo"));
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(rs.getString("DepartingDate"));
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(rs.getString("ReturningDate"));
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(rs.getString("Adults"));
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(rs.getString("Children"));
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(rs.getString("TravelClass"));
      out.write("</td>\r\n");
      out.write("                    \r\n");
      out.write("                     <td><a href=\"Rform.jsp?hh=");
u.gethh();
      out.write("\">Edit</a></td>\r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                  </tr>\r\n");
      out.write("                \r\n");
      out.write("               </tbody>\r\n");
      out.write("               </tbody>\r\n");
      out.write("                    ");
    }
}
catch(Exception e){
}

   
      out.write("       \r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("           </div>\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
