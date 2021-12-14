package Data_Structure.LinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkledList list = new LinkledList();
		list.insert(70);
		list.insert(40);
		list.insert(30);
		list.insert(56);
		System.out.println("Linked List Before Sorting ");
		list.show();
		list.sorting();
		System.out.println("Linked List After Sorting");
		list.show();
	}

}
