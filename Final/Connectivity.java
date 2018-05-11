import java.util.*;
import java.sql.*;
import static java.lang.System.out;

public class Connectivity{

	public static Connection mysql() throws SQLException
	{ 
		try{ Class.forName("com.mysql.jdbc.Driver"); }
		catch(Exception e){
			out.println(e);
		}
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book","root","");
		//Statement st = con.createStatement();
		return con;
	}

	public static Connection mysql(String url,String uname,String pass) throws SQLException
	{ 
		try{ Class.forName("com.mysql.jdbc.Driver"); }
		catch(Exception e){
			out.println(e);
		}
		Connection con = DriverManager.getConnection(url,uname,pass);
		//Statement st = con.createStatement();
		return con;
	}

	public static void oracle(String url,String uname,String pass)
	{
		
		 
	}

}
