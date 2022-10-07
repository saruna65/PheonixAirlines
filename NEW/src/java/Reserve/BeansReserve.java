/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reserve;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BeansReserve{
    
    Statement st;
    
    private int tid;
    private int pass;
    private String ff;
    private String ft;

    private String de;
    private String re;
    
    private String ad;
    private String ch;
    private String cl;
         
    
    
    
    public int gettid() {
        return tid;
    }

    /**
     * @param bid the bid to set
     */
    public void settid(int tid) {
        this.tid = tid;
    }

     
    public int getpass() {
        return pass;
    }

    /**
     * @param bid the bid to set
     */
    public void setpass(int pass) {
        this.pass = pass;
    }

    /**
     * @return the author
     */
    public String getff() {
        return ff;
    }

    /**
     * @param author the author to set
     */
    public void setff(String ff) {
        this.ff = ff;
    }

     public String getft() {
        return ft;
    }

    /**
     * @param author the author to set
     */
    public void setft(String ft) {
        this.ft = ft;
    }

     public String getde() {
        return de;
    }

    /**
     * @param author the author to set
     */
    public void setde(String de) {
        this.de = de;
    }
     public String getre() {
        return re;
    }

    /**
     * @param author the author to set
     */
    public void setre(String re) {
        this.re = re;
    }
    
     public String getad() {
        return ad;
    }

    /**
     * @param author the author to set
     */
    public void setad(String ad) {
        this.ad = ad;
    }
    
    
    
     public String getch() {
        return ch;
    }

    
    public void setch(String ch) {
        this.ch = ch;
    }
    
    
     public String getcl() {
        return cl;
    }

    
    public void setcl(String cl) {
        this.cl = cl;
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
    
            
    public void insertreservationdetails(int pass,String ff,String ft,String de,String re,String ad,String ch,String cl){
        try{
            connectDb();
            String sql="insert into reservationdetails(PassportNo,FlyingFrom,FlyingTo,DepartingDate,ReturningDate,Adults,Children,TravelClass) values('"+pass+"','"+ff+"','"+ft+"','"+de+"','"+re+"','"+ad+"','"+ch+"','"+cl+"')";
            st.executeUpdate(sql);
            
           }
        
          catch (Exception e){
      
                  
      }  
    }
    
}
