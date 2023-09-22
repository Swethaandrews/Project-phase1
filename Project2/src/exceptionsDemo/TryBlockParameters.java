package exceptionsDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryBlockParameters {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try(PrintWriter writer = new  PrintWriter(new File("/home/swetha/Downloads/test.txt"))) {
			
			writer.println("hello All");
			
		}
		catch(ArithmeticException e){
		   System.out.println(e.getMessage());
		   System.out.println("No file found");
		}
			

	}

}
