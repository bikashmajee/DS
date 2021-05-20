package IBM;

import java.util.Scanner;

public class Fibonacci_Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("1");
		int b=0,c=1,d;
		for(int i=1;i<a;i++) {
			for(int j=1;j<i+2;j++) {
			d=b+c;
			b=c;
			c=d;
				System.out.print(d +" ");
			}
			System.out.println();
		}
	}

}
