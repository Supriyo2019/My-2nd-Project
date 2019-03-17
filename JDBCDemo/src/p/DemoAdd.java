package p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoAdd {
	public static void main(String args[]){
	
		try
		{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
			Statement statement=con.createStatement();
			ResultSet result=statement.executeQuery("select * from TEST1");
			
			while(result.next())
			{
				System.out.print(result.getInt(1)+"\t");
				System.out.print(result.getString(2)+"\t");
				
			}
			
			statement.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}


