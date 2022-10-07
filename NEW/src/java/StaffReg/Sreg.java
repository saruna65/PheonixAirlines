/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffReg;


import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sreg{
    
    
    
    
    Statement st;
    private int sid;
    private String fname;
    private String lname;  
    private String cnt;
    private String prv;
    private String add;
    private String nic;
    private String psw;  
    private String select;
    private String dob;
    private String phone;
    private String app;
    
   
    
     
    public int getsid() {
        return sid;
    }

        public void setid(int sid) {
        this.sid = sid;
    }
    
        
    public String getfname() {
        return fname;
    }

        public void setfname(String fname) {
        this.fname = fname;
    }
    
     
        
    public String getlname() {
        return lname;
    }
       
    public void setlname(String lname) {
        this.lname = lname;
    }
    
    
    
     public String getcnt() {
        return cnt;
    }
       
    public void setcnt(String cnt) {
        this.cnt = cnt;
    }
    
    public String getprv() {
        return prv;
    }
       
    public void setprv(String prv) {
        this.prv = prv;
    }
    
    
    
    public String getadd() {
        return add;
    }
       
    public void setadd(String add) {
        this.add = add;
    }
    
    
    public String getnic() {
        return nic;
    }
       
    public void setnic(String nic) {
        this.nic = nic;
    }
    
    
     public String getpsw() {
        return psw;
    }
       
    public void setpsw(String psw) {
        this.psw = psw;
    }
    
    
    public String getselect() {
        return select;
    }
       
    public void setselect(String select) {
        this.select = select;
    }
    
    
    public String getdob() {
        return dob;
    }
       
    public void setdob(String dob) {
        this.dob = dob;
    }
    
    public String getphone() {
        return phone;
    }
       
    public void setphone(String phone) {
        this.phone = phone;
    }
    
    public String getapp() {
        return app;
    }
       
    public void setapp(String app) {
        this.app = app;
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
    public void StaffDetails(int sid,String fname,String lname,String cnt,String prv,String add,String nic,String psw,String select,String dob,String phone,String app)
            
    {
        try{
            connectDb();
            String sql="insert into staffdetails values('"+sid+"','"+fname+"','"+lname+"','"+cnt+"','"+prv+"','"+add+"','"+nic+"','"+psw+"','"+select+"','"+dob+"','"+phone+"','"+app+"')";
            st.executeUpdate(sql);
            
           }
        
          catch (SQLException e){
              
                
      }  
    }
    
}

