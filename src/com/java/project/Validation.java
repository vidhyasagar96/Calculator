package com.java.project;

import java.util.Scanner;
public class Validation {

	public static void main(String[] args) {
		 String a[] = {"michael@gmail.com","scott@gmail.com","steve@gmail.com","adam@gmail.com",
	   	           	           "daniel@gmail.com", "conor@gmail.com", "dustin@gmail.com", 
	   	           	           "carlos@gmail.com", "lewis@gmail.com", "james21@gmail.com"};
	   	 
	   	 Scanner obj = new Scanner(System.in);
	   	 
	   	 System.out.println("Enter the email ID:");
	   	 String mail = obj.nextLine();
	   	 obj.close();
	   	 String mail1 = mail.toLowerCase();
	   	 
	   	 for(int i=0; i<a.length; i++) {
	   		 
	   	 	      if(a[i].equals(mail1)) {
	   	     	  System.out.println("Your email ID is valid");
	   	    	  return;
	   	   	      }    
	   	    }
	   	    
	   	   System.out.println("Please enter a valid email ID");  
	   	 
    }
 
}
