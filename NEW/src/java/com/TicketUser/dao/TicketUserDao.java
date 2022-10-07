package com.TicketUser.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.TicketUser.bean.TicketUser;

public class TicketUserDao {
    
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
	}catch(Exception e){System.out.println(e);}
	return con;
}
public static int save(TicketUser u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into reservationdetails(TicketID,PassportNo,FlyingFrom,FlyingTo,DepartingDate,ReturningDate,Adults,Children,TravelClass) values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,u.gethh());
                ps.setInt(2,u.getaa());
		ps.setString(3,u.getbb());
		ps.setString(4,u.getcc());
		ps.setString(5,u.getdd());
                ps.setString(6,u.getii());
		ps.setString(7,u.getee());
                ps.setString(8,u.getff());
                ps.setString(9,u.getgg());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int update(TicketUser u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("update reservationdetails set PassportNo=?,FlyingFrom=?,FlyingTo=?,DepartingDate=?,ReturningDate=?,Adults=?,Children=?,TravelClass=? where TicketID=?");
		ps.setInt(1,u.getaa());
		ps.setString(2,u.getbb());
		ps.setString(3,u.getcc());
		ps.setString(4,u.getdd());
                ps.setString(5,u.getii());
		ps.setString(6,u.getee());
                ps.setString(7,u.getff());
                ps.setString(8,u.getgg());
                ps.setInt(9,u.gethh());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int delete(TicketUser u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from reservationdetails where TicketID=?");
		ps.setInt(1,u.gethh());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}

	return status;
}
public static List<TicketUser> getAllRecords(){
	List<TicketUser> list=new ArrayList<TicketUser>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from reservationdetails");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			TicketUser u=new TicketUser();
			u.sethh(rs.getInt("TicketID"));
			u.setaa(rs.getInt("PassportNo"));
			u.setbb(rs.getString("FlyingFrom"));
			u.setcc(rs.getString("FlyingTo"));
			u.setdd(rs.getString("DepartingDate"));
                        u.setii(rs.getString("ReturningDate"));
			u.setee(rs.getString("Adults"));
                        u.setff(rs.getString("Children"));
                        u.setgg(rs.getString("TravelClass"));
			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static TicketUser getRecordById(int hh){
	TicketUser u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from reservationdetails where TicketID=?");
		ps.setInt(1,hh);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			u=new TicketUser();
			u.sethh(rs.getInt("TicketID"));
			u.setaa(rs.getInt("PassportNo"));
			u.setbb(rs.getString("FlyingFrom"));
			u.setcc(rs.getString("FlyingTo"));
			u.setdd(rs.getString("DepartingDate"));
                        u.setii(rs.getString("ReturningDate"));
			u.setee(rs.getString("Adults"));
                        u.setff(rs.getString("Children"));
                        u.setgg(rs.getString("TravelClass"));
		}
	}catch(Exception e){System.out.println(e);}
	return u;
}
}
