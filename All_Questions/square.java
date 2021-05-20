package All_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class square {
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int number, square;
		InputStreamReader obj=new InputStreamReader(System.in);
	    BufferedReader br =new BufferedReader(obj);
 		System.out.print(" Please Enter any Number : ");
		number =  Integer.parseInt(br.readLine());		

		square = number * number;
		
		System.out.println("\n Output Is : " + number + "  =  " + square);
	}

}
