package Data_Structure;

import java.util.Scanner;

 

public class postOrder_LRN {

	static Scanner sc=null;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		hlo root =createTree();
		preOrder(root);
		
		// TODO Auto-generated method stub

	}
	static hlo createTree() {
		hlo root=null;
		System.out.println("Enter Node :");
		int data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		root =new hlo(data);
		System.out.println("Enter left node:" +data);
		root.left=createTree();
		System.out.println("Enter right node" +data);
		root.right=createTree();
		return root;
		
	}
	static void preOrder(hlo root){
		if(root==null) {
			return;
		}
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data +" ");
	}
}

class hlo{
	hlo left,right;
	int data;
	public hlo(int data) {
		this.data=data;
	}
}