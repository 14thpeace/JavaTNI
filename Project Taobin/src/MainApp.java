import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuSelection menu = new MenuSelection();
        ShoppingCart cart = new ShoppingCart();
        Payment payment = new Payment();
        OrderQueue orderQueue = new OrderQueue();

        int choice;

        do {
            System.out.println("\n=============================");
            System.out.println("           TAO BIN           ");
            System.out.println("=============================");
            System.out.println("[1] Start New Order");
            System.out.println("[2] Process Order Queue");
            System.out.println("[3] Show Queue");
            System.out.println("[0] Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    menu.clearCart();
                    menu.selectDrinks(sc);

                    if (menu.getCart().isEmpty()) {
                        System.out.println("No items selected.");
                        break;
                    }

                    int total = cart.manageCart(sc, menu);

                    if (total > 0) {
                        boolean paid = payment.pay(sc, total);

                        if (paid) {
                            Order order = new Order(menu);
                            orderQueue.enqueue(order);
                            menu.clearCart();

                            System.out.println("\nOrder added to queue!");
                            System.out.println("Order ID: " + order.getOrderID());
                        }
                    }
                    break;

                case 2:
                    orderQueue.processOrders();
                    break;

                case 3:
                    orderQueue.showQueue();
                    break;

                case 0:
                    System.out.println("Thank you for using TAO BIN!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}