package All_Questions;
import java.io.*;
public class abc {
	public static void main(String args[]) throws IOException{
	InputStreamReader obj=new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(obj);
    String s=br.readLine();
	int l=s.length();
	int str[]=new int[l];
	for(int i=0;i<l;i++) {
		str[i]=s.charAt(i);
	}
	
	boolean c=true;
	for(int i=0;i<l;i++) {
		if(str[i]!=str[l-i-1]) {
			c=false;
			break;
		}
	}
	if(c) {
		System.out.println("Palindrom");

	}
	else {
		System.out.println("Not a Palindrom");
	}}

}
