package Data_Structure;

import java.util.Scanner;

import Data_Structure.MyLinkedList.Node;

public class plindrom_by_me {
	
	 class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}	
	}
	public int size;
	Node head=null;
	Node tail=null;
	public void addNode(int data) {
		Node toAdd=new Node(data);
		if(head==null) {
			head=toAdd;
			tail=toAdd;
		}
		else {
			tail.next=toAdd;
			tail=toAdd;
		}
		size++;

	}
	public Node ReversedList(Node temp) {
		Node current =temp;
		Node secondNode=null; 
		Node prevNode=null;
		
		while (current!=null) {
			secondNode=current.next;
			current.next=prevNode;
			prevNode=current;
			current=secondNode;
		}
		return prevNode;
	}
	public void isPalindrom(){
		Node current =head;
		boolean flag=true;
		int mid=(size%2==0 ? size/2:(size+1)/2);
		for(int i=0;i<mid;i++) {
			current=current.next;
			
		}
		
		Node revHead=ReversedList(current.next);
		
		while(head !=null && revHead !=null) {
			
		
			if(head.data != revHead.data ) {
				flag=false;
				break;
			}
			head=head.next;
			revHead=revHead.next;
		}
		if(flag) {
			System.out.print("Palindrom  ");
		}
		else {
			System.out.print("Not  Palindrom");
		}
	}
	void print() {
		Node temp=head;

		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp =temp.next;
		}
		
	}
	public static void main(String args[]) {
		
		plindrom_by_me p=new plindrom_by_me();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			p.addNode(sc.nextInt());
		}
		p.print();
		p.isPalindrom();
	}
	
	
}
