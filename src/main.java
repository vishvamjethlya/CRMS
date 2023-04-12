import java.sql.*;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	insert_into_database c1= new insert_into_database("snehal","8888888888","bt20ece002@iiitn.ac.in","napur","land","2");
//	 if(c1.validate_email(c1.email)==true && c1.validate_phone(c1.phone)==true)
//		{c1.registered(c1);
//		
//		if(c1.Location=="nagpur") c1.hot_lead(c1);
//		}
		
		System.out.println("Press 1 for admin registration  and press 2 for user registration");
		Scanner sc1 =new Scanner(System.in);
		int choose=sc1.nextInt();
		
		switch (choose)
		{
			case 1:
				System.out.println("Enter 1 for registration or 2 for displaying list");
				Scanner ssc=new Scanner(System.in);
				int ch=ssc.nextInt();
				switch(ch) {
				case 1:
				System.out.println("Enter name:");
				Scanner sc2 =new Scanner(System.in);
				String name=sc2.nextLine();
				System.out.println("Enter email:");
				Scanner sc3 =new Scanner(System.in);
				String email=sc3.nextLine();
				System.out.println("Enter phone:");
				Scanner sc4 =new Scanner(System.in);
				String phone=sc4.nextLine();
				
				admin c1= new admin(name,email,phone);
				c1.admin_reg(name,email,phone);
				break;
				case 2:
				System.out.println("enter 1 to display registered customer list ,enter 2 to display hot leads and enter 3 to display long term leads");
				Scanner dis=new Scanner(System.in);
				int p=dis.nextInt();
				switch(p) {
				case 1:
					display_list l1=new display_list();
					l1.display_registered();
					break;
				case 2:
					display_list l2=new display_list();
					l2.display_hot_lead();
					break;
				case 3:
					display_list l3=new display_list();
					l3.display_long_term();
					break;
				}
				break;	
				}
				break;
				
			case 2: 
				System.out.println("type 1 for registering ,2 for updating and 3 for deleting info else type 4");
	            int process;
	            Scanner pr=new Scanner(System.in);
	            process=pr.nextInt();
	            
	            switch(process)
	            {
			case 1:
				System.out.println("Enter name:");
				Scanner sc5 =new Scanner(System.in);
				String name_2=sc5.nextLine();
				System.out.println("Enter email:");    
				Scanner sc6 =new Scanner(System.in);
				String email_2=sc6.nextLine();
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
				
				insert_into_database c2= new insert_into_database(name_2,phone_2,email_2,location_2,Property_type_2,Purchase_timeframe_2);
	            c2.registered(c2);
	            String place ="nagpur";
	            if(location_2.equals(place))
	            	{
	            	if(Purchase_timeframe_2.equals("2"))
	            	{
	            		c2.hot_lead(c2);
	            	}
	            	else
	            	{
	            		c2.long_term(c2);
	            	}
	            	}
	            else
	            {
	            	c2.outside(c2);
	            }
	            break;
	            
	            case 2:
	            	System.out.println("enter email id");
	            	String email_id;
	            	Scanner em=new Scanner (System.in);
	            	email_id=em.nextLine();
	            	update c3=new update(email_id);
	            	c3.updation();
	            	
	            	
	            	break;
	            case 3:
	            	System.out.println("enter your email id");
	            	String emailid;
	            	Scanner e = new Scanner(System.in);
	            	emailid=e.nextLine();
	            	deletion del =new deletion(emailid);
	            	del.delete_registered();
	            	del.delete_hot_lead();
	            	del.delete_long_term();
	            	del.delete_outside();
	            	
	            	break;
	            case 4:
	            	break;
	            	
	            }
	            
	            

	}
  }
}
