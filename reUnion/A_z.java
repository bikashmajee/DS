package reUnion;

import java.util.Scanner;

public class A_z {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int reach=0;
		String s="";
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		for(char i=a;i<=b;i++) {
				reach++;
		}
		for(char i=b;i<b+reach;i+=reach-1) {
			if(b!=i) {
				
			
			System.out.println(i);
		}}
		

	}

}
