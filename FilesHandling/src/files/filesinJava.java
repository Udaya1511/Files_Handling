package files;

import java.io.File;

public class filesinJava {
	
	public static void main(String[] args) {
		
		File myObj = new File ("C:\\Users\\UD20461958\\OneDrive - Wipro\\Documents\\Udaya Kumar - Case Studies");
		if(myObj.exists()) {
			
			System.out.println("File Name : " + myObj.getName());
			System.out.println("Absolute path : " + myObj.getAbsolutePath());
			System.out.println("Writeable: " + myObj.canWrite());
			System.out.println("Readable: " + myObj.canRead());
			System.out.println("File size in byte" + myObj.length());
			
		} else {
			System.out.println("The file does not exist");
		}
	}

}
