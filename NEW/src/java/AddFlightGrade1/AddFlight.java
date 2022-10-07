package AddFlightGrade1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddFlight{
    
    Statement st;
    private int fid;
    private String airname;
    private String date;
    private double tickprice;
    private String depair;
    private String arrair;
    
    private double price;
    
     
    public int getfid() {
        return fid;
    }

    /**
     * @param bid the bid to set
     */
    public void setfid(int fid) {
        this.fid = fid;
    }

    /**
     * @return the author
     */
    public String getairname() {
        return airname;
    }

    /**
     * @param author the author to set
     */
    public void setairname(String airname) {
        this.airname = airname;
    }

     public double gettickprice() {
        return tickprice;
    }

    /**
     * @param author the author to set
     */
    public void settickprice(double tickprice) {
        this.tickprice = tickprice;
    }

     public String getdepair() {
        return depair;
    }

    /**
     * @param author the author to set
     */
    public void setdepair(String depair) {
        this.depair = depair;
    }
     public String getarrair() {
        return arrair;
    }

    /**
     * @param author the author to set
     */
    public void setarrair(String arrair) {
        this.arrair = arrair;
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
    public void insertflightdetails(int fid,String airname,String depair,String arrair,String date,double tickprice){
        try{
            connectDb();
            String sql="insert into flightdetails values('"+fid+"','"+airname+"','"+depair+"','"+arrair+"','"+date+"','"+tickprice+"')";
            st.executeUpdate(sql);
            
           }
        
          catch (Exception e){
              
              
    
    
    
    
         
                  
      }  
    }
    
}
