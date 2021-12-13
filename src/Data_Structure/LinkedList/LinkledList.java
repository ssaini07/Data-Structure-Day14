package Data_Structure.LinkedList;

import java.util.LinkedList;

public class LinkledList {
	Node head;
	public class Node {
		int data;
		Node next;
		
		public Node(int data) {
			
			this.data = data;
			this.next = null;
		}
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next = head;
		head= newNode;
	} 
	
	public void display() {
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			System.out.println(currNode.data + "->");
			currNode = currNode.next;
		}
		
	}
	public static void main(String[] args) {
		LinkledList linkedlist = new LinkledList();
		linkedlist.addFirst(70);
		linkedlist.addFirst(30);
		linkedlist.addFirst(56);
		
		linkedlist.display();
		System.out.println("heelo woeldl");
		
	}

}
