/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemberLogout;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "MemberLogout", urlPatterns = {"/MemberLogout"})
public class MemberLogout extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        
        
        HttpSession session = request.getSession();
      
            session.removeAttribute("Passportid");
             
           session.invalidate();
           
           response.sendRedirect("LoginPageMember.html");
    }

 
    }// </editor-fold>
