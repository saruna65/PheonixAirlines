package com.Staff.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.Staff.bean.Staff;
public class StaffDao {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
	}catch(Exception e){System.out.println(e);}
	return con;
}
public static int save(Staff u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into staffdetails(FirstName,LastName,Country,Province,Address,NIC,Password,Grade,DOB,Phone,Approve) values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,u.getfnamen());
		ps.setString(2,u.getlnamen());
		ps.setString(3,u.getcntn());
		ps.setString(4,u.getprvn());
		ps.setString(5,u.getaddn());
                ps.setString(6,u.getnicn());
		ps.setString(7,u.getpswn());
		ps.setString(8,u.getselectn());
		ps.setString(9,u.getdobn());
		ps.setString(10,u.getphonen());
                ps.setString(11,u.getappn());

               
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int update(Staff u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("update staffdetails set FirstName=?,LastName=?,Country=?,Province=?,Address=?,NIC=?,Password=?,Grade=?,DOB=?,Phone=?,Approve=? where StaffId=?");
		ps.setString(1,u.getfnamen());
		ps.setString(2,u.getlnamen());
		ps.setString(3,u.getcntn());
		ps.setString(4,u.getprvn());
		ps.setString(5,u.getaddn());
                ps.setString(6,u.getnicn());
		ps.setString(7,u.getpswn());
		ps.setString(8,u.getselectn());
		ps.setString(9,u.getdobn());
		ps.setString(10,u.getphonen());
                ps.setString(11,u.getappn());
		ps.setInt(12,u.getsidn());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int delete(Staff u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from staffdetails where StaffId=?");
		ps.setInt(1,u.getsidn());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}

	return status;
}
public static List<Staff> getAllRecords(){
	List<Staff> list=new ArrayList<Staff>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from staffdetails");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			Staff u=new Staff();
			u.setsidn(rs.getInt("StaffId"));
			u.setfnamen(rs.getString("FirstName"));
			u.setlnamen(rs.getString("LastName"));
			u.setcntn(rs.getString("Country"));
			u.setprvn(rs.getString("Province"));
			u.setaddn(rs.getString("Address"));
                        u.setnicn(rs.getString("NIC"));
                        u.setpswn(rs.getString("Password"));
                        u.setselectn(rs.getString("Grade"));
                        u.setdobn(rs.getString("DOB"));
                        u.setphonen(rs.getString("Phone"));
                        u.setappn(rs.getString("Approve"));
                        
                        
                        
                        
                        
                        
			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static Staff getRecordById(int sidn){
	Staff u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from staffdetails where StaffId=?");
		ps.setInt(1,sidn);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			u=new Staff();
			u.setsidn(rs.getInt("StaffId"));
			u.setfnamen(rs.getString("FirstName"));
			u.setlnamen(rs.getString("LastName"));
			u.setcntn(rs.getString("Country"));
			u.setprvn(rs.getString("Province"));
			u.setaddn(rs.getString("Address"));
                        u.setnicn(rs.getString("NIC"));
                        u.setpswn(rs.getString("Password"));
                        u.setselectn(rs.getString("Grade"));
                        u.setdobn(rs.getString("DOB"));
                        u.setphonen(rs.getString("Phone"));
                        u.setappn(rs.getString("Approve"));
		}
	}catch(Exception e){System.out.println(e);}
	return u;
}
}
