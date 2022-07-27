package phase1.java;

abstract class MNC {
	void Mnc() {
		System.out.println("MNC class is created");
	}

	abstract void tier(); // abstract method()
	abstract void mobile();

	void building() // non-abstract method()
	{
		System.out.println("Building is changed");
	}
}

abstract class Infosys extends AbstractMNC {
	

	 void tier() {
		System.out.println("This is from Tier in Infosys"); 
	 }
	
	 void mobile() {
		 System.out.println("This is mobile in Infosys");
	 }
	 
	 abstract void Mnc();
	 
	 abstract void buidling();
	 
}
	

 class Hello extends Infosys {
	void mobile() {
		System.out.println("This is mobile in Hello");
	}
	
	void call() {
		
		System.out.println("Call the parent");
	}

	@Override
	void Mnc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void buidling() {
		// TODO Auto-generated method stub
		
	}	
}

 class AbstractMNC {
	public static void main(String args[]) {

		// Bike obj = new Hello(); //?
//		Honda k = new Hello(); // reference of parent(Honda abstract class) and
								// object of Child(Hello) class
		Infosys i = new Hello();
		i.tier();
		i.mobile();
		i.Mnc();
//		
//		
		
	}
}