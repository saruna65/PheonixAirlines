/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffLogin;

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
@WebServlet(name = "StaffLogin", urlPatterns = {"/StaffLogin"})
public class StaffLogin extends HttpServlet {

       
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        String sid = request.getParameter("sid");
        String psw = request.getParameter("psw");
        String Type=request.getParameter("Type");
        String ap=request.getParameter("ap");
        
        try{
            
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          
          Statement st= con.createStatement();
          
          ResultSet rs=st.executeQuery("select * from  staffdetails where StaffId='"+sid+"' and Password='"+psw+"' and Grade='"+Type+"' and Approve='"+ap+"' " );
           
           if(rs.next() && ("Grade 01".equals(rs.getString("Grade")) )&&("approved".equals(rs.getString("Approve")) )){
             
                   
               
               HttpSession session=request.getSession(true);
               session.setAttribute("staffid", sid);
               
               response.sendRedirect(request.getContextPath()+"/StaffGrade1.jsp");
               
       
           }                             
           else 
                   
           {
           out.println("<script type=\"text/javascript\">");
           out.println("alert('Please Check Your Login Credentials');");
           out.println("location='LoginFailedStaff.jsp';");
           out.println("</script>");
           }
            
        }catch(Exception e){
            
            
        }
       
        
        try{
            
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          
          Statement st= con.createStatement();
          
           ResultSet rs=st.executeQuery("select * from  staffdetails where StaffId='"+sid+"' and Password='"+psw+"' and Grade='"+Type+"'  and Approve='"+ap+"' " );
           
           if(rs.next() && ("Grade 02".equals(rs.getString("Grade")) )&&("approved".equals(rs.getString("Approve")) )){
             
                   
               
               HttpSession session=request.getSession(true);
               session.setAttribute("staffid", sid);
               
               response.sendRedirect(request.getContextPath()+"/StaffGrade2.jsp");
               
       
           }                             
           else 
                   
           {
               
           out.println("<script type=\"text/javascript\">");
            out.println("alert('Please Check Your Login Credentials');");
           out.println("location='LoginFailedStaff.jsp';");
           out.println("</script>");
             //  response.sendRedirect(request.getContextPath()+"/LoginFailedStaff.jsp");
           }
            
        }catch(Exception e){
            
            
        } 
      
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

   

}
