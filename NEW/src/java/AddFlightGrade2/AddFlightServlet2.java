/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddFlightGrade2;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author ASUS
 */
@WebServlet(name = "AddFlightServlet2", urlPatterns = {"/AddFlightServlet2"})
public class AddFlightServlet2 extends HttpServlet {

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
            out.println("<title>Servlet AddFlightServlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddFlightServlet2 at " + request.getContextPath() + "</h1>");
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
        
        AddFlight2 n1=new AddFlight2();
        
        int fid1=Integer.parseInt(request.getParameter("fid1"));
        
        String airname1=request.getParameter("airname1");
        String depair1=request.getParameter("depair1");
        String arrair1=request.getParameter("arrair1");
         
       
        String date1=request.getParameter("date1");
      
        double tickprice1=Double.parseDouble(request.getParameter("tickprice1"));
       
         
         
        n1.insertflightdetails1( fid1,airname1,depair1,arrair1,date1,tickprice1);
        
        Vector AddFlight2=new Vector ();
        AddFlight2.add(fid1);
        AddFlight2.add(airname1);
       AddFlight2.add(date1);
       
        AddFlight2.add(tickprice1);
        AddFlight2.add(depair1);
        AddFlight2.add(arrair1);
        
        request.setAttribute("AddFlight2", AddFlight2);
    
        request.getRequestDispatcher("StaffGrade2AddFlight.jsp").forward(request, response);
           
        
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
