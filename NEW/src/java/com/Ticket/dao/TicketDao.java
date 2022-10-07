package com.Ticket.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.Ticket.bean.Ticket;
public class TicketDao {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
	}catch(Exception e){System.out.println(e);}
	return con;
}
public static int save(Ticket u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into reservationdetails(PassportNo,FlyingFrom,FlyingTo,DepartingDate,ReturningDate,Adults,Children,TravelClass) values(?,?,?,?,?,?,?,?)");
		
                ps.setInt(1,u.geta());
		ps.setString(2,u.getb());
		ps.setString(3,u.getc());
		ps.setString(4,u.getd());
                ps.setString(5,u.geti());
		ps.setString(6,u.gete());
                ps.setString(7,u.getf());
                ps.setString(8,u.getg());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int update(Ticket u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("update reservationdetails set PassportNo=?,FlyingFrom=?,FlyingTo=?,DepartingDate=?,ReturningDate=?,Adults=?,Children=?,TravelClass=? where TicketID=?");
		ps.setInt(1,u.geta());
		ps.setString(2,u.getb());
		ps.setString(3,u.getc());
		ps.setString(4,u.getd());
                ps.setString(5,u.geti());
		ps.setString(6,u.gete());
                ps.setString(7,u.getf());
                ps.setString(8,u.getg());
                ps.setInt(9,u.geth());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int delete(Ticket u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from reservationdetails where TicketID=?");
		ps.setInt(1,u.geth());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}

	return status;
}
public static List<Ticket> getAllRecords(){
	List<Ticket> list=new ArrayList<Ticket>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from reservationdetails");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			Ticket u=new Ticket();
			u.seth(rs.getInt("TicketID"));
			u.seta(rs.getInt("PassportNo"));
			u.setb(rs.getString("FlyingFrom"));
			u.setc(rs.getString("FlyingTo"));
			u.setd(rs.getString("DepartingDate"));
                        u.seti(rs.getString("ReturningDate"));
			u.sete(rs.getString("Adults"));
                        u.setf(rs.getString("Children"));
                        u.setg(rs.getString("TravelClass"));
			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static Ticket getRecordById(int h){
	Ticket u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from reservationdetails where TicketID=?");
		ps.setInt(1,h);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			u=new Ticket();
			u.seth(rs.getInt("TicketID"));
			u.seta(rs.getInt("PassportNo"));
			u.setb(rs.getString("FlyingFrom"));
			u.setc(rs.getString("FlyingTo"));
			u.setd(rs.getString("DepartingDate"));
                        u.seti(rs.getString("ReturningDate"));
			u.sete(rs.getString("Adults"));
                        u.setf(rs.getString("Children"));
                        u.setg(rs.getString("TravelClass"));
		}
	}catch(Exception e){System.out.println(e);}
	return u;
}
}
