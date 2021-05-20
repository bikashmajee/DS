package NQT;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number,cno,ano=0;
		cno=n;
		while(cno!=0) {
			number =cno%10;
			ano +=Math.pow(number, 3);
			cno /= 10;
		}
		if(ano==n) {
			System.out.println("ama");
		}
		else {
			System.out.println(" not ama");

		}
	}

}
