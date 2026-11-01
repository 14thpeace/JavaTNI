import java.util.Scanner;

public class Payment {

    // รับชำระเงินและตรวจสอบวิธีการชำระเงิน
    public boolean pay(Scanner sc, int total) {

        int choice;

        // แสดงยอดเงินที่ต้องชำระ
        System.out.println("\n========== PAYMENT ==========");
        System.out.println("Total: " + total + " Baht");

        // วนลูปจนกว่าจะเลือกวิธีชำระเงินถูกต้อง
        while (true) {

            // แสดงตัวเลือกวิธีชำระเงิน
            System.out.println("\n[1] Cash");
            System.out.println("[2] QR Payment");
            System.out.print("Select payment method: ");

            // รับตัวเลือกจากผู้ใช้
            choice = sc.nextInt();

            // กรณีเลือกชำระเงินสด
            if (choice == 1) {

                int money;

                // วนลูปจนกว่าจะใส่เงินเพียงพอ
                do {
                    System.out.print("Insert money: ");
                    money = sc.nextInt();

                    // ตรวจสอบจำนวนเงิน
                    if (money < total) {
                        System.out.println("Not enough money!");
                    }

                } while (money < total);

                // คำนวณเงินทอน
                int change = money - total;

                System.out.println("Payment successful!");
                System.out.println("Change: " + change + " Baht");

                return true;

            }

            // กรณีเลือกชำระเงินผ่าน QR Code
            else if (choice == 2) {

                System.out.println("\nQR Payment");
                System.out.println("Scan the QR code to pay.");

                // จำลองการชำระเงินสำเร็จ
                System.out.println("Payment successful!");

                return true;

            }

            // กรณีเลือกหมายเลขไม่ถูกต้อง
            else {

                System.out.println("Invalid payment method!");
                System.out.println("Please select again.");

                // กลับไปแสดงตัวเลือกใหม่ใน while
            }
        }
    }
}