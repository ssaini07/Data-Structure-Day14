package Data_Structure.LinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkledList list = new LinkledList();
		list.insert(70);
		list.insert(40);
		list.insert(30);
		list.insert(56);
		list.show();
		list.size();
		list.deleteNode(40);
		list.show();
		list.size();

	}

}
