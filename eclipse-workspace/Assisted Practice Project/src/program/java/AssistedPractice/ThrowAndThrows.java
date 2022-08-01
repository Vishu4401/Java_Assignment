package program.java.AssistedPractice;


public class ThrowAndThrows{
	   public int division(int a, int b) throws ArithmeticException{
	      int t = a/b;
	      return t;
	   }
	   
	   static void checkAge(int age) {
		    if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }
	   public static void main(String args[]){
		   ThrowAndThrows obj = new ThrowAndThrows();
	      try{
	         System.out.println(obj.division(15,0));
	      }
	      catch(ArithmeticException e){
	         System.out.println("You shouldn't divide number by zero as it is invalid and results in an arithmetic exception\n\n");
	      }
	      
	       
	      System.out.println("This results in an Arithmetic error");
	      checkAge(15); // Set age to 15 (which is below 18...)
	      
	      
	   } 
}
	