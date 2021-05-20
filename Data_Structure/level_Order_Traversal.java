package Data_Structure;

import java.util.Scanner;

public class level_Order_Traversal {

	static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		Node root=createTree();
		traversal(root);

		// TODO Auto-generated method stub
		
		
	}
	static Node createTree() {
		Node root=null;
		System.out.println("Enter Data: ");
		int data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		root=new Node(data);
		System.out.println("Enter left data:");
		root.left=createTree();
		System.out.println("Enter right Data: ");
		root.right=createTree();
		return root;
		
	}
	static void traversal( Node root) {
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		//traversal(root.left);
		//traversal(root.right);

		Node temp;
		temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
}

class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
	}
}