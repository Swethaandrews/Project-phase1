package inheritancedemo;

public class Methodsdemo2 {
	int x =100;
	String str3 = "Java";
	public int sum()
	{
		int a =10;
		int b =20;
		int result =a+b+x;
		return result;  
	}
   public String concatmethod() {
	   String str1 = "seleninm";
	   String str2 = "training";
	   String result = str1+str2;
	   return result;
	   
   }
   
   public void printmethod()
   {
	   System.out.println("The global integer variable : " + x);
	   System.out.println("The global String variable : " + str3);
   }


	public static void main(String[] args) {
		
		Methodsdemo2 obj = new Methodsdemo2();
	      
	      System.out.println(obj.concatmethod());
	      int value = obj.sum();
	      
	      System.out.println(value);
	      
	      obj.printmethod();

	}

}
