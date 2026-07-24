
public class TodoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList todoList = new DoublyLinkedList();
		
		todoList.insert("Finish Homework");
		System.out.println(todoList.traversal());
		
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		System.out.println(todoList.traversal());
		
		
		//ex1
		todoList.insert(0, "Summit report");
		System.out.println(todoList.traversal());
		
		todoList.insert(2, "Buy food");
		System.out.println(todoList.traversal());
		
		todoList.insert("Go to Gym");
		System.out.println(todoList.traversal());

	}

}
