package reUnion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CovidPN {

	//public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//String s="coronavirus";
		public static void main(String args[]) throws IOException{
			InputStreamReader obj=new InputStreamReader(System.in);
		    BufferedReader br =new BufferedReader(obj);
		    String s=br.readLine();
			//String s="coronavirus";
			int n =  Integer.parseInt(br.readLine());		

		    for(int k=0;k<n;k++) {
		String B=br.readLine();
		int count =-1;
		for(int i=0;i<B.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(B.charAt(i)==s.charAt(j)) {
					//j=j;
					//System.out.println("equal");
					count ++;
					
			
			}
				
		}

	}
		if(count ==B.length()) {
			System.out.println("Posative");
		}
		else {
			System.out.println("Negative");
		}
		    }
	}

}
