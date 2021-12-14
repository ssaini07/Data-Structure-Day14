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

	// delete at last

	public void deleteLast() {
		if (head == null) {
			System.out.println("The list is empty: ");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;

		}
		secondLast.next = null;
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
