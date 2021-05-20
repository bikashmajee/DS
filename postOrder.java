import java.util.Scanner;

public class postOrder {
	
	static Scanner sc=null;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		hlo root =createTree();
		
		// TODO Auto-generated method stub

	}
	static hlo createTree() {
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
	
	

}

class hlo{
	hlo left,right;
	int data;
	public hlo(int data) {
		this.data=data;
	}
}