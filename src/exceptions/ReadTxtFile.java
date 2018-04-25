package exceptions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFile {
	public static void main(String[] args) throws IOException {
		String filePath = "/Users/cybertek/Document/Notes.txt";
		try {
		FileReader fs = new FileReader(filePath);
		BufferedReader reader = new BufferedReader(fs);
		String line = reader.readLine();
		
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}




