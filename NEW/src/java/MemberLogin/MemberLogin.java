/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemberLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "MemberLogin", urlPatterns = {"/MemberLogin"})
public class MemberLogin extends HttpServlet {

    
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        String passno = request.getParameter("passno");
        String psw = request.getParameter("psw");
       
        
        
        try{
            
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          
          Statement st= con.createStatement();
          
           ResultSet rs=st.executeQuery("select * from  membersdetails where Passportid='"+passno+"' and Password='"+psw+"'");
           
           if(rs.next()){
               
               HttpSession session=request.getSession(true);
               session.setAttribute("Passportid", passno);
               
               response.sendRedirect(request.getContextPath()+"/User.jsp");
               
               
           }else{
               
                  
           out.println("<script type=\"text/javascript\">");
           out.println("alert('Please Check Your Login Credentials');");
           out.println("location='LoginFailedMember.jsp';");
           out.println("</script>");
               
           }
            
        }catch(Exception e){
            
            
        }
     
        
     
     
     
     }
}
