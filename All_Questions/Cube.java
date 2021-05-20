package All_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cube {
	public static void main(String args[]) throws NumberFormatException, IOException {
	      InputStreamReader obj=new InputStreamReader(System.in);
		    BufferedReader br =new BufferedReader(obj);
		    System.out.println("Enter a number ::");
			int number =  Integer.parseInt(br.readLine());		

	      System.out.println("Output is "+(number*number*number));
	   }
}
