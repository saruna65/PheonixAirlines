package CRUD.Flight.DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import CRUD.Flight.Bean.User;
public class UserDao {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement","root","");
               
	}catch(Exception e){System.out.println(e);}
	return con;
}

public static int save(User u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into flightdetails(AirlineName,DepartureAirport,ArrivalAirport,Date,TicketPrice) values(?,?,?,?,?)");
		ps.setString(1,u.getairname2());
		ps.setString(2,u.getdepair2());
		ps.setString(3,u.getarrair2());
		ps.setString(4,u.getdate2());
		ps.setDouble(5,u.gettickprice2());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int update(User u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("update flightdetails set AirlineName= ?,DepartureAirport =?,ArrivalAirport =?,Date =?,TicketPrice =? where FlightID = ?;");
		ps.setString(1,u.getairname2());
		ps.setString(2,u.getdepair2());
		ps.setString(3,u.getarrair2());
		ps.setString(4,u.getdate2());
		ps.setDouble(5,u.gettickprice2());
		ps.setInt(6,u.getfid2());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int delete(User u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from flightdetails where FlightID=?");
		ps.setInt(1,u.getfid2());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}

	return status;
}
public static List<User> getAllRecords(){
	List<User> list=new ArrayList<User>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from flightdetails");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
                   
			User u=new User();
			u.setfid2(rs.getInt("FlightID"));
			u.setairname2(rs.getString("AirlineName"));
			u.setdepair2(rs.getString("DepartureAirport"));
			u.setarrair2(rs.getString("ArrivalAirport"));
			u.setdate2(rs.getString("Date"));
			u.settickprice2(rs.getDouble("TicketPrice"));
			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static User getRecordById(int fid2){
	User u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from flightdetails where FlightID=?");
		ps.setInt(1,fid2);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			u=new User();
			u.setfid2(rs.getInt("FlightID"));
			u.setairname2(rs.getString("AirlineName"));
			u.setdepair2(rs.getString("DepartureAirport"));
			u.setarrair2(rs.getString("ArrivalAirport"));
			u.setdate2(rs.getString("Date"));
			u.settickprice2(rs.getDouble("TicketPrice"));
		}
	}catch(Exception e){System.out.println(e);}
	return u;
}
}
