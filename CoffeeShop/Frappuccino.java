package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whipped;

    public Frappuccino(String size, boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }

    @Override
    public double calculateFinalPrice() {
        double whippedPrice = whipped ? 15 : 0;
        return getBasePrice() + whippedPrice + getSizeExtra();
    }

    @Override
    public String toString() {
        String result = super.toString();
        if (whipped) {
            result += "\nAdd whipped 15 Baht";
        }
        result += "\nTotal price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}
