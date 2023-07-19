package exceptionHandling;
import java.io.*;
import java.io.FileNotFoundException;
public class Compile {
	public static void main(String[]args)throws IOException  {
		try {
		File f=new File("D:\\New folder\\tes.txt");
		FileReader fr=new FileReader(f);
		int a=0;
				while((a=fr.read())!=-1) {
					System.out.print((char)(a));
		}
		}
		catch(FileNotFoundException a) {
			System.out.println("Invalid path");
		}
	}
}
	

