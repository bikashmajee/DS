package All_Questions;

import java.util.Scanner;

public class aakash {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int out=1;
		 int  arr[]=new int[n];
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			if(arr[i]==0) {
				out=2;
			}
		}
		System.out.println(out);
	}
}
