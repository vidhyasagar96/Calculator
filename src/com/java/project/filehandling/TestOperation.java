package com.java.project.filehandling;

import java.io.IOException;
import java.util.Scanner;

public class TestOperation {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please select a operation: \n 1. Create a file \n 2. Read a file \n 3. Write a file \n 4. Append \n 5. Exit");
		int opr = input.nextInt();
	    input.nextLine();
		switch (opr) {
		case (1):
			System.out.println("Enter the file name with extension");
			String cName = input.nextLine();
			System.out.println("extension"+cName);
			FileOperation.createNewFile(cName);
			break;
			
		case (2):
			System.out.println("Enter the file name with extension");
		    String Rname = input.nextLine();
		    FileOperation.readFile(Rname);
		    break;
		    
		case (3):
			System.out.println("Enter the file name with extension:");
	        String wName = input.nextLine();
			System.out.println("Enter content to write:");
	        String content1 = input.nextLine();
	        FileOperation.writeFile(wName, content1);
	        break;
	        
		case (4):
			System.out.println("Enter the file name with extension:");
            String Aname = input.nextLine();
		    System.out.println("Enter content to append:");
            String content2 = input.nextLine();
			FileOperation.appendFile(Aname, content2);
		    break;
		    
		 default:
			 System.out.println("Thank you");
			}
		
		System.out.println("Done");
		input.close();
	}

}
