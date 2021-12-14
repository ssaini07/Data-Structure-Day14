package Data_Structure.LinkedList;

public class LinkledList {
	Node head;
	int size;

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

	// delete node
	public void deleteNode(int key) {
		if (head == null) {
			System.out.println("Linklist is empty");
		} else {
			Node temp = head;
			if (head.data == key) {
				head = head.next;
				size--;
			}
			while (temp != null && temp.next != null) {
				if (temp.next.data == key) {
					temp.next = temp.next.next;
					size--;
				}
				temp = temp.next;
			}
		}
	}

	// check length of node
	public void size() {
		int size = 0;
		Node current = head;
		if (head == null) {
			System.out.println("Size is 0");
		}
		current = head;
		size = 1;
		while (current.next != null) {
			current = current.next;
			size++;
		}
		System.out.println("size of the linked list is:" + size);
	}

	// search the element
	public void searchElement(int key) {
		Node node = head;
		int loc = 1;
		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (node != null) {
				if (node.data == key) {
					System.out.println("Element is found");
					break;
				}
				loc++;
				node = node.next;
			}
		}
		if (flag) {
			System.out.println("Element is present at location: " + loc);
		} else {
			System.out.println("Searched element is not found in the list");
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
