package core_java;

import java.io.FileOutputStream;
import java.io.IOException;

public class ioStream {

	public static void main(String[] args) throws IOException {
		
		String s ="HastaLaVista";
		FileOutputStream fout = new FileOutputStream("E://ADDY.txt");
		fout.write(s.getBytes());
		System.out.println("ok");
		
	}
}
