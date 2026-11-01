import java.util.Scanner;

public class Payment {

    public boolean pay(Scanner sc, int total) {

        System.out.println("\n========== PAYMENT ==========");
        System.out.println("Total: " + total + " Baht");

        System.out.println("[1] Cash");
        System.out.println("[2] QR Payment");
        System.out.print("Select payment method: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                int money;

                do {
                    System.out.print("Insert money: ");
                    money = sc.nextInt();

                    if (money < total) {
                        System.out.println("Not enough money!");
                    }

                } while (money < total);

                int change = money - total;

                System.out.println("Payment successful!");
                System.out.println("Change: " + change + " Baht");

                return true;

            case 2:
                System.out.println("\nQR Payment");
                System.out.println("Scan the QR code to pay.");
                System.out.println("Payment successful!");

                return true;

            default:
                System.out.println("Invalid payment method!");
                return false;
        }
    }
}