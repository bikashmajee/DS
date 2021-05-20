package Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class Is_LinkedList_Palindron {
	
	 Node head;
	
	void add(int data) {
		Node toAdd=new Node(data);
		if(isEmpty()) {
			
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	
	boolean isEmpty() {
		return head==null;
	}
	public boolean ifPalindrom(Node node) {
		if(node ==null || node.next ==null) {
			return true;
		}
		Node slow,fast;
		slow =fast =node;
		Stack<Node> s =new Stack<Node>();
		s.push(slow);
		while (fast.next !=null && fast.next.next!=null) {
			slow =slow.next;
			fast =fast.next.next;
			s.push(slow);
		}
		if(fast.next==null) {
			s.pop();
			
		}
		
		Node secondHalf =slow.next;
		while(secondHalf !=null) {
			if(s.pop() !=secondHalf) {
				return false;
			}
			secondHalf=secondHalf.next;
		}
		return true;
		
	}
	
	
	
static class Node{
	int data;
	Node next;
	 
	public Node(int data) {
		this.data=data;
		next=null;
	}
}
}