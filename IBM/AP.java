package IBM;
import java.util.*;
public class AP {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int n,a,d;
 		a=sc.nextInt();
		d=sc.nextInt();
		n=sc.nextInt();

		int series = ((n / 2) * (2 * a + (n - 1) * d));
		System.out.println(series);
	}

}
