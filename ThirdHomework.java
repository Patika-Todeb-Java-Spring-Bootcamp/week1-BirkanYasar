package IlkhaftaOdevleri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ThirdHomework implements Runnable {
	
	private String name;
	
	public ThirdHomework(String Commandname) {
		this.name = name;
	}

	public void run() {
		
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
		
		System.out.println("Waiting for response from remote server.\nPlease wait...");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			int value;
			int count = 0;
			String s = "";
			
			FileInputStream fileInput = new FileInputStream("score.txt");
			
			while((value = fileInput.read()) != -1) {
				
				s += (char)value;
			}
			System.out.println("Match result :" + s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThirdHomework("ProducerConsumer"));
		
		t1.start();
		
	}
	
}

@author BirkanYasar
