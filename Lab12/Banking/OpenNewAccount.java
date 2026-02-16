package Banking;

import java.io.*;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    private boolean isExistingAccount(String account_name) {
        File filename = new File(getFilename());
        if (!filename.exists()) return false;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (p[0].equals(account_name)) {
                    return true;
                }
            }
        } catch (Exception e) {}
        return false;
    }

    public String recordAccount() {
        if (isExistingAccount(getAccId())) {
            return "\nThis account has been created!!";
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFilename(), true))) {
            bw.write(toString());
            bw.newLine();
        } catch (Exception e) {}
        return "\nCreated account success!!";
    }
}
