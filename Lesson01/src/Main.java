import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int A, B;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        A = scan.nextInt();
        B = scan.nextInt();
        scan.close();

        if (A < B){
            System.out.println("Are multiples");
        }   else{
            System.out.println("Are not multiples" );
        }
    }
}