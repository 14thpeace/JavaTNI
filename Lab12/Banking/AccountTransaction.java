package Banking;

import java.io.*;
import java.util.*;

public class AccountTransaction extends BankAccount implements Transactionable {

    public AccountTransaction(String accId) {
        super(accId);
        loadBalance();
    }

    public boolean hasAccountId() {
        File f = new File(getFilename());
        if (!f.exists()) return false;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (p[0].equals(getAccId())) {
                    setAccBalance(Double.parseDouble(p[1]));
                    return true;
                }
            }
        } catch (Exception e) {}
        return false;
    }

    private void loadBalance() {
        hasAccountId();
    }

    private Map<String, Double> readAll() {
        Map<String, Double> map = new LinkedHashMap<>();
        File f = new File(getFilename());
        if (!f.exists()) return map;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                map.put(p[0], Double.parseDouble(p[1]));
            }
        } catch (Exception e) {}
        return map;
    }

    private void saveAll(Map<String, Double> map) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFilename()))) {
            for (String id : map.keySet()) {
                bw.write(id + "," + map.get(id));
                bw.newLine();
            }
        } catch (Exception e) {}
    }

    @Override
    public void deposit(double amount) {
        setAccBalance(checkBalance() + amount);
        Map<String, Double> m = readAll();
        m.put(getAccId(), checkBalance());
        saveAll(m);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= checkBalance()) {
            setAccBalance(checkBalance() - amount);
            Map<String, Double> m = readAll();
            m.put(getAccId(), checkBalance());
            saveAll(m);
        }
    }

    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}