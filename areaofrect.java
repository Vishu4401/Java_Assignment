package phase1.mphasis;

public class areaofrect {
	int r = 40;
	float pi = 3.14f;
	int area;
	{
		area = (int) (pi*r*r);
	}
	public static void main(String args[])
	{
		areaofrect a = new areaofrect();
		System.out.println("Area of Rectangle: " +a.area);
	}
}
