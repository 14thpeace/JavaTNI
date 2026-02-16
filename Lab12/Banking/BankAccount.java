package Banking;

public class BankAccount {
    private String accId;
    private double accBalance;
    private final String filename = "src/Banking/users_account.txt";

    public BankAccount(String accId, double accBalance) {
        this.accId = accId;
        this.accBalance = accBalance;


    }

    public BankAccount(String accId) {
        this.accId = accId;
        this.accBalance = 0;
    }

    public BankAccount() {
        this("", 0);
    }

    public String getAccId() {
        return accId;
    }
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
    public double getAccBalance() {
        return accBalance;
    }
    public String getFilename() {
        return filename;
    }

    @Override
    public String toString() {
        return accId + "," + accBalance;
    }
}
