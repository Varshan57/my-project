package work_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Candies {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int [] child = new int[3];
		int candy = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i=0;i<3;i++) {

			System.out.println("Enter Child Rating");
			child[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<3;i++) {
			if(child[i]==0) {
				candy++;	
			}
			if(child[i]>1 && child[i]>child[i-1]) {
				candy+=2;
			}
		}
		System.out.println("No of Candies Required "+candy);
	}

}
