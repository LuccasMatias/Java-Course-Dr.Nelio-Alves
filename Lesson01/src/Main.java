import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int gasoline = 0, alcohol = 0, diesel = 0, code = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the fuel type: \n");
        System.out.println("1- Gasoline\n");
        System.out.println("2- Alcohol\n");
        System.out.println("3- Diesel\n");
        while (code != 4) {
            code = scan.nextInt();
            switch (code){
                case 1:
                    System.out.println("Gasoline: " + gasoline);
                    System.out.println("Alcohol: " + alcohol);
                    System.out.println("Diesel: " + diesel);
                    alcohol++;
                    break;
                case 2:
                    System.out.println("Gasoline: " + gasoline);
                    System.out.println("Alcohol: " + alcohol);
                    System.out.println("Diesel: " + diesel);
                    alcohol++;
                    break;
                case 3:
                    System.out.println("Gasoline: " + gasoline);
                    System.out.println("Alcohol: " + alcohol);
                    System.out.println("Diesel: " + diesel);
                    diesel++;
                    break;
            }
        }
        System.out.println("Thank You");
        scan.close();
    }
}