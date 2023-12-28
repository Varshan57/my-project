package advanced_java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading_File {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\kailash\\info.txt");
			char arr[]=new char[500];
			fr.read(arr);
			System.out.println(arr);
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
