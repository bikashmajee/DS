package NQT;

import java.util.Scanner;

public class candies_jar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totel=10,limit=5 ;
		 Scanner sc=new Scanner(System.in);
		 int out=sc.nextInt();
		  
		 if(out>=1 && out<=5) {
			 System.out.println("Out Candies are: " + out);
			 System.out.println("rest Candies are: " + (totel - out));

		 }
		 else {
			 System.out.println("Sorry: " );
			 System.out.println("rest Candies are: " + totel);
		 }
	}

}
