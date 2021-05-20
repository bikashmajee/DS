package NQT;

import java.util.Scanner;

public class word_is_the_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String arr[]= { "break" ,"case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
		int l=arr.length;
		String input=sc.nextLine();
		int b= 0;
		for(int i=0;i<l;i++) {
			if(arr[i].equals(input))
			{
				b=1;
				break;
			}
			
			 
		}
		
		if(b==1) {
			System.out.println(input+" It is a Keyword.");

		}
		else {
			System.out.println(input+" Its not a Keyword.");

		}
	}

}
