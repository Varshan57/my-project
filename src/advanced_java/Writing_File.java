package advanced_java;

import java.io.FileWriter;
import java.io.IOException;

public class Writing_File {

	public static void main(String[] args) {
		String data="neer paravai & alagzi are the finest films in tamil";
		try {
			FileWriter fw=new FileWriter("C:\\Users\\Administrator\\Desktop\\kailash\\info.txt");
			fw.write(data);
			System.out.println("Data enter successfully");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
