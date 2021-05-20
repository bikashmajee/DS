package reUnion;

import java.util.Scanner;

public class CreateTree {
	static Scanner sc=null;
	public static void main (String args[]) {
		sc=new Scanner(System.in);
		CreateTreee();
		
	}
	private static Node CreateTreee() {
		System.out.println("Enter data : ");
		int data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		Node root=new Node(data);
		System.out.println("Enter the NODE value"+data);
		root.left=CreateTreee();
		System.out.println("Enter the NODE value"+data);
		root.right=CreateTreee();
		return root;
		
	}
}
class Node{
	int data;
	Node left,right;
	public Node(int  data) {
		this.data=data;
	}
}
