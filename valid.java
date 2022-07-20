import java.util.*;
public class valid {
	
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("amruta@.gmailcom");
		a.add("shivani7@gmail.com");
		a.add("tushar123@gmail.com");
		a.add("rahul4113@gmail.com");
		Scanner in=new Scanner(System.in);
		String email;
		System.out.println("enter email for search"+"\n");
		email=in.nextLine();
		valid obj=new valid();
		 
		
		if(a.contains(email))
			System.out.println("email is present");
		else 
			System.out.println("email not present");
		
	}
}
