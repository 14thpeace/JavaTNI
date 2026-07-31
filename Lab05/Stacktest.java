
public class Stacktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackLinkedList stacks = new StackLinkedList();
		
		stacks.push(10);
		stacks.push(11);
		stacks.push(12);
		
		System.out.println(stacks.peek());
		System.out.println(stacks.pop());
		System.out.println(stacks.peek());
	
	}

}
