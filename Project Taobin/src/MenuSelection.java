import java.util.ArrayList;
import java.util.Scanner;

public class MenuSelection {

    // Array เก็บชื่อเครื่องดื่ม
    private String[] menu = {
            "Thai Tea",
            "Cocoa",
            "Green Tea",
            "Milk Tea",
            "Americano"
    };

    // Array เก็บราคาของเครื่องดื่ม
    // ตำแหน่งของราคาตรงกับตำแหน่งของชื่อเมนู
    private int[] price = {
            40, 45, 35, 40, 50
    };

    // ArrayList ใช้เก็บ Index ของเครื่องดื่มที่ลูกค้าเลือก
    // สามารถเก็บรายการซ้ำได้ เช่น เลือกชาไทย 2 แก้ว
    private ArrayList<Integer> cart = new ArrayList<>();

    // เมธอดแสดงเมนูและราคาเครื่องดื่ม
    public void showMenu() {

        System.out.println("\n========== DRINK MENU ==========");

        // วนลูปแสดงชื่อและราคาจาก Array
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". "
                    + menu[i] + " - " + price[i] + " Baht");
        }

        System.out.println("0. Finish Selecting");
    }

    // เมธอดให้ลูกค้าเลือกเครื่องดื่มหลายรายการ
    public void selectDrinks(Scanner sc) {

        int choice;

        do {
            // แสดงรายการเครื่องดื่ม
            showMenu();

            System.out.print("Select drink: ");
            choice = sc.nextInt();

            // ตรวจสอบว่าหมายเลขที่เลือกอยู่ในช่วงเมนูหรือไม่
            if (choice >= 1 && choice <= menu.length) {

                // เก็บ Index ของเมนูลงใน ArrayList
                // ลบ 1 เพราะหมายเลขที่แสดงเริ่มจาก 1 แต่ Index เริ่มจาก 0
                cart.add(choice - 1);

                System.out.println(menu[choice - 1]
                        + " added to cart!");

            } else if (choice != 0) {

                // แจ้งเตือนเมื่อเลือกหมายเลขไม่ถูกต้อง
                System.out.println("Invalid menu number!");
            }

            // วนซ้ำจนกว่าลูกค้าจะเลือก 0
        } while (choice != 0);
    }

    // ส่ง Array ชื่อเมนูกลับไปให้คลาสอื่นใช้งาน
    public String[] getMenu() {
        return menu;
    }

    // ส่ง Array ราคากลับไปให้คลาสอื่นใช้งาน
    public int[] getPrice() {
        return price;
    }

    // ส่ง ArrayList ตะกร้าสินค้ากลับไปให้คลาสอื่นใช้งาน
    public ArrayList<Integer> getCart() {
        return cart;
    }

    // ล้างรายการสินค้าในตะกร้า
    public void clearCart() {
        cart.clear();
    }
}