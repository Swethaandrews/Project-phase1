package Javaprogram;
public class Constructordemo {
	
	public Constructordemo()
	{
		System.out.println("This is default Constructor");
	}
	
	public Constructordemo(int a)
	{
		System.out.println("This is parametrized constructor ");
		System.out.println(" The value of variable a is :" + a);
	}
	
	public Constructordemo(int a, int b)
	{
		System.out.println("This is parametrized constructor ");
		System.out.println(" The value of variable a is :" + a);
		System.out.println(" The value of variable a is :" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructordemo obj = new Constructordemo();
		Constructordemo obj2 = new Constructordemo(10); // prameterized constructor with 1 value
		Constructordemo obj3 = new Constructordemo(10,20); 
	}

}


