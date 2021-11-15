package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryTest {
	
	@Test
	public void executeQureyTest() throws SQLException
	{
		//Register the DataBase
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
		//Connect the DataBase
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		
		//Create the Statement
		Statement state = con.createStatement();
		
		//Execute My Query
		ResultSet res = state.executeQuery("select * from students_info;");
		
		//Printing
		while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
			
		}
		
		//Disconnect from DataBase
		con.close();
	}

}
