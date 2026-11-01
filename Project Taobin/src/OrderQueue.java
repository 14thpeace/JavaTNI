import java.util.Queue;
import java.util.LinkedList;

public class OrderQueue {

    // สร้าง Queue สำหรับจัดเก็บคำสั่งซื้อ
    // ใช้ LinkedList เป็นโครงสร้างเบื้องหลัง
    private Queue<Order> orders = new LinkedList<>();

    // เพิ่มคำสั่งซื้อเข้า Queue
    public void enqueue(Order order) {

        // offer() เพิ่มข้อมูลเข้าไปท้าย Queue
        orders.offer(order);
    }

    // เมธอดแสดงรายการ Order ที่รออยู่ใน Queue
    public void showQueue() {

        System.out.println("\n========== ORDER QUEUE ==========");

        // ตรวจสอบว่า Queue ว่างหรือไม่
        if (orders.isEmpty()) {
            System.out.println("No orders in queue.");
            return;
        }

        // ใช้ for-each วนดูข้อมูลใน Queue โดยไม่ลบข้อมูล
        for (Order order : orders) {

            System.out.println("Order ID: "
                    + order.getOrderID()
                    + " | Total: "
                    + order.getTotal() + " Baht");
        }
    }

    // เมธอดประมวลผลคำสั่งซื้อทั้งหมดตามลำดับ
    public void processOrders() {

        System.out.println("\n========== PROCESS ORDERS ==========");

        // ตรวจสอบว่าไม่มีคำสั่งซื้อหรือไม่
        if (orders.isEmpty()) {
            System.out.println("No orders to process.");
            return;
        }

        // วนลูปจนกว่า Queue จะไม่มีคำสั่งซื้อเหลือ
        while (!orders.isEmpty()) {

            // poll() นำ Order ที่อยู่หน้าสุดออกจาก Queue
            Order order = orders.poll();

            System.out.println("\nProcessing Order ID: "
                    + order.getOrderID());

            // เรียกแสดงใบเสร็จของ Order ที่นำออกมา
            order.showReceipt();
        }

        System.out.println("\nAll orders completed!");
    }
}