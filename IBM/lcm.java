package IBM;

import java.util.Scanner;

public class lcm {
	public static void main(String args[]) {
		
		int a,b,c,lcm=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c) {
			lcm=a;
		}
		else if(b>c&&b>a) {
			lcm=b;
		}
		else if(c>a&&c>b) {
			lcm=c;
		}
		while(true) {
			if(lcm%a==0 && lcm%b==0 && lcm%c==0) {
				System.out.println(lcm);
				break;
			}
			++lcm;
		}
	}
}
