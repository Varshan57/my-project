package work_out;

import java.util.Scanner;

public class Celsius_to_Fahrenhiet {

	public static void main(String[] args) {
		float temperature;
		Scanner s=new Scanner(System.in);
		System.out.println("enter temperature value in celsius");
		temperature=s.nextFloat();
		
		temperature=(temperature*9/5)+32;
		System.out.println("temperature value in fahrenhiet="+temperature);


	}

}
