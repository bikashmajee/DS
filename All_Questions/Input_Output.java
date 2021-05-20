package All_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input_Output {

	public static void main(String args[]) throws IOException{
	InputStreamReader obj=new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(obj);
    String s=br.readLine();
    System.out.println("OutPut Is :" +s);
	}

}
