package All_Questions;
import java.io.*;
import java.util.*;
public class iloveu {
        
 		public static void main(String args[]) throws IOException{
			InputStreamReader obj=new InputStreamReader(System.in);
		    BufferedReader br =new BufferedReader(obj);
			Stack<Character>stack=new Stack();

		    String str=br.readLine();
        int l=str.length();
        String s="";
        
        for(int i=0;i<l;i++){
            if(str.charAt(i)!='/' && str.charAt(i)!='\\' ){
               // return;
            	stack.push(str.charAt(i));
             }
            
            ///////
            
            
            
        }
      // System.out.println(stack);
//        for(int i=s.length()-1;i>=0;i--) {
//        	System.out.println(s.charAt(i));
//
//        }
        for(int i=0;i<stack.size();i++) {
        	s+=stack.pop();
        	//stack.pop();
        }
        System.out.println(s);
	}
}
