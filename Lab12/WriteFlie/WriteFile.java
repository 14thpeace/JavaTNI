package WriteFlie;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    public static String input_user(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.print("Enter gender : ");
        String gender = scanner.next();
        System.out.print("Enter birthYear : ");
        String birthYear = scanner.next();

        return username + "," + password + "," + gender + "," + birthYear;
    }

    public static void main(String[] args) throws IOException {
       String data = input_user();

        FileWriter filename = new FileWriter("src/WriteFile/users2.txt",true);
        PrintWriter writer = new PrintWriter(filename);

        writer.print(data);

        writer.close();
    }
}
