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

	// 56->30->40->70
	// sorting
	public void sorting() {
		Node node = head;

		Node index = null;
		int temp;
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			while (node != null) {
				index = node.next;
				while (index != null) {
					if (node.data > index.data) {
						temp = node.data;
						node.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				node = node.next;

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
