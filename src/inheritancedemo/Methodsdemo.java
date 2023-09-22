package inheritancedemo;

public class Methodsdemo {
	public void login()
	{
		System.out.println("enter username");
	}
	public void composeemail()
	{
		System.out.println("compose an email");
	
	}
	public void logout()
	{
		System.out.println("click logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodsdemo obj=new Methodsdemo();
		obj.login();
		obj.composeemail();
		obj.logout();

	}

}
