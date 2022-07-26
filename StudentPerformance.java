package phase1.java;


//Calculate the overall performance obtained for all the 4 students and for all the 4 subjects

import java.util.Scanner;
public class StudentPerformance {
	public static void main(String[] args)
	{
		String name;
		int age, sub1, sub2, sub3, sub4;
//		char section, gender;
		double total, percentage;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student based details: ");
		System.out.println("Input number of students:");
		int n = Integer.parseInt(sc.nextLine().trim());
		name = sc.next();
		System.out.println("Enter the Age of the Student: ");
		age = sc.nextInt();
		System.out.println("Enter the Marks for Student for the 4 subjects: ");
		System.out.println("Enter the Subject 1 Marks: ");
		sub1 = sc.nextInt();
		System.out.println("Enter the Subject 2 Marks: ");
		sub2 = sc.nextInt();
		System.out.println("Enter the Subject 3 Marks: ");
		sub3 = sc.nextInt();
		System.out.println("Enter the Subject 4 Marks: ");
		sub4 = sc.nextInt();
		
		//To calculate the total and percentage scored by the student in the 4 subjects
		total = sub1 + sub2 + sub3 + sub4;
		percentage = (total/4);
		
		//To print all the results obtained by the student
		System.out.println("Total Marks: " +total);
		System.out.println("Percentage obtained by the student: " +percentage);
		
	}

}
