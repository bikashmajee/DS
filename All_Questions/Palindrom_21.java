package All_Questions;

import java.util.Scanner;

public class Palindrom_21 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); // input data 121
		int rem,div=0,aa=a,s=0;
		
		while(a>0) {
			rem=a%10;
			div=div*10 +rem;
			a=a/10;
		}
		if(aa==div) {
			System.out.println("IS Palindrom");
		}
		else {
			System.out.println("Not a palindrom");
		}
	}
}
