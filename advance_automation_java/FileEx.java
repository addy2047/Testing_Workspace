package selenium_webdriver;

import java.io.File;
import java.io.IOException;

public class FileEx 
{
	public static void main(String[] args) throws IOException {
		
		
		   File file  = new File("E://testFile1.txt");  
           file.createNewFile(); 
           
           System.out.println(file.canExecute());
           System.out.println(file.canRead());
           System.out.println(file.canWrite());
           System.out.println(file.exists());
           System.out.println(file.getPath());
           System.out.println(file.getAbsolutePath());
           System.out.println(file.getUsableSpace());
           System.out.println(file.lastModified());
		
	}
}
