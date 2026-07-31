public class Stacktest2 {
 
	public static void main(String[] args) {
	 String message = "A(B))C(D)";
	 StackArrayBased stacks = new StackArrayBased(message.length());
	 boolean isBalance = true; // Assume the parentheses is balance
	 for (int i=0; i<message.length(); i++) {
		 char letter = message.charAt(i); // Get each character in message
		 if (letter == '(') { // If the character is (, push in stack
			 stacks.push(letter); 
		 } else if (letter == ')') { // If the character is )
			 if (!stacks.isEmpty()) {
				 stacks.pop();
			 } else {
				 isBalance = false;
				 break;
			 }
		 }
	 }
	 if (!stacks.isEmpty()) {
		 isBalance = false;
	 }
	 System.out.println(isBalance);
	}
}

