package com.java.project.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileOperation {
		   
			public static void createNewFile(String fileName) throws IOException { 
					File file = new File(fileName);
					
					if (file.createNewFile()) {
						System.out.println("File is created");
						}
					else
						System.out.println("File already exists");
			}
			public static void readFile(String filename) throws IOException {
				   File obj = new File(filename);
				   if(!obj.exists()) {
					   System.out.println("File does not exist");
				   return;}
			      Scanner myReader = new Scanner(obj);
			      while (myReader.hasNextLine()) {
			       String data = myReader.nextLine();
			       System.out.println(data);
			      }
			      myReader.close();
				   }
			
			public static void writeFile(String filename, String content) throws IOException {
			          FileWriter write = new FileWriter(filename);
                      write.write(content);
                      write.close();
			}
			public static void appendFile(String filename, String content) throws IOException {
                       FileWriter write = new FileWriter(filename,true);
                       BufferedWriter bw = new BufferedWriter(write);
                       bw.write(content);
                       bw.newLine();
                       bw.close();
		}
}
