import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class admin {
	String name;
	String email;
	String phone;
	admin(String name, String email, String phone){
		this.name=name;
		this.email=email;                                                                                                                                         
		this.phone=phone;		
	}
	
	public void admin_reg(String name,String email,String phone) {
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
