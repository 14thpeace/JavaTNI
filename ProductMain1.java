import javax.swing.*;

public class ProductMain1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to Product Stock System");
        Product P1 = new Product();

        P1.name = JOptionPane.showInputDialog(null,"Enter product name:");
        P1.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        P1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));

        P1.showInfo();
        System.out.println();
        int add_stock = JOptionPane.showConfirmDialog(null
                ,"Do you want to add more item?"
                ,"Select an Option"
                ,JOptionPane.YES_NO_CANCEL_OPTION);
        if (add_stock == JOptionPane.YES_OPTION) {
            P1.addStock(Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?")));
        }
        System.out.println();
        int change_price = JOptionPane.showConfirmDialog(null
                ,"Do you want to change price?"
                ,"Select an Option"
                ,JOptionPane.YES_NO_CANCEL_OPTION);
        if (change_price == JOptionPane.YES_OPTION) {
            P1.changePrice(Integer.parseInt(JOptionPane.showInputDialog("How much is the new price per item?")));
        }
        System.out.println();
        System.out.println();
        P1.showInfo();
    }
}

