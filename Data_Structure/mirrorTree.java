package Data_Structure;

import java.util.Scanner;

public class mirrorTree {
 	 static Scanner sc=null;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		sol root=createTree();
		mirTree(root);
		// TODO Auto-generated method stub

	}
	static sol createTree() {
		sol root =null;
		System.out.println("Enter Data: ");
		int data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		root=new sol(data);
		System.out.println("Enter Left Data: " +data);
		root.left=createTree();
		System.out.println("Enter Right Data:" +data);
		root.right=createTree();
		return root;
	}
	static void mirTree(sol root) {
		if(root==null) {
			return;
		}
		mirTree(root.right);
		mirTree(root.left);
		sol temp;
	    temp=root.left;
	    root.left=root.right;
	    root.right=temp;
		System.out.print(root.data);
	}

}

class sol{
	sol left,right;
	int data;
	public sol(int data) {
		this.data=data;
	}
}