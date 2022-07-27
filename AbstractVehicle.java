package phase1.java;

class Vehicle {
	void run() {
		System.out.println("The vehicle can run");
	}
	
	void stop() {
		System.out.println("The vehicle can stop");
	}
	
	public void fuel(int petrol) {
		petrol = 20;
	}
	
	public void speeddist(float speed, String dist) {
		speed = 40.5f;
		dist = "30 kilometers";
	}
	
	public void type(char petrol, int speed) {
		petrol = 'N';
		speed = 50;
	}

}

class TwoWheeler extends Vehicle{
	void run() {
		System.out.println("This 2 Wheeler can run");
	}
	
	void stop() {
		System.out.println("This 2 Wheeler can stop");
	}
	
	void distance() {
		int speed = 40;
		System.out.println("The 2 Wheeler can travel longer");
	}
	
}