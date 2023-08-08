import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int start, end, endGame;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the start time: ");
        start = scan.nextInt();
        System.out.printf("Enter the end time: ");
        end = scan.nextInt();
        scan.close();

        if (start > 12) {start -= 12;}
        if (end > 12) {end -= 12;}

        endGame = 24 - (start + end);
        System.out.println("The game lasted " + endGame + " Hours");
    }
}