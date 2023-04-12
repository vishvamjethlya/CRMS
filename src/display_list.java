import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class display_list {
	
	void display_registered()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/crms";
			String username="root";
			String password="";
			try {
				Connection con=DriverManager.getConnection(url,username,password);
				String sql="SELECT * FROM registered";
				Statement statement =con.createStatement();
			ResultSet result=statement.executeQuery(sql);
			while(result.next())
			{
				
				
				
		System.out.println(result.getInt(1) +" " + result.getString(2) + " " +result.getString(3) + " " +  result.getString(4) + " " +  result.getString(5) + " " +  result.getString(6) + " " +  result.getString(7));
				
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	void display_hot_lead()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/crms";
			String username="root";
			String password="";
			try {
				Connection con=DriverManager.getConnection(url,username,password);
				String sql="SELECT * FROM hot_lead";
				Statement statement =con.createStatement();
			ResultSet result=statement.executeQuery(sql);
			while(result.next())
			{
				
				
				
		System.out.println(result.getInt(1) +" " + result.getString(2) + " " +result.getString(3) + " " +  result.getString(4) + " " +  result.getString(5) + " " +  result.getString(6) + " " +  result.getString(7));
				
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	void display_long_term()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/crms";
			String username="root";
			String password="";
			try {
				Connection con=DriverManager.getConnection(url,username,password);
				String sql="SELECT * FROM long_term";
				Statement statement =con.createStatement();
			ResultSet result=statement.executeQuery(sql);
			while(result.next())
			{
				
				
				
		System.out.println(result.getInt(1) +" " + result.getString(2) + " " +result.getString(3) + " " +  result.getString(4) + " " +  result.getString(5) + " " +  result.getString(6) + " " +  result.getString(7));
				
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
