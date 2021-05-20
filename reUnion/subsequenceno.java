package reUnion;

public class subsequenceno {
	
	static void printSubSeqRec(String str, int n,
							int index, String curr, String B)
	{
		// base case
		if (index == n) {
			return;
		}
		if (curr != null && !curr.trim().isEmpty())
		{
	    	//System.out.println(curr+"-<<<");

//			if(B.equals(curr)) {
//            	//b= false;
//		    	System.out.println("Posative" +curr);
//		    	
//            }
//			else {
//				System.out.println("N ");
//			}
		}
		for (int i = index + 1; i < n; i++) {
			curr += str.charAt(i);
			System.out.println(curr);
			if(B.equals(curr)) {
            	//b= false;
		    	System.out.println("<<_______Posative" +curr);
		    	
            }
			else {
				System.out.println("N ");
			}
			

			printSubSeqRec(str, n, i, curr ,B);

			// backtracking
			curr = curr.substring(0, curr.length() - 1);
			//System.out.println(curr);
		}
	}

	// Generates power set in
	// lexicographic order.
	static void printSubSeq(String str,String B)
	{
		int index = -1;
		String curr = "";

		printSubSeqRec(str, str.length(), index, curr, B);
	}

	// Driver code
	public static void main(String[] args)
	{
		String str = "coronavirus";
		String B="crnas";
		printSubSeq(str,B);
	}

}
