package IlkhaftaOdevleri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Producer {
	
	public static void producerRun() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please write the team names and the score of the match...");
	
	String input = scan.nextLine();
	
	byte[] input_Array = input.getBytes();
	
	try {
		FileOutputStream fileOut = new FileOutputStream("score.txt");
		
		fileOut.write(input_Array);
		
		fileOut.close();
		
		System.out.println("Write to file successful!");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  }
	
}
