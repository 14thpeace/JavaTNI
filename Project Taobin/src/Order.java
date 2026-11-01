import java.util.ArrayList;

public class Order {

    // ตัวแปร static ใช้กำหนดหมายเลข Order
    // ทุกครั้งที่สร้าง Order ใหม่ หมายเลขจะเพิ่มขึ้น 1
    private static int nextOrderID = 1001;

    // เก็บหมายเลขคำสั่งซื้อ
    private int orderID;

    // เก็บยอดรวมของคำสั่งซื้อ
    private int total;

    // Array สำหรับเก็บชื่อเมนูของ Order
    private String[] menu;

    // Array สำหรับเก็บราคาของ Order
    private int[] price;

    // ArrayList สำหรับเก็บรายการสินค้าที่ลูกค้าสั่ง
    private ArrayList<Integer> items;

    // Constructor ทำงานเมื่อมีการสร้าง Object Order
    public Order(MenuSelection data) {

        // กำหนดหมายเลข Order และเพิ่มหมายเลขสำหรับครั้งต่อไป
        orderID = nextOrderID++;

        // ดึง Array ต้นฉบับจาก MenuSelection
        String[] originalMenu = data.getMenu();
        int[] originalPrice = data.getPrice();

        // สร้าง Array ใหม่ให้ Order
        menu = new String[originalMenu.length];
        price = new int[originalPrice.length];

        // คัดลอกชื่อเมนูและราคาทีละตำแหน่ง
        for (int i = 0; i < originalMenu.length; i++) {
            menu[i] = originalMenu[i];
            price[i] = originalPrice[i];
        }

        // คัดลอกรายการสินค้าในตะกร้ามาเก็บใน Order
        // เพื่อให้ข้อมูล Order ไม่เปลี่ยนเมื่อมีการล้างตะกร้า
        items = new ArrayList<>(data.getCart());

        // เริ่มต้นยอดรวมเป็น 0
        total = 0;

        // วนลูปนำราคาสินค้าแต่ละรายการมารวมกัน
        for (int i = 0; i < items.size(); i++) {

            // ดึงหมายเลขเมนูจากรายการสินค้า
            int item = items.get(i);

            // นำราคาสินค้ามาบวกกับยอดรวม
            total += price[item];
        }
    }

    // ส่งหมายเลข Order กลับไปให้คลาสอื่น
    public int getOrderID() {
        return orderID;
    }

    // ส่งยอดรวมกลับไปให้คลาสอื่น
    public int getTotal() {
        return total;
    }

    // เมธอดแสดงใบเสร็จ
    public void showReceipt() {

        System.out.println("\n========== TAO BIN RECEIPT ==========");
        System.out.println("Order ID: " + orderID);
        System.out.println("-------------------------------------");

        // วนลูปตรวจสอบเมนูแต่ละรายการ
        for (int i = 0; i < menu.length; i++) {

            int quantity = 0;

            // นับจำนวนสินค้าชนิดเดียวกันใน Order
            for (int item : items) {
                if (item == i) {
                    quantity++;
                }
            }

            // แสดงสินค้าที่มีการสั่งซื้อ
            if (quantity > 0) {

                System.out.println(menu[i]
                        + " x " + quantity
                        + " = " + (price[i] * quantity)
                        + " Baht");
            }
        }

        // แสดงยอดรวมและสถานะการชำระเงิน
        System.out.println("-------------------------------------");
        System.out.println("Total: " + total + " Baht");
        System.out.println("Payment Status: SUCCESS");
        System.out.println("Thank you!");
        System.out.println("=====================================");
    }
}