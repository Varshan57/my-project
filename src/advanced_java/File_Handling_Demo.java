package advanced_java;
// File is an abstract data type container
// To store only related information with priority
// File usually stores data as stream(series or sequences)
// There are two types of streams 1.byte stream 2.character stream
// Basic operations of file handling
// 1.File creation
// 2.Getting file information
// 3.Writing data into a file
// 4.Reading data from the file
// 5.Deleting a file
import java.io.*;
import java.io.File;
import java.io.IOException;
public class File_Handling_Demo {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Administrator\\Desktop\\kailash\\demo.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("file "+f.getName()+" created");
			}else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
