import java.util.LinkedList;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> cart = new LinkedList<String>();
		
		cart.add("Wireless Mouse");
		cart.add("Mecahanical Keyboard");
		cart.add("USB-C Hub");
		System.out.println(cart);
		
		cart.add(1, "Mouse Pad");
		System.out.println(cart);
		
		cart.removeLast();
		System.out.println(cart);
		
		cart.remove("Mouse Pad");
		System.out.println(cart);
		
		cart.add("Monitor");
		System.out.println(cart);
		
		cart.set(2, "Phone Holder");
		System.out.println(cart);
		
		System.out.println(cart.getLast());
				
	}

}
