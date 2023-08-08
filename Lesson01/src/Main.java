import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int axisX, axisY, cont = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter the X axis: ");
            axisX = scan.nextInt();
            System.out.println("\nEnter the y axis: ");
            axisY = scan.nextInt();

            if (cont == 0 && (axisX != 0 && axisY != 0)){
                System.out.println("First: [" + axisX + "][" + axisY + "]");
                cont++;
            }
            else if (cont == 1 && (axisX != 0 && axisY != 0)){
                System.out.println("Second: [" + axisX + "][" + axisY + "]");
                cont++;
            }
            else if (cont == 2 && (axisX != 0 && axisY != 0)){
                System.out.println("Third: [" + axisX + "][" + axisY + "]");
                cont++;
            }
            else if (cont == 3 && (axisX != 0 && axisY != 0)){
                System.out.println("Fourth: [" + axisX + "][" + axisY + "]");
                cont++;
            }
        } while ((axisX != 0 && axisY != 0) || cont == 4);

    }
}