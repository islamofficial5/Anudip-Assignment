package collectionframework;
import java.util.ArrayList;

public class UserArrayList
{
	public static void main(String[] args) 
	{	
		ArrayList<User> userlist=new ArrayList<User>();
		
//		User u1=new User(101, "Islam","Nirsa");     //1st way
//		User u2=new User(102, "Suraj","Mugma");
//		User u3=new User(103, "Ritesh","Ranchi");
//		
//		userlist.add(u1);
//		userlist.add(u2);
//		userlist.add(u3);
		
		//Anonymous object    //2nd way
		userlist.add(new User(101, "Islam","Nirsa"));
		userlist.add(new User(102, "Suraj","Mugma"));
		userlist.add(new User(103, "Ritesh","Ranchi"));
		
		
		//Print the user Details
		for(User u:userlist)
		{
			System.out.println("Id: "+u.getId());
			System.out.println("Name: "+u.getName());
			System.out.println("Address: "+u.getAddress());
			System.out.println("===============================================");
		}
	}
}