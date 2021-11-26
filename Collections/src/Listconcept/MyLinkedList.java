package Listconcept;

public class MyLinkedList {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
	
	
	public Node(int i) {
			// TODO Auto-generated constructor stub
		}


	public void Node(int data) {
		this.data=data;
		next=null;
		
	}
	
	}	

	public void printlinkedlist() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {
		
		MyLinkedList ll=new MyLinkedList();
		
		Node first=ll.new Node(10);
		ll.head=first;
		
		Node second=ll.new Node(20);
		first.next=second;
		
		Node third=ll.new Node(30);
		second.next=third;
	}

}
