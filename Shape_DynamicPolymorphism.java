package phase1.java;

public class Shape_DynamicPolymorphism {
//	int length, breadth, height, base, side, d1, d2;
	int areaofrect, areaoftri, areaofsq, areaofrhomb;
}
	class Rectangle extends Shape_DynamicPolymorphism{
		int length = 25;
		int breadth = 18;
		void Rect() {
			areaofrect = length * breadth;		
			System.out.println(areaofrect);
		}
}
