import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int employee, workedHours;
        double hourValue;

        System.out.println("Enter the employee ID: ");
        employee = scan.nextInt();
        System.out.println("\nEnter the worked hours: ");
        workedHours = scan.nextInt();
        System.out.println("\nEnter the hour value");
        hourValue = scan.nextDouble();

        hourValue = hourValue * workedHours;
        System.out.println("\nThe " + employee + " salary is: ");
        System.out.printf("U$: %.2f\n", hourValue);
        scan.close();
    }
}