package program.java.AssistedPractice;

class A  
{  
	public void display()  
	{  
		System.out.println("class A display() method called");  
	}  
}

class B extends A  
{  
	  
	public void display()  
	{  
		System.out.println("class B display() method called");  
	}  
}

class C extends A  
{  
	  
	public void display()  
	{  
		System.out.println("class C display() method called");  
	}  
}  
//not supported in Java  


public class DiamondProblem extends B{
	public static void main(String args[]) {
		DiamondProblem d = new DiamondProblem();
		d.display();
		System.out.println("Class C cannot be displayed as Java does not support Multiple Inheritance or Diamond Problem");
	}
}

