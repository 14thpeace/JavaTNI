
import java.util.Stack; // or import java.util.*
public class Stacktest3 {
	
	public static void main(String[] args) {
		 // create a new stack
		 Stack<Integer> stacks = new Stack<>();
		 // push element into the stack
		 stacks.push(10);
		 stacks.push(11);
		 stacks.push(12);
		 System.out.println(stacks); // output is [10, 11, 12]
		 // Pop each elements from the stack
		 while (!stacks.empty()) {
		 System.out.println(stacks.pop());
		 }
		 }
}
