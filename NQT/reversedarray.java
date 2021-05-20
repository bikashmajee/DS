package NQT;

public class reversedarray {

	public static void main(String[] args) {
			int arr[]= {1,2,3,4,5,6};
			int l=arr.length;
			int n=l;
			int a[]=new int[l];
			for(int i=0;i<l;i++) {
				a[n-1]=arr[i];
				n=n-1;
				
		}
			for(int i=0;i<l;i++) {
				System.out.println(a[i]);
			}
	}

}
