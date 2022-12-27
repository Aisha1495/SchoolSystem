package aisha;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileReport {

	public static void main(String args[])  throws IOException{
		try {

			File f0 = new File("C:FileExample.txt");
			if (f0.createNewFile()) {
				System.out.println("File " + f0.getName() + " is created successfully.");
		
			} else {
				System.out.println("File is already exist in the directory.");
			}

		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred.");
			exception.printStackTrace();

		}
	

		
	}

}

