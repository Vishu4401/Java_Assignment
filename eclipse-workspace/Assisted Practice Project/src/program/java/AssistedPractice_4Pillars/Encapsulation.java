package program.java.AssistedPractice_4Pillars;

class Cars{
	private String name;
	public String getName()
	{
		 return name;
		
	}
	
	public void setName (String name)
	{
		 this.name = name;
	}
}

public class Encapsulation{
	public static void main(String[] args)
	{
		Cars cars = new Cars();
		cars.setName("Mercedes Benz");
		System.out.println(cars.getName());
	}
}
