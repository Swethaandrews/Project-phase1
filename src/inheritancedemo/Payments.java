package inheritancedemo;

public class Payments extends Homepage{
	public void payment() {
		System.out.println("test payment page");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Payments obj= new Payments();
		obj.openbrowser("chrome");
		login("swetha","andrews");
		obj.Homepagetest();
		obj.payment();
		obj.logout();

	}

}
