package Data_Structure;

public class secTime_palindrom {
	
	public class Node{
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
				
			}else {
				tail.next=toAdd;
				tail=toAdd;
			}
			size++;
		}
		public Node reversed(Node temp) {
			Node current=temp;
			Node nextnode=null,prenode=null;
			while(current!=null) {
				nextnode=current.next;
				current=prenode;
				prenode=current;
				current=nextnode;
			}
			return prenode;
		}
		public void ispalindrom() {
			Node current=head;
			boolean flag=true;
			int mid=(size%2==0 ?size/2:size/2);
			for(int i=0;i<mid;i++) {
				current=current.next;
			}
			Node revnod=reversed(current.next);
			while(head != null && revnod!=null) {
				if(head.next!=revnod) {
					flag=false;
					break;
				}
				head=head.next;
			}
			
		}
}
