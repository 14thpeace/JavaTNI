import java.util.ArrayList;
import java.util.Scanner;

public class MenuSelection {

    private String[] menu = {
            "Thai Tea",
            "Cocoa",
            "Green Tea",
            "Milk Tea",
            "Americano"
    };

    private int[] price = {
            40, 45, 35, 40, 50
    };

    private ArrayList<Integer> cart = new ArrayList<>();

    public void showMenu() {
        System.out.println("\n========== DRINK MENU ==========");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". "
                    + menu[i] + " - " + price[i] + " Baht");
        }

        System.out.println("0. Finish Selecting");
    }

    public void selectDrinks(Scanner sc) {
        int choice;

        do {
            showMenu();
            System.out.print("Select drink: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= menu.length) {
                cart.add(choice - 1);
                System.out.println(menu[choice - 1] + " added to cart!");
            } else if (choice != 0) {
                System.out.println("Invalid menu number!");
            }

        } while (choice != 0);
    }

    public String[] getMenu() {
        return menu;
    }

    public int[] getPrice() {
        return price;
    }

    public ArrayList<Integer> getCart() {
        return cart;
    }

    public void clearCart() {
        cart.clear();
    }
}