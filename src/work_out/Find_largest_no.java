package work_out;

import java.util.Scanner;

public class Find_largest_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y,z;
		System.out.println("enter three numbers");
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		
		if(x>y&&x>z) {
			System.out.println("first is largest number");
		}else if(y>x&&y>z){
			System.out.println("second is largest number");
		}else if(z>x&&z>y) {
			System.out.println("third is largest number");
		}else {
			System.out.println("three numbers are equal");
		}

	}

}
