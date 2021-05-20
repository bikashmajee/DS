package NQT;

import java.util.Scanner;

public class print_the_pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int two=1,three=1;
		for(int i=0;i<n;i++) {
			System.out.print(two + " " +three +" ");
			two=two*2;
			three=three*3;
		}

	}

}
