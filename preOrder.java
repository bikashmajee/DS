import java.util.Scanner;

public class preOrder {
	static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		pr root =createTree();
		preOrder(root);
		// TODO Auto-generated method stub
	}
	static pr createTree() {
		pr root=null;
		System.out.println("Enter Node :");
		int data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		root =new pr(data);
		System.out.println("Enter left node:" +data);
		root.left=createTree();
		System.out.println("Enter right node" +data);
		root.right=createTree();
		return root;
		
	}
	static void preOrder(pr root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data +" ");

		preOrder(root.left);
		//System.out.print(root.data +" ");
		preOrder(root.right);
	}

}
class pr{
	pr left,right;
	int data;
	public pr(int data) {
		this.data=data;
		
	}
}

