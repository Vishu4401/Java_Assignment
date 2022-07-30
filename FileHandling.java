package phase1.java;

import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("This is a File Handling Program\n");
	System.out.println("Enter the contents to be displayed in the file");
	String data = sc.nextLine();
	System.out.println("Enter the content to be appended");
	String data1 = sc.nextLine();
	
	try {
		FileWriter output = new FileWriter("C:\\Users\\Vishwa\\Desktop\\File.txt");
		
		System.out.println(data);
		System.out.println("Initially no data is being written so the contents are not displayed");
		output.write(data);
		System.out.println("Contents of the file after the write operation is performed: \n" +data);
		
//		String data1 = sc.nextLine();
		output.append(data1);
		System.out.println("Contents of the file after the append operation is performed: \n" +data+data1);
		
		output.close();
	}
	catch(Exception e){
		e.getStackTrace();
	}
	}

}
