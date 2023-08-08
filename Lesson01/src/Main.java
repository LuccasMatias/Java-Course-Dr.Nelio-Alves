import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        int first_value = sc.nextInt();
        int second_value = sc.nextInt();

        result = first_value + second_value;
        System.out.println("The sum of the values are: " + result);
        sc.close();

    }
}