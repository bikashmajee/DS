package Data_Structure;

import java.util.Scanner;

public class string_exm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sk=new Scanner(System.in);
	        int t= sk.nextInt();
	        for(int x=0;x<t;x++){
	            long m,k,c = 0,n2=0;
	            String n;
	            m= sk.nextInt();
	            k= sk.nextInt();
	            n=sk.next();
	            c=Long.parseLong(n)%k;
	           // if(n.length()==m && n.length()!=1){
	                for(int i=0;i<n.length();i++){
	                    StringBuilder sb=new StringBuilder(n);
	                    sb.deleteCharAt(i);
	                    n2=Long.parseLong(String.valueOf(sb));
	                    if (n2%k > c){
	                        c=n2%k;

	                    }
	                //}
	            //}else {
	               // System.out.println("String Length is incorrect");
	            //}
	            System.out.println(c);



	        }

	}

}
