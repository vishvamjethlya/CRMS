import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update
{
	String email;
	update(String email)
	{
		this.email=email;
		
	}
	
	public void updation()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/crms";
			String username="root";
			String password="";
				try {
					Connection con= DriverManager.getConnection(url,username,password);
					String sql="update registered set name=?, phone=?, location=?,property_type=?,purchase_timeframe=? where email=?";
					PreparedStatement statement = con.prepareStatement(sql);
					System.out.println("Enter name:");
					Scanner sc5 =new Scanner(System.in);
					String name_2=sc5.nextLine();
					
					System.out.println("Enter phone:");
					Scanner sc7 =new Scanner(System.in);
					String phone_2=sc7.nextLine();
					System.out.println("Enter location:");
					Scanner sc8 =new Scanner(System.in);
					String location_2=sc8.nextLine();
					System.out.println("Enter Property_type:");    
					Scanner sc9 =new Scanner(System.in);
					String Property_type_2=sc9.nextLine();
					System.out.println("Enter purchase_timeframe:");
					Scanner sc0 =new Scanner(System.in);
					String Purchase_timeframe_2=sc0.nextLine();
				
					
					statement.setString(1,name_2);
					statement.setString(2,phone_2);
					statement.setString(3,location_2);
					statement.setString(4, Property_type_2);
					statement.setString(5,Purchase_timeframe_2);
					statement.setString(6,this.email);
					statement.executeUpdate();
					
					con.close();
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