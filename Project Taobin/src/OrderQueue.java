import java.util.Queue;
import java.util.LinkedList;

public class OrderQueue {

    private Queue<Order> orders = new LinkedList<>();

    public void enqueue(Order order) {
        orders.offer(order);
    }

    public void showQueue() {

        System.out.println("\n========== ORDER QUEUE ==========");

        if (orders.isEmpty()) {
            System.out.println("No orders in queue.");
            return;
        }

        for (Order order : orders) {
            System.out.println("Order ID: "
                    + order.getOrderID()
                    + " | Total: "
                    + order.getTotal() + " Baht");
        }
    }

    public void processOrders() {

        System.out.println("\n========== PROCESS ORDERS ==========");

        if (orders.isEmpty()) {
            System.out.println("No orders to process.");
            return;
        }

        while (!orders.isEmpty()) {

            Order order = orders.poll();

            System.out.println("\nProcessing Order ID: "
                    + order.getOrderID());

            order.showReceipt();
        }

        System.out.println("\nAll orders completed!");
    }
}