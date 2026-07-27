import java.util.LinkedList;

public class ShoppingCart {

    public static void main(String[] args) {
        LinkedList<String> cart = new LinkedList<String>();

        cart.add("Wireless Mouse");         //1
        cart.add("Mechanical Keyboard");	//2
        cart.add("USB-C Hub");				//3
        System.out.println(cart);			//4

        cart.add(1,"Mouse Pad");
        System.out.println(cart);

        cart.removeLast();
        System.out.println(cart);

        cart.remove("Mouse Pad");
        System.out.println(cart);

        cart.add("Monitor");
        System.out.println(cart);

        cart.set(2,"Phone Holder");
        System.out.println(cart);

        System.out.println(	cart.getLast()); //15
    }

}
