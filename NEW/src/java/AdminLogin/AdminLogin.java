/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
@WebServlet(name = "AdminLogin", urlPatterns = {"/AdminLogin"})
public class AdminLogin extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        String uname = request.getParameter("uname");
        String psw = request.getParameter("psw");
       
        
        
        try{
            
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          
          Statement st= con.createStatement();
          
           ResultSet rs=st.executeQuery("select * from  adminlogin where AdminId='"+uname+"' and Password='"+psw+"'");
           
           if(rs.next()){
               
               HttpSession session=request.getSession(true);
               session.setAttribute("username", uname);
               
               response.sendRedirect(request.getContextPath()+"/Admin.jsp");
               
               
           }else{
               
           out.println("<script type=\"text/javascript\">");
           out.println("alert('Please Check Your Login Credentials');");
           out.println("location='LoginFailedAdmin.jsp';");
           out.println("</script>");
               
           }
            
        }catch(Exception e){
            
            
        }
        
        
        
        
        
        
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
