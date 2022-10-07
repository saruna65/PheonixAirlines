/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffReg;


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
@WebServlet(name = "StaffRegistration", urlPatterns = {"/StaffRegistration"})
public class StaffRegistration extends HttpServlet {

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
            out.println("<title>Servlet StaffRegistration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StaffRegistration at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        
        Sreg n1=new Sreg();
        
        int sid=Integer.parseInt(request.getParameter("sid"));
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname"); 
        String cnt=request.getParameter("cnt");
        String prv=request.getParameter("prv");
        String add=request.getParameter("add");
        String nic=request.getParameter("nic");
        String psw=request.getParameter("psw");
        String select=request.getParameter("select");
        String dob=request.getParameter("dob");
        String phone=request.getParameter("phone"); 
        String app=request.getParameter("app"); 
        
       
         
         
        n1.StaffDetails( sid,fname,lname,cnt,prv,add,nic,psw,select,dob,phone,app);
        
        Vector Adddetails=new Vector ();
        Adddetails.add(sid);
        Adddetails.add(fname);
        Adddetails.add(lname);           
        Adddetails.add(cnt);
        Adddetails.add(prv);
        Adddetails.add(add);
        Adddetails.add(nic);
        Adddetails.add(psw);
        Adddetails.add(select);
        Adddetails.add(dob);
        Adddetails.add(phone);
        Adddetails.add(app);
        
        request.setAttribute("Adddetails", Adddetails);
    
        request.getRequestDispatcher("Staffregis.jsp").forward(request, response);
           
        
        
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
