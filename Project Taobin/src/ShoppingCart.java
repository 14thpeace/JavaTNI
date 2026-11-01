import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    public int showCart(MenuSelection data) {
        String[] menu = data.getMenu();
        int[] price = data.getPrice();
        ArrayList<Integer> cart = data.getCart();

        int total = 0;

        System.out.println("\n========== SHOPPING CART ==========");

        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return 0;
        }

        for (int i = 0; i < menu.length; i++) {
            int quantity = 0;

            for (int item : cart) {
                if (item == i) {
                    quantity++;
                }
            }

            if (quantity > 0) {
                int subtotal = quantity * price[i];

                System.out.println(menu[i]
                        + " x " + quantity
                        + " = " + subtotal + " Baht");

                total += subtotal;
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Total: " + total + " Baht");

        return total;
    }

    public int manageCart(Scanner sc, MenuSelection data) {
        ArrayList<Integer> cart = data.getCart();

        int choice;

        do {
            showCart(data);

            if (cart.isEmpty()) {
                return 0;
            }

            System.out.println("\n[1] Remove Drink");
            System.out.println("[2] Add More Drinks");
            System.out.println("[3] Checkout");
            System.out.print("Choose: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nItems in Cart:");

                    for (int i = 0; i < cart.size(); i++) {
                        int index = cart.get(i);

                        System.out.println((i + 1) + ". "
                                + data.getMenu()[index]);
                    }

                    System.out.print("Select item to remove: ");
                    int remove = sc.nextInt();

                    if (remove >= 1 && remove <= cart.size()) {
                        int removed = cart.remove(remove - 1);

                        System.out.println(data.getMenu()[removed]
                                + " removed!");
                    } else {
                        System.out.println("Invalid item!");
                    }
                    break;

                case 2:
                    data.showMenu();

                    System.out.print("Select drink to add: ");
                    int add = sc.nextInt();

                    if (add >= 1 && add <= data.getMenu().length) {
                        cart.add(add - 1);

                        System.out.println(data.getMenu()[add - 1]
                                + " added!");
                    } else if (add != 0) {
                        System.out.println("Invalid menu number!");
                    }
                    break;

                case 3:
                    System.out.println("Proceeding to payment...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        return showCart(data);
    }
}