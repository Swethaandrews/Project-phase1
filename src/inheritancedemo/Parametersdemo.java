package inheritancedemo;

public class Parametersdemo {
	public void login(String username,String password)
	{
		System.out.println("enter username:"+ username);
		System.out.println("enter password:"+ password);
		System.out.println("sign into mailbox");

	}
	public void composeemail(String text)
	{
		System.out.println("compose an email with text as:" + text);
	
	}
	public void logout()
	{
		System.out.println("click logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parametersdemo obj= new Parametersdemo();
		obj.login("swetha", "andrews");
		obj.composeemail ("hi swetha");
		
		obj.logout();
	

	}

}
