public class TodoList {
    public static void main(String[] args) {
        DoublyLinkedList todoList = new DoublyLinkedList();

        todoList.insert("Finish Homework");
        System.out.println(todoList.traversal());

        todoList.insert("Laundry");
        todoList.insert("Group Meeting");
        System.out.println(todoList.traversal());

        //ex2
        todoList.insert(0,"Summit Report");
        System.out.println(todoList.traversal());

        todoList.insert(2,"Buy Food");
        System.out.println(todoList.traversal());

        todoList.insert("Go to Gym");
        System.out.println(todoList.traversal());

        //ex4
        //4.1
        todoList.remove();
        System.out.println(todoList.traversal());

        //4.2
        todoList.remove(3);
        System.out.println(todoList.traversal());

        //4.3
        todoList.remove(0);
        System.out.println(todoList.traversal());

        //ex5
        System.out.println();
        System.out.println("Backward Traversal = " + todoList.backwardTraversal());

    }

}
