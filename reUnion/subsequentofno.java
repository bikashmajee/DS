package reUnion;
import java.util.*;

public class subsequentofno {
	
     
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter Input String : ");
         
        String inputString = sc.next();
        String n=sc.next();
         
        //printAllSubstrings(inputString);
         
        sc.close();
        boolean b=false;
        
        System.out.println("All possible substrings of "+inputString+" are : ");
        
        for (int i = 0; i < inputString.length(); i++) 
        {
            for (int j = i+1; j <= inputString.length(); j++) 
            {
               // System.out.println(inputString.substring(i, j));
                if(n.equals(inputString.substring(i,j))) {
                	b= f;
                	System.out.println("dd");
                }
            }
        }
        if(b) {
        	System.out.println("Posative");
        	
        }
        else {
        	System.out.println("Negative");
        }
    }

}
