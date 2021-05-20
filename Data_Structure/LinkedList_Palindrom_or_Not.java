package Data_Structure;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Palindrom_or_Not {

	public static void main(String[] args) {
		int len;
		LinkedList<Integer> ll=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Element: ");
	
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ll.add(sc.nextInt());
		}
		if(n%2==0) {
			len=n/2;
			System.out.println("len1 value is: " +len);
		}
		else {
			len=n-1/2;
			System.out.println("len2 value is: " +len);

		}
  		for(int i=0;i<len;i++) {
			for(int j=n;j<len;j--) {
				if(ll.get(i)==ll.get(j)){
					System.out.println("palindrom");
				}
				else {
						System.out.println("Not a palindrom");
					 }
			}
		}
		
		
		// TODO Auto-generated method stub

	}
	

}
