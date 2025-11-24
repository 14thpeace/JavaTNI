import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {

        final  int buffet_price_per_person = 299;
        DecimalFormat frm = new DecimalFormat("#,###.00");

        int customer_num = Integer.parseInt
                (JOptionPane.showInputDialog("How many customer?"));
        double price_no_net = customer_num * buffet_price_per_person;
        double price_net = price_no_net + (price_no_net * 7 /100);



        int coupon_discount = Integer.parseInt
                (JOptionPane.showInputDialog("Price with NET is "+ frm.format(price_net) + " baht."+
                        "\nHow much of discount (%) on your coupon?"));
        double total_price =  price_net - (price_net * coupon_discount / 100);

        double customer_paid = Double.parseDouble
                (JOptionPane.showInputDialog("Total price is "+ frm.format(total_price) + " baht."+
                        "\nEnter the amount the customer paid:"));
        double change = customer_paid - total_price;

        JOptionPane.showMessageDialog(null,
                "Total price is " + frm.format(total_price) + " baht."+
                        "\nCustomer paid " + frm.format(customer_paid) +" baht."+
                        "\nGet change " + frm.format(change) + " baht.");
    }
}
