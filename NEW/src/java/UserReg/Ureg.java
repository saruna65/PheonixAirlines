/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserReg;


import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ureg{
    
    Statement st;
    private int Pn2;
    private String fname2;
    private String lname2;
    private String email2;
    private String psw2;
    private String cnt2;
    private String prv2;
    private String add2;
    private String dob2;
    private String phone2;
    
   
    
     
    public int getPn2() {
        return Pn2;
    }

        public void setPn2(int Pn2) {
        this.Pn2 = Pn2;
    }
    
        
    public String getfname2() {
        return fname2;
    }

        public void setfname2(String fname2) {
        this.fname2 = fname2;
    }
    
     
        
    public String getlname2() {
        return lname2;
    }
       
    public void setlname(String lname2) {
        this.lname2 = lname2;
    }
    
    
     public String getemail2() {
        return email2;
    }
  
    public void setemail2(String email2) {
        this.email2 = email2;
    }
    
    
    
     public String getpsw2() {
        return psw2;
    }
       
    public void setpsw2(String psw2) {
        this.psw2 = psw2;
    }
    
    
     public String getcnt2() {
        return cnt2;
    }
       
    public void setcnt2(String cnt2) {
        this.cnt2 = cnt2;
    }
    
    public String getprv2() {
        return prv2;
    }
       
    public void setprv2(String prv2) {
        this.prv2 = prv2;
    }
    
    
    
    public String getadd2() {
        return add2;
    }
       
    public void setadd2(String add2) {
        this.add2 = add2;
    }
    
    public String getdob2() {
        return dob2;
    }
       
    public void setdob2(String dob2) {
        this.dob2 = dob2;
    }
    
    public String getphone2() {
        return phone2;
    }
       
    public void setphone2(String phone2) {
        this.phone2 = phone2;
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
    public void UserDetails(int Pn2,String fname2,String lname2,String email2,String psw2,String cnt2,String prv2,String add2,String dob2,String phone2)
            
    {
        try{
            connectDb();
            String sql="insert into membersdetails values('"+Pn2+"','"+fname2+"','"+lname2+"','"+email2+"','"+psw2+"','"+cnt2+"','"+prv2+"','"+add2+"','"+dob2+"','"+phone2+"')";
            st.executeUpdate(sql);
            
           }
        
          catch (Exception e){
              
              
    
    
    
    
         
                  
      }  
    }
    
}

    