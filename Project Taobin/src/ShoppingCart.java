import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    // แสดงรายการสินค้าในตะกร้าและคำนวณราคารวม
    public int showCart(MenuSelection data) {

        // รับข้อมูลเมนู ราคา และรายการสินค้าใน Cart
        String[] menu = data.getMenu();
        int[] price = data.getPrice();
        ArrayList<Integer> cart = data.getCart();

        // ตัวแปรเก็บราคารวมทั้งหมด
        int total = 0;

        System.out.println("\n========== SHOPPING CART ==========");

        // วนตรวจสอบเมนูเครื่องดื่มทีละรายการ
        // n คือจำนวนประเภทเครื่องดื่ม
        for (int i = 0; i < menu.length; i++) {

            // ตัวแปรนับจำนวนแก้วของเมนูปัจจุบัน
            int quantity = 0;

            // วนตรวจสอบสินค้าใน Cart ทีละตำแหน่ง
            // m คือจำนวนแก้วทั้งหมดใน Cart
            // ส่วนนี้เป็นการค้นหาแบบ Linear Search
            for (int j = 0; j < cart.size(); j++) {

                // ดึงหมายเลขเมนูจาก Cart
                int item = cart.get(j);

                // ตรวจสอบว่าหมายเลขเมนูตรงกับเมนูปัจจุบันหรือไม่
                if (item == i) {

                    // เพิ่มจำนวนแก้วเมื่อพบเมนูที่ตรงกัน
                    quantity++;

                }
            }

            // แสดงเฉพาะเมนูที่มีจำนวนมากกว่า 0
            if (quantity > 0) {

                // คำนวณราคาย่อยจากจำนวนแก้วคูณราคา
                int subtotal = quantity * price[i];

                // แสดงชื่อเมนู จำนวน และราคาย่อย
                System.out.println(menu[i] + " x " + quantity
                        + " = " + subtotal + " Baht");

                // เพิ่มราคาย่อยเข้าไปในราคารวม
                total += subtotal;

            }
        }

        // แสดงราคารวมทั้งหมด
        System.out.println("----------------------------------");
        System.out.println("Total: " + total + " Baht");

        // ส่งยอดรวมกลับไปยังเมธอดที่เรียกใช้งาน
        return total;
    }

    // จัดการรายการสินค้าในตะกร้า
    public int manageCart(Scanner sc, MenuSelection data) {

        // รับรายการสินค้าใน Cart
        ArrayList<Integer> cart = data.getCart();

        int choice;

        // วนลูปจัดการ Cart จนกว่าจะเลือก Checkout
        do {

            // แสดงรายการสินค้าและราคารวม
            showCart(data);

            // ตรวจสอบว่าตะกร้าว่างหรือไม่
            if (cart.isEmpty()) {

                System.out.println("Your cart is empty.");

                // ส่งค่า 0 กลับไปเมื่อไม่มีสินค้า
                return 0;
            }

            // แสดงตัวเลือกการจัดการ Cart
            System.out.println("\n[1] Remove Drink");
            System.out.println("[2] Add More Drinks");
            System.out.println("[3] Checkout");
            System.out.print("Choose: ");

            // รับตัวเลือกจากผู้ใช้
            choice = sc.nextInt();

            // ตรวจสอบว่าผู้ใช้เลือก Remove Drink หรือไม่
            if (choice == 1) {

                System.out.println("\nItems in Cart:");

                // แสดงรายการสินค้าใน Cart พร้อมลำดับ
                for (int i = 0; i < cart.size(); i++) {

                    // ดึงหมายเลขเมนูจาก Cart
                    int index = cart.get(i);

                    // แสดงลำดับและชื่อเครื่องดื่ม
                    System.out.println((i + 1) + ". "
                            + data.getMenu()[index]);
                }

                // รับตำแหน่งสินค้าที่ต้องการลบ
                System.out.print("Select item to remove: ");
                int remove = sc.nextInt();

                // ตรวจสอบว่าตำแหน่งที่เลือกถูกต้องหรือไม่
                if (remove >= 1 && remove <= cart.size()) {

                    // ลบสินค้าออกจาก Cart ตามตำแหน่งที่เลือก
                    int removed = cart.remove(remove - 1);

                    System.out.println(
                            data.getMenu()[removed] + " removed!"
                    );

                } else {

                    // แจ้งเตือนเมื่อตำแหน่งไม่ถูกต้อง
                    System.out.println("Invalid item!");

                }

            }

            // ตรวจสอบว่าผู้ใช้เลือก Add More Drinks หรือไม่
            else if (choice == 2) {

                // แสดงเมนูเครื่องดื่มทั้งหมด
                data.showMenu();

                // รับหมายเลขเมนูที่ต้องการเพิ่ม
                System.out.print("Select drink to add: ");
                int add = sc.nextInt();

                // ตรวจสอบว่าหมายเลขเมนูถูกต้องหรือไม่
                if (add >= 1 && add <= data.getMenu().length) {

                    // เพิ่มสินค้าเข้า Cart
                    cart.add(add - 1);

                    System.out.println(
                            data.getMenu()[add - 1] + " added!"
                    );

                } else if (add != 0) {

                    // แจ้งเตือนเมื่อเลือกหมายเลขเมนูไม่ถูกต้อง
                    System.out.println("Invalid menu number!");

                }

            }

            // ตรวจสอบว่าผู้ใช้เลือก Checkout หรือไม่
            else if (choice == 3) {

                // ออกจากการจัดการ Cart เพื่อไปชำระเงิน
                System.out.println("Proceeding to payment...");

            }

            // กรณีเลือกหมายเลขไม่ถูกต้อง
            else {

                System.out.println("Invalid choice!");

            }

        } while (choice != 3);

        // แสดง Cart อีกครั้งและส่งยอดรวมกลับไป
        return showCart(data);
    }
}