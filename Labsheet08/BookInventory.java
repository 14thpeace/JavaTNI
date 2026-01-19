import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            String title = JOptionPane.showInputDialog("Enter book title:");
            int total = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter the total number:")
            );
            books[i] = new Book(title, total);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(
                    books[i].getTitle() + " has " + books[i].getTotalBook() +
                            " books, can borrow " + books[i].getAvailableBook() + " books."
            );
        }
    }
}
