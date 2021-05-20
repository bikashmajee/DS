package All_Questions;

import java.util.Scanner;

public class Cross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
		
		if(l%2==0) {
			System.out.println("String is Even..");
			return;
		}else {
		for (int i = 0; i < l; i++)
	    {
	        int j = l - 1 - i;
	        for (int k = 0; k < l; k++)
	        {
	            if (k == i || k == j)
	                System.out.print(str.charAt(k));
	            else
	                System.out.print(" ");
	        }
	        System.out.println("");
	    }
	
	}
	}

}
