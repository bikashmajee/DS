package NQT;

import java.util.Scanner;

public class wall_painting_cost {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	int no =sc.nextInt();
	int temp=no;
	int rev =0,rem;
	while(temp !=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(no==rev) {
		System.out.println("NO is Palindrom ");
	}
	else {
	System.out.println("No is not palindrom ");
	}}
	
//	String Sx ,b=" " ;
//	Sx =sc.nextLine();
//	int n=Sx.length();
//	for(int i=n-1;i>=0;i--) {
//		b=b+ Sx.charAt(i);
//	}
//	if(Sx.equalsIgnoreCase(b)) {
//		System.out.println("Is it Palindrom");
//	}
//	else {
//		System.out.println("NOt a palindrom");
//	}
//	}
	
}
