package advanced_java;

import java.io.File;

public class File_Status_Demo {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Administrator\\Desktop\\kailash\\info1.txt");
		/*if(f.exists()) {
			System.out.println("File name is "+f.getName());
			System.out.println("File path is "+f.getAbsolutePath());
			System.out.println("File length is "+f.length());
			System.out.println("is file readable "+f.canRead());
			System.out.println("is file writable "+f.canWrite());
		}

	}*/
		if(f.delete()) {
			System.out.println("info txt file is deleted");
		}else {
			System.out.println("not deleted");
		}
	}
}
