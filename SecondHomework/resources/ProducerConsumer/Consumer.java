
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Consumer {
	
	public static void consumerRun() {
	
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
}
