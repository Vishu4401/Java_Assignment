package program.java.AssistedPractice;

public class ExceptionHandling {

	public static void main(String args[]){  
		try{  
			//code that may raise exception  
			int data = 100/0;  
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}  
		System.out.println("An integer cannot be divided by 0, as it would result in an error. So, this is an Arithmetic Exception");  
    }  
  }  