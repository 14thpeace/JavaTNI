package CoffeeShop;

public class Espresso extends Drink{
    private int shot;

    public Espresso(String size) {
        super("Espresso", 35, size);
        this.shot = 0;
    }

    public void addShot(int shot) {
        this.shot += shot;
    }

    public int getShot() {
        return shot;
    }


    public double calculateFinalPrice() {
        return getBasePrice() + (shot * 15) + getSizeExtra();
    }


    public String toString() {
        String result = super.toString();
        if (shot > 0) {
            result += "\nAdded " + shot + " shot";
        }
        result += "\nTotal price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}

