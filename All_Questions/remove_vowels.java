package All_Questions;

import java.util.Scanner;

public class remove_vowels {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		char[] arr=new char[len];
		//arr=str.charAt();
		String str2="";
		for(int i=0;i<len;i++) {
				if(str.charAt(i)=='a') {
					str2=str.replaceAll("a","");
					str.
				}
				 if(str.charAt(i)=='e') {
					str2=str.replaceAll("e","");

				}
				 if(str.charAt(i)=='i') {
					str2=str.replaceAll("i","");

				}
				 if(str.charAt(i)=='o') {
					str2=str.replaceAll("o","");

				}
				 if(str.charAt(i)=='u') {
					str2=str.replaceAll("u","");

				}
		}
		System.out.print(str2);
	}

}
