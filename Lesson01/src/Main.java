import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float x;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        x = sc.nextInt();
        System.out.println("Digitado: " + x);
        sc.close();
    }
}