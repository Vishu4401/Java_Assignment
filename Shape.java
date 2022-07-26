package phase1.java;

public class Shape {
	int r = 40, s = 25, l = 20, b = 15;
	float pi = 3.14f, areaofcir;
	int areaofsq, areaofrect;
	{
		areaofsq = (s*s);
	}
	
	{
		areaofrect = (l*b);
	}
	
	{
		areaofcir = (pi*r*r);
	}
	
	public static void main(String[] args)
	{
		Shape S = new Shape();
		System.out.println("Area of Square is: " +S.areaofsq);
		System.out.println("Area of Rectangle is: " +S.areaofrect);
		System.out.println("Area of Circle is: " +S.areaofcir);
	}
	
}
