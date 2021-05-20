package All_Questions;

public class palm {

	public static void main(String[] args) {
 		// tenet te=et
		// teten
		// tenet
		String s="tenet";
		int l=s.length();
		int count=0;
		int arr[]=new int[l];
		for(int i=0;i<l; i++) {
			arr[i]=s.charAt(i);
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {  // t==t
					count++; // 
				
			}
			
			
			}
		}
		if(l%2==0) {
			int c=count*2;
		}
		
	}

}
