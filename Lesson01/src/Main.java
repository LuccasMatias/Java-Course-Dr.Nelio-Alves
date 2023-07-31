import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char x;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        x = sc.next().charAt(0); //pega o primeiro char da string digitada
        System.out.println("Digitado: " + x);
        sc.close();
    }
}