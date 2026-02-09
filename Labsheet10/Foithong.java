public class Foithong extends Bakery {
    private int strandCount;
    public Foithong(int strandCount, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.strandCount = strandCount;
    }

        public boolean sugarRushLevelDanger() {
            return strandCount > 10;
        }

        public int getStickyHandFee() {
            if (strandCount > 200) {
                return super.getPackingCost() + 10;
            }
            return super.getPackingCost();
        }

        public double calculatedTotalPrice() {
            return (getUnitPrice() * strandCount) + getStickyHandFee();
        }

        public String toString() {
            return super.toString()
                    + "\nFlavor: " + getFlavour()
                    + "\nStrands: " + strandCount
                    + (sugarRushLevelDanger() ? "\nSugar Rush Level: DANGER!! You need Insulin!!"
                    : "\nSugar Rush Level: Safe~~ You need more sugar~~")
                    + "\nTotal price of Foitong = " + calculatedTotalPrice();
        }
    }