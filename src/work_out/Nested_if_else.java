package work_out;

import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
		int yourmark,passingmarks;
		char grade =0;
		passingmarks=40;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your mark");
		yourmark=s.nextInt();
		
		if(yourmark>passingmarks) {
			if(yourmark>90) 
				grade='A';
			else if(yourmark>80)
				grade='B';
			else if(yourmark>70)
				grade='C';
			else if(yourmark>60)
				grade='D';
		    else if(yourmark>40) 
			    grade='E';
			System.out.println("you passed the exam and your grade is"+" "+ grade);

		}else {
			    grade='F';
			System.out.println("you are fail and your grade is"+" "+grade);
		}

	}

}
