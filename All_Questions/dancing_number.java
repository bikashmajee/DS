package All_Questions;

import java.util.Scanner;

public class dancing_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(i!=11) {
				System.out.print(i +" ");
			}
			else {
				if(count % 2 == 0) {
					i+=2;
					System.out.print(i +" ");
				}
				else {
					i+=9;
					System.out.print(i +" ");
				}
				count++;
			}
		}
	}

}
