package files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String[] args) {
		try {
			
			FileWriter myWriter = new FileWriter("C:\\Users\\UD20461958\\OneDrive - Wipro\\Documents\\Udaya Kumar - Case Studies\\udaya.txt");
			myWriter.write("Welcome to wipro Technologies----> All the best for traing!!!!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			
			
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
	}

}
