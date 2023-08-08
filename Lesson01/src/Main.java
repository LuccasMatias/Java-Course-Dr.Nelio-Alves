import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double circunference, pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        circunference = pi * Math.pow(radius,2);
        System.out.printf("The circunference is %.4f : ", circunference);
        sc.close();
    }
}