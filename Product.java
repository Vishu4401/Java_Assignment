package phase1.java;


class Product{  
	
	int id = 78;
	String name = "Amul";
	void display()
	{
		System.out.println(id+name);
	}  
}  

class A extends Product{  
	int count = 50;
	String category = "butter";
	
	void Butter()
	{
		System.out.println(count);
		System.out.println(category);
	}  
}  

class B extends Product{  
	int count = 90;
	String category = "Milk";
	
	void Milk()
	{
		System.out.println(count);
		System.out.println(category);
	}  
}  

class C extends Product{
	int count = 56;
	String category = "choco";
	void choco()
	{
		System.out.println(count);
		System.out.println(category);
	}
}

class subA extends A{
	int price = 30;
	float total;
	void AA()
	{
		total = count * price;
		System.out.println(total);
		System.out.println(id);
		System.out.println(name);
		System.out.println(category);
	}
}

class subB extends B{
	
}

//class subB extends B{
//	
//}

	
public class Hierarchical{  
	public static void main(String args[]){  
	
	subA a = new SubA();  
	a.choco();  
	c.eat(); 	
	//c.bark();//C.T.Error  
}}  