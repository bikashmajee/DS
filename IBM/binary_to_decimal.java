package IBM;
import java.util.*;


public class binary_to_decimal {

	public static void main(String[] args) {
		Scanner se=new Scanner(System.in);
		int a=se.nextInt();
		int b=a,i=0,c;
		int arr[]=new int[10];
		while(a!=0) {
			arr[i]=a%2;
			i++;
			a=a/2;
		} 
		for(int j=i-1; j>-1; j--)
        {
            System.out.print(arr[j]);
        }
        System.out.print("\n");
	}

}
