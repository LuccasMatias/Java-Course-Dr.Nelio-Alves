import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int password;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the password: ");

        password = scan.nextInt();

        do {
            System.out.println("Incorrect password \n");
            password = scan.nextInt();
        } while (password != 2002);
        System.out.println("Correct password");
        scan.close();
    }
}