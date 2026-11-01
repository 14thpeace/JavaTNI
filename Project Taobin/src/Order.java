import java.util.ArrayList;

public class Order {

    private static int nextOrderID = 1001;

    private int orderID;
    private int total;
    private String[] menu;
    private int[] price;
    private ArrayList<Integer> items;

    public Order(MenuSelection data) {

        orderID = nextOrderID++;

        menu = data.getMenu().clone();
        price = data.getPrice().clone();

        items = new ArrayList<>(data.getCart());

        total = 0;

        for (int item : items) {
            total += price[item];
        }
    }

    public int getOrderID() {
        return orderID;
    }

    public int getTotal() {
        return total;
    }

    public void showReceipt() {

        System.out.println("\n========== TAO BIN RECEIPT ==========");
        System.out.println("Order ID: " + orderID);
        System.out.println("-------------------------------------");

        for (int i = 0; i < menu.length; i++) {

            int quantity = 0;

            for (int item : items) {
                if (item == i) {
                    quantity++;
                }
            }

            if (quantity > 0) {
                System.out.println(menu[i]
                        + " x " + quantity
                        + " = " + (price[i] * quantity)
                        + " Baht");
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("Total: " + total + " Baht");
        System.out.println("Payment Status: SUCCESS");
        System.out.println("Thank you!");
        System.out.println("=====================================");
    }
}