package IBM;

import java.util.*;

public class binary_to_integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		double s1 = 0;
		int n=s.length();

		
		for(int i=0;i<n;i++) {
			s1 +=Math.pow(2,i)*Integer.parseInt(s);
		}
		System.out.print(s1);
		
		
		

	}

}
