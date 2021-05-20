package NQT;

import java.util.Scanner;

public class reversed_number {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String num=sc.nextLine();
//	int rev= 0;
//	while(num!=0) {
//		rev=rev*10+num%10;
//		num=num/10;
//	}
	StringBuffer sb=new StringBuffer(String.valueOf(num));
	
	
	System.out.println("Reversed Number is : " + sb.reverse());
}
}