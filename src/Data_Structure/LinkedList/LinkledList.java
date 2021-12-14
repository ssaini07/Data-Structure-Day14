package Data_Structure.LinkedList;

public class LinkledList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	//Insert between
	public void insertBetween(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
        Node n = head;
        for(int i=0; i<index-1; i++) {
        	n = n.next;
        }
        node.next=n.next;
        n.next=node;
	}
	// show method
	public void show() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}

	}
}