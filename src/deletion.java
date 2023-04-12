import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class deletion {
	String email;
  deletion(String email)
  {
	  this.email=email;
  }
	
	 public void delete_registered()
	 {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/crms";
				String username="root";
				String password="";
				try {
					Connection con=DriverManager.getConnection(url,username,password);

							String sql = "DELETE FROM registered WHERE email=?";
							PreparedStatement statement = con.prepareStatement(sql);
							statement.setString(1,this.email);
							statement.executeUpdate();

				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			 
	 }
	 
	 public void delete_hot_lead()
	 {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/crms";
				String username="root";
				String password="";
				try {
					Connection con=DriverManager.getConnection(url,username,password);

							String sql = "DELETE FROM hot_lead WHERE email=?";
							PreparedStatement statement = con.prepareStatement(sql);
							statement.setString(1,this.email);
							statement.executeUpdate();

				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			 
	 }
	 
	 
	 public void delete_outside()
	 {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/crms";
				String username="root";
				String password="";
				try {
					Connection con=DriverManager.getConnection(url,username,password);

							String sql = "DELETE FROM outside WHERE email=?";
							PreparedStatement statement = con.prepareStatement(sql);
							statement.setString(1,this.email);
							statement.executeUpdate();

				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			 
	 }
	 
	 public void delete_long_term()
	 {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/crms";
				String username="root";
				String password="";
				try {
					Connection con=DriverManager.getConnection(url,username,password);

							String sql = "DELETE FROM long_term WHERE email=?";
							PreparedStatement statement = con.prepareStatement(sql);
							statement.setString(1,this.email);
							statement.executeUpdate();

				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			 
	 }

}
