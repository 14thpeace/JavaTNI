import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile {

    public static String hide_password(String password){
        String hide_password = "" ;
        for (int i = 0; i < password.length(); i++){
            if (i == 0){
                hide_password += password.charAt(i);
            }else if ( i== password.length()-1){
                hide_password += password.charAt(i);

            }else {
                hide_password += "*";
            }
        }
        return hide_password;
    }


    public static void main(String[] args) throws IOException {
        File filename = new File("src/users.txt");
        Scanner scanner = new Scanner(filename);

        while (scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            //0 = name
            //1 = password
            //2 = gender
            //3 = birthYear
            String username = data[0];
            String password = data[1];
            String gender = data[2];
            int birthYear = Integer.parseInt(data[3]);
            System.out.println(data);
            System.out.println("username " + username);
            System.out.println("password " + hide_password(password));
            System.out.println("gender " + gender);
            System.out.println("birthYear " + birthYear);
            System.out.println();
        }
        scanner.close();
    }
}
