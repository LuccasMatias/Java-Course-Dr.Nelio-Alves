import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int input;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        input = scan.nextInt();
        scan.close();

        if (input >= 0 ){
            System.out.println("The number "+ input + " is positive: ");
        }   else{
            System.out.println("The number " + input + " in negative" );
        }
    }
}