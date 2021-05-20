package NQT;

import java.util.Scanner;

public class palindrom_div {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,r;	
		int temp=n;
		while(n>0) {
			r=n%10;
			n=sum*10 +r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("Not a palindrom");
		}
	}

}
