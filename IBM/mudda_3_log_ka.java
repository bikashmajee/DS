package IBM;

import java.util.Scanner;

public class mudda_3_log_ka {
	public static void main(String args[]) {
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		String d ="";
		while(a>0) {
			b=a%2;
			if(b==1) {
				System.out.print("i");
			}
			else {
			d =d+ " " +b; 
			a=a/2;
			}
		}
		System.out.print(d);
	}
}
