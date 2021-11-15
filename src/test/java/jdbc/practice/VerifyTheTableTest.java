package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class VerifyTheTableTest {
	
	@Test
	public void verifyTheTableTest() throws SQLException
	{
		String expectedData = "linga";
		
		//Register the DataBase
		Driver d;
		Connection con=null;
		try {
			d = new Driver();
			DriverManager.registerDriver(d);
			
			//Connect the DataBase
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			
			//Create the Statement
			Statement state = con.createStatement();
			
			//Execute My Query
			ResultSet res = state.executeQuery("select * from students_info;");
			boolean flag = false;
			while(res.next())
			{
				String actualData = res.getString(3);
				if(actualData.equals(expectedData))
				{
					System.out.println(expectedData+" is present");
					flag=true;
					break;
				}
			}
			Assert.assertEquals(flag, true);
			System.out.println("It is True");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Close the Connection
		finally
		{
			con.close();
		}
				
			
	}

}
