import java.util.Scanner;

public class Binary_tTree {
	
	static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		createTree();
		
		// TODO Auto-generated method stub

	}
	static Node createTree() {
		Node root=null;
		System.out.println("Enter Data: ");
		int data=sc.nextInt();
		if(data == -1)
		{
			return null;
		}
		root =new Node(data);
		System.out.println("Enter Left For " +data);
		root.leftl=createTree();
		System.out.println("Enter Right For " +data);
		root.right=createTree();		
		return root;
	}
}

class Node{
	Node leftl,right;
	int data;
	public Node(int data) {   					/// create a Constructor
		this.data=data;
	}
}