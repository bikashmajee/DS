import java.util.Scanner;

public class inOrder_LRN {
	static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		cj root=createTree();
		inOrder(root);
		System.out.println();
		
	}

	static cj createTree() {
		cj root=null;
		System.out.println("Enter data: ");
		int data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		root =new cj(data);
		System.out.println("Enter Left Node" +data);
		root.left=createTree();
		System.out.println("Enter right Node" +data);

		root.right=createTree();
		return root;
		}
	static void inOrder(cj root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data +" ");
		inOrder(root.right);
		
	}
}


//cj==Node;

class cj{
	cj left,right;
	int data;
	public cj(int data) {
		this.data=data;
		
	}
}

 