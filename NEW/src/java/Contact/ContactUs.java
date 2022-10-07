/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ContactUs{
    
    Statement st;
    private String name;
    private String email;
    private String subject;
    private String message;
  
 
    
    public String getname() {
        return name;
    }

    
    public void setname(String name) {
        this.name = name;
    }
    
     public String getemail() {
        return email;
    }

    
    public void setemail(String email) {
        this.email = email;
    }
    
     public String getsubject() {
        return subject;
    }

    
    public void setsubject(String subject) {
        this.subject = subject;
    }
    
    public String getmessage() {
        return message;
    }

    
    public void setmessage(String message) {
        this.message = message;
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
    public void insertcontact(String name,String email,String subject,String message){
        try{
            connectDb();
            String sql="insert into contact values('"+name+"','"+email+"','"+subject+"','"+message+"')";
            st.executeUpdate(sql);
            
           }
        
          catch (Exception e){
              
                 
      }  
    }
    
}

