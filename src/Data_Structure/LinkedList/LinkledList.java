package Data_Structure.LinkedList;

public class LinkledList {
	Node head;

	// insert at first
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	// insert after 30
	public void insertAfter(int index, int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		Node n = head;
		for (int i = 0; i < index; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}

	// show method
	public void show() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println("Null");
	}
}
