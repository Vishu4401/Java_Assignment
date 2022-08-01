package program.java.AssistedPractice;

public class TryAndCatch {
	public static void main(String[] args) {
		try {
			int[] numbers = {1, 2, 3, 4};
			System.out.println(numbers[7]);
		}
		catch(Exception e) {
			System.out.println("This would result in index out of bound exception and "
					+ "it is caught to avoid the error using try and catch method");
		}
	}

}
