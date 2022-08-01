package program.java.AssistedPractice_4Pillars;


//Abstract class
abstract class Car {
	public abstract void stop();
	{
	System.out.println("Car::stop");
	}
}

//Concrete class
class Bike extends Car {
	public void stop()
	{
//		System.out.println("Bike::Stop");
		System.out.println("To stop the car we need to use the break");
	}
}

public class Abstraction {
	public static void main(String args[])
	{
		Car obj = new Bike(); // Car object =>contents of Honda
		obj.stop(); // call the method
	}
}

