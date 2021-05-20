package All_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class squareRoot {
	
	
		public static void main(String[] args) throws NumberFormatException, IOException    
		{   
		System.out.print("Enter a number: ");   
		InputStreamReader obj=new InputStreamReader(System.in);
	    BufferedReader br =new BufferedReader(obj);
		int n =  Integer.parseInt(br.readLine());

		System.out.println("Output is :"+fsquareRoot(n));  
		}    
		public static double fsquareRoot(int num)   
		{    
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		return sqrtroot;  
		}  
		

}
