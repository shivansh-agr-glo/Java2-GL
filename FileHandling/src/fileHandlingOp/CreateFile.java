package fileHandlingOp;

import java.io.File;
import java.io.FileReader;

public class CreateFile {

	public static void main(String[] args) {
		/*
		File file=new File("NewFile.txt");
		try {
			//File based object
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("New file created");
			}else {
				System.out.println("File already exists");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
			System.out.println("Exception handled");
		}
		*/
		
		
		//write in the file
		
		
		
		//Read the file
		File file=new File("NewFile.txt");
		char[] arr=new char[1000];
		//Create an object to read
		try {
			FileReader input=new FileReader("NewFile.txt");
			//Read the chars
			input.read(arr);
			System.out.println("Data in the file");
			System.out.println(arr);
			
			System.out.println("can read? " + file.canRead());
			System.out.println("can Write? " + file.canWrite());
			System.out.println("can Exist? " + file.exists());
			System.out.println("File name is: " + file.getName());
			System.out.println("File path: " + file.getAbsolutePath());
			System.out.println("File length: " + file.length());
			//close the file
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		
	}

}
