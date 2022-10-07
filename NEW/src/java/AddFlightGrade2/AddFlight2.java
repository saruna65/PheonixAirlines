/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddFlightGrade2;

/**
 *
 * @author ASUS
 */

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddFlight2{
    
    Statement st;
    private int fid1;
    private String airname1;
    private String date1;
    private double tickprice1;
    private String depair1;
    private String arrair1;
    
   
    
     
    public int getfid1() {
        return fid1;
    }

    /**
     * @param bid the bid to set
     */
    public void setfid(int fid1) {
        this.fid1 = fid1;
    }

    /**
     * @return the author
     */
    public String getairname1() {
        return airname1;
    }

    /**
     * @param author the author to set
     */
    public void setairname1(String airname1) {
        this.airname1 = airname1;
    }

     public double gettickprice1() {
        return tickprice1;
    }

    /**
     * @param author the author to set
     */
    public void settickprice1(double tickprice1) {
        this.tickprice1 = tickprice1;
    }

     public String getdepair1() {
        return depair1;
    }

    /**
     * @param author the author to set
     */
    public void setdepair1(String depair1) {
        this.depair1 = depair1;
    }
     public String getarrair1() {
        return arrair1;
    }

    /**
     * @param author the author to set
     */
    public void setarrair1(String arrair1) {
        this.arrair1 = arrair1;
    }
    
    
    
   public void connectDb(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
          st=con.createStatement();
           }
         catch(Exception e){
         }
    }
    public void insertflightdetails1(int fid1,String airname1,String depair1,String arrair1,String date1,double tickprice1){
        try{
            connectDb();
            String sql="insert into flightdetails values('"+fid1+"','"+airname1+"','"+depair1+"','"+arrair1+"','"+date1+"','"+tickprice1+"')";
            st.executeUpdate(sql);
            
           }
        
          catch (Exception e){
              
              
    
    
    
    
         
                  
      }  
    }
    
}

