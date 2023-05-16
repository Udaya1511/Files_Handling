package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\Users\\UD20461958\\OneDrive - Wipro\\Documents\\Udaya Kumar - Case Studies\\udaya.txt");
			Scanner myReader = new Scanner(myObj);
			
			if(myObj.exists()) {
				
				System.out.println("File Name : " + myObj.getName());
				System.out.println("Absolute path : " + myObj.getAbsolutePath());
				System.out.println("Writeable: " + myObj.canWrite());
				System.out.println("Readable: " + myObj.canRead());
				System.out.println("File size in byte" + myObj.length());
				
			} else {
				System.out.println("The file does not exist");
			}
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
				
			}
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Error Occured");
			e.printStackTrace();
			
		}
	}

}
