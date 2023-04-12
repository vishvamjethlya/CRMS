import java.util.regex.*;

public class customer_registration {
	String name;
	String email;
	String phone;
	String Location;
	String Property_type;
	String Purchase_timeframe;
	customer_registration(String name,String phone,String email,String Location,String Property_type,String Purchase_timeframe)
	{
		this.name=name;
		this.email=email;                                                                                                                                         
		this.phone=phone;
		this.Location=Location;
		this.Property_type=Property_type;
		this.Purchase_timeframe=Purchase_timeframe;
	}
	
	public boolean validate_email(String email)
	{
		  String regex = "^[a-z0-9+_.-]+@(.+)$";  
		  Pattern pattern = Pattern.compile(regex); 
		  Matcher matcher = pattern.matcher(email);  
		  
		  
		return matcher.matches();
	}
public boolean validate_phone(String phone)
{
	if(phone.length()!=10)
		return false;
	 String regex = "^[0-9]"; 
	 Pattern pattern = Pattern.compile(regex); 
	  Matcher matcher = pattern.matcher(phone); 
	  return matcher.matches();
}
	
	

}

