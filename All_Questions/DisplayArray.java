package All_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayArray {

	public static void main(String args[]) throws NumberFormatException, IOException {
	      InputStreamReader obj=new InputStreamReader(System.in);
		    BufferedReader br =new BufferedReader(obj);
		    int number[]=new int[10];
		    System.out.println("Enter a number ::");
		    for(int i=0;i<10;i++) {
		    	number[i] =  Integer.parseInt(br.readLine());
	}
		    for(int i=0;i<10;i++) {
		    	System.out.println(number[i]);
		    }
	}

}
