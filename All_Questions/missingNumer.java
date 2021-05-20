package All_Questions;

 
public class missingNumer {

	public static void main(String[] args) {
 		 
		 int[] str= {1,2,3,4,5,6};
 		 int add=0;
		 int l=str.length+1;
		 int totel=l*(l+1)/2;

		 for(int i=0;i<str.length;i++) {
			 add =add+str[i];
		 }
		 System.out.println(totel-add);
		 

	}

}
