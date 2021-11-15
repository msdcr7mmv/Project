package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest {
	
	@Test
	public void executeUpdateTest() throws SQLException
	{
		
		//Register the DataBase
		Driver d;
		Connection con=null;
		try {
			d = new Driver();
			DriverManager.registerDriver(d);
			
			//Connect the DataBase
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			
			//Create Statement
			Statement state = con.createStatement();
			
			//Execute the Query
			int res = state.executeUpdate("insert into students_info(regno, firstname, middlename, lastname) values('5', 'raj', 'koti', 'r')");
			//int res = state.executeUpdate("delete from students_info where regno=5;");
			if(res==1)
			{
				System.out.println("Data is inserted");
			}
			else
			{
				System.out.println("Data is not inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}
		
		
	}

}
