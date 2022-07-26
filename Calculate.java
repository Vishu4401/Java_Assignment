package phase1.java;

public class Calculate {
	static int add(int a, int b)
	{
		return(a+b);
	}
	
	static int areaofcir(float pi, int r)
	{
		return (int)(pi*r*r);
	}
	
	static int areaofrect(int l, int b)
	{
		return (l*b);
	}
	
	static int areaofsq(int s)
	{
		return(s*s);
	}

	public static void main(String[] args)
	{
//		Calculate c = new Calculate();
		
		System.out.println("The addition of 2 numbers is: " +Calculate.add(11,11));
		System.out.println("The area of Circle is: " +Calculate.areaofcir(3.14f, 30));
		System.out.println("The area of Rectangle is: " +Calculate.areaofrect(15,12));
		System.out.println("The area of Square is: " +Calculate.areaofsq(15));
//		c.add(11, 12);
//		c.areaofcir(3.14f, 20);
//		c.areaofrect(15, 12);
//		c.areaofsq(15);
	}
}