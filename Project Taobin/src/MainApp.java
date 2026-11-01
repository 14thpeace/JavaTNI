import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        // สร้าง Scanner สำหรับรับข้อมูลจากผู้ใช้
        Scanner sc = new Scanner(System.in);

        // สร้าง Object สำหรับเรียกใช้งานแต่ละคลาส
        MenuSelection menu = new MenuSelection();
        ShoppingCart cart = new ShoppingCart();
        Payment payment = new Payment();
        OrderQueue orderQueue = new OrderQueue();

        int choice;

        // วนลูปแสดงเมนูหลักจนกว่าผู้ใช้จะเลือก Exit
        do {

            System.out.println("\n========== TAO BIN ==========");
            System.out.println("[1] Start New Order");
            System.out.println("[2] Process Order Queue");
            System.out.println("[3] Show Queue");
            System.out.println("[0] Exit");
            System.out.print("Choose: ");

            // รับตัวเลือกจากผู้ใช้
            choice = sc.nextInt();

            // ตรวจสอบว่าผู้ใช้เลือกเริ่มสั่งเครื่องดื่มใหม่หรือไม่
            if (choice == 1) {

                // ล้างข้อมูล Cart ก่อนเริ่มรายการใหม่
                menu.clearCart();

                // เรียกเมธอดเลือกเครื่องดื่ม
                menu.selectDrinks(sc);

                // ตรวจสอบว่ามีสินค้าใน Cart หรือไม่
                if (menu.getCart().isEmpty()) {

                    System.out.println("No items selected.");

                } else {

                    // เรียกเมธอดจัดการตะกร้าสินค้า
                    int total = cart.manageCart(sc, menu);

                    // ตรวจสอบว่ามียอดชำระเงินหรือไม่
                    if (total > 0) {

                        // เรียกเมธอดชำระเงิน
                        boolean paid = payment.pay(sc, total);

                        // ตรวจสอบว่าชำระเงินสำเร็จหรือไม่
                        if (paid) {

                            // สร้าง Order จากข้อมูลใน Cart
                            Order order = new Order(menu);

                            // เพิ่ม Order เข้า Queue
                            orderQueue.enqueue(order);

                            // ล้าง Cart หลังจากสร้าง Order แล้ว
                            menu.clearCart();

                            System.out.println("\nOrder added to queue!");
                            System.out.println("Order ID: "
                                    + order.getOrderID());
                        }
                    }
                }

            }

            // ตรวจสอบว่าผู้ใช้เลือกประมวลผล Order หรือไม่
            else if (choice == 2) {

                // ประมวลผล Order ตามลำดับ FIFO
                orderQueue.processOrders();

            }

            // ตรวจสอบว่าผู้ใช้เลือกแสดง Queue หรือไม่
            else if (choice == 3) {

                // แสดงรายการ Order ที่อยู่ใน Queue
                orderQueue.showQueue();

            }

            // ตรวจสอบว่าผู้ใช้เลือกออกจากโปรแกรมหรือไม่
            else if (choice == 0) {

                System.out.println("Thank you for using TAO BIN!");

            }

            // กรณีผู้ใช้เลือกหมายเลขไม่ถูกต้อง
            else {

                System.out.println("Invalid choice!");

            }

        } while (choice != 0);

        // ปิด Scanner เมื่อจบการทำงาน
        sc.close();
    }
}