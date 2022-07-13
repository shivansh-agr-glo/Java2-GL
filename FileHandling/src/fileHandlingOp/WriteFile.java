package fileHandlingOp;

import java.io.FileWriter;
import java.util.Scanner;


public class WriteFile {

	public static void main(String[] args) {
		String data="Hi this is Shivansh Agrawal. I am working in Global Logic as an Associate Software Engineer.";
		String info=" I added some more data.";
		try {
			//Create an object to write the file which is already Created
			FileWriter output=new FileWriter("NewFile.txt");
			
			//input dynamically
			String arr=new String();
			System.out.println("Enter the data: ");
			Scanner inp=new Scanner(System.in);
			arr=inp.nextLine();
			
			//Write String to the file
			output.write(data);
			output.write(info);
			output.write(arr);
			System.out.println("Data is strored in the file");
			
			output.close();
			inp.close();
		}
		catch(Exception e) {
			
		}

	}

}
