package work_out;

import java.util.Scanner;

public class Fahrenhiet_to_Celsius {

	public static void main(String[] args) {
		float temperature;
		Scanner s=new Scanner(System.in);
		System.out.println("enter temperature value in fahrenhiet");
		temperature=s.nextFloat();
		
		temperature=(temperature-32)*5/9;
		System.out.println("temperature value in celsius="+temperature);

	}

}
