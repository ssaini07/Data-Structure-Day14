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

	// search node
	public void searchNode(int data) {
		int index = 0;
		Node currNode = head;

		if (head == null) {
			System.out.println("List is empty");
		}

		else {
			while (currNode != null) {
				index++;
				if (currNode.data == data) {
					System.out.println("Element is present at " + index + "position");
					return;
				} else {
					currNode = currNode.next;
				}
			}
		}
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
