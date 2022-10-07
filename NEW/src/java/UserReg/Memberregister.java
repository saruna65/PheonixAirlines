/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserReg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "Memberregister", urlPatterns = {"/Memberregister"})
public class Memberregister extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Memberregister</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Memberregister at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       
       Ureg n1=new Ureg();
        
        
        int Pn2=Integer.parseInt(request.getParameter("Pn2"));
        String fname2=request.getParameter("fname2");
        String lname2=request.getParameter("lname2");
        String email2=request.getParameter("email2");
        String psw2=request.getParameter("psw2");
        String cnt2=request.getParameter("cnt2");
        String prv2=request.getParameter("prv2");
        String add2=request.getParameter("add2");
        String dob2=request.getParameter("dob2");
        String phone2=request.getParameter("phone2");
        
       
         
         
        n1.UserDetails( Pn2,fname2,lname2,email2,psw2,cnt2,prv2,add2,dob2,phone2);
        
        Vector Adddetails=new Vector ();
        Adddetails.add(Pn2);
        Adddetails.add(fname2);
        Adddetails.add(lname2);       
        Adddetails.add(email2);
        Adddetails.add(psw2);
        Adddetails.add(cnt2);
        Adddetails.add(prv2);
        Adddetails.add(add2);
        Adddetails.add(dob2);
        Adddetails.add(phone2);
        
        request.setAttribute("Adddetails", Adddetails);
    
        request.getRequestDispatcher("UserRegis.jsp").forward(request, response);
           
        
        
        
        
       
       
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
