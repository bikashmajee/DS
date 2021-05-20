package NQT;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,i,c=0;
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(a+" "+b);

		for(i=0;i<n;i++) {
 			c=a+b;
			a=b;
			b=c;
			System.out.print(" " +c +" ");

		}
	}
}
