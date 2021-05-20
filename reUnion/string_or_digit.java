package reUnion;

import java.util.Scanner;

public class string_or_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.matches("[0-9]+") && s.length()>2){
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}

}
