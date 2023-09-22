package inheritancedemo;

public class Homepage extends Base {
	public void Homepagetest()
	{
		System.out.println("test for Home page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homepage obj =new Homepage();
		obj.openbrowser("chrome");
		login("swetha","andrews");
		obj.Homepagetest();
		obj.logout();

		
	}
}


