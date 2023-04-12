import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_into_database extends customer_registration{ 
	
	insert_into_database(String name, String phone, String email, String Location, String Property_type,
			String Purchase_timeframe) {
		super(name, phone, email, Location, Property_type, Purchase_timeframe);
		// TODO Auto-generated constructor stub
	}
	public void registered(customer_registration c1)
	{
	                                                                        
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/crms";
			String username = "root";
			String password = "";
			try {
				int id=1;
				Connection con = DriverManager.getConnection(url, username, password);
				String q = "insert into registered(id,name,email,phone,location,property_type,purchase_timeframe) values (?,?,?,?,?,?,?)";
				PreparedStatement smt = con.prepareStatement(q);
				smt.setInt(1, id);
				
				smt.setString(2,c1.name);
				
				smt.setString(3,c1.email);
				smt.setString(4,c1.phone);
				smt.setString(5,c1.Location);
				smt.setString(6,c1.Property_type);
				smt.setString(7,c1.Purchase_timeframe);
				
				
				

				smt.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void outside(customer_registration c1)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/crms";
			String username = "root";
			String password = "";
			try {
				int id=1;
				Connection con = DriverManager.getConnection(url, username, password);
				String q = "insert into outside(id,name,email,phone,location,property_type,purchase_timeframe) values (?,?,?,?,?,?,?)";
				PreparedStatement smt = con.prepareStatement(q);
				smt.setInt(1, id);
				
				smt.setString(2,c1.name);
				
				smt.setString(3,c1.email);
				smt.setString(4,c1.phone);
				smt.setString(5,c1.Location);
				smt.setString(6,c1.Property_type);
				smt.setString(7,c1.Purchase_timeframe);
				
				
				

				smt.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void long_term(customer_registration c1)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/crms";
			String username = "root";
			String password = "";
			try {
				int id=1;
				Connection con = DriverManager.getConnection(url, username, password);
				String q = "insert into long_term(id,name,email,phone,location,property_type,purchase_timeframe) values (?,?,?,?,?,?,?)";
				PreparedStatement smt = con.prepareStatement(q);
				smt.setInt(1, id);
				
				smt.setString(2,c1.name);
				
				smt.setString(3,c1.email);
				smt.setString(4,c1.phone);
				smt.setString(5,c1.Location);
				smt.setString(6,c1.Property_type);
				smt.setString(7,c1.Purchase_timeframe);
				
				
				

				smt.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void hot_lead(customer_registration c1)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/crms";
			String username = "root";
			String password = "";
			try {
				int id=1;
				Connection con = DriverManager.getConnection(url, username, password);
				String q = "insert into hot_lead(id,name,email,phone,location,property_type,purchase_timeframe) values (?,?,?,?,?,?,?)";
				PreparedStatement smt = con.prepareStatement(q);
				smt.setInt(1, id);
				
				smt.setString(2,c1.name);
				
				smt.setString(3,c1.email);
				smt.setString(4,c1.phone);
				smt.setString(5,c1.Location);
				smt.setString(6,c1.Property_type);
				smt.setString(7,c1.Purchase_timeframe);
				
				
				

				smt.executeUpdate();
				System.out.println("You are eligible for a special coupon");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void admin(String name,String email,String phone) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/crms";
			String username = "root";
			String password = "";
			try {
				int id=1;
				Connection con = DriverManager.getConnection(url, username, password);
				String q = "insert into admin(id,name,email,phone) values (?,?,?,?)";
				PreparedStatement smt = con.prepareStatement(q);
				smt.setInt(1, id);
				
				smt.setString(2,name);
				smt.setString(3,email);
				smt.setString(4,phone);
				
				
				
				

				smt.executeUpdate();

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
