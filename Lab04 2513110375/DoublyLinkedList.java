public class DoublyLinkedList {
    // Attributes in Class DoublyLinkedList
    private Node head;
    private Node tail;

    // Default Constructor
    public DoublyLinkedList () {
        this.head = null;
        this.tail = null;
    }

    // Method for traverse all nodes
    public String traversal() {
        Node current_node = head;
        String result = "[";
        boolean first = true;
        while (current_node != null) {
            result += (!first ? ", " : "") + current_node.data;
            current_node = current_node.next;
            first = false;
        }
        result += "]";
        return result;
    }


    public void insert(Object value) {
        Node new_node = new Node(value); //create a new node

        if (head == null ) { //check if it is empty list
            head = new_node;
            tail = new_node;

        } else {
            tail.next = new_node;
            new_node.previous = tail;
            tail = new_node;
        }
    }

    public void insert(int position, Object value) {
        Node new_node = new Node(value); //create a new node

        if (head == null ) {
            head = new_node;
            tail = new_node;

        } else if (position == 0) {
            new_node.next = head;
            head.previous = new_node;
            head = new_node;
        } else {
            Node current_node = head;
            int current_position = 0;
            while (current_node != null && current_position < position-1) {
                current_node = current_node.next;
                current_position++;
            }
            new_node.previous = current_node;
            new_node.next = current_node.next;
            current_node.next.previous = new_node;
            current_node.next = new_node;
        }
    }

    public void remove() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.previous;
                tail.next = null;
            }
        }
    }

    public void remove(int position) {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else if (position == 0) {
                head = head.next;
                head.previous = null;
            } else {
                Node current_node = head;

                for(int i = 0;i <position;i++) {
                    current_node = current_node.next;
                }
                current_node.next.previous = current_node.previous;
                current_node.previous.next = current_node.next;
            }

        }
    }

    public String backwardTraversal() {
        Node current_node = tail;
        String result = "[";
        boolean first = true;

        while (current_node != null) {
            result += (!first ? ", " : "") + current_node.data;
            current_node = current_node.previous;
            first = false;
        }

        result += "]";
        return result;
    }

}