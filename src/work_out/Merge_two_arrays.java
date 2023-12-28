package work_out;

public class Merge_two_arrays {

	public static void main(String[] args) {
		int[]a= {1,3,5,7,9};
		int[]b= {2,4,6,8,10};
		int alength=a.length;
		int blength=b.length;
		int clength=alength+blength;
		int[] c=new int[clength];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<clength;i++) {
			System.out.print(c[i]+" ");
		}


	}

}
