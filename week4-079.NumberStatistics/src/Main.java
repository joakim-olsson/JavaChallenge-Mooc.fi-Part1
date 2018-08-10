
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics sumbert = new NumberStatistics();
        NumberStatistics evenbert = new NumberStatistics();
        NumberStatistics oddbert = new NumberStatistics();

        int input = 0;

        System.out.println("Type numbers: ");

        while (input != -1) {
            input = Integer.parseInt(reader.nextLine());

            if (input != -1) {
                sumbert.addNumber(input);
                if (input % 2 == 0) {
                    evenbert.addNumber(input);
                } else {
                    oddbert.addNumber(input);
                }
            }
        }
        System.out.println("sum: " + sumbert.sum());
        System.out.println("sum of even: " + evenbert.sum());
        System.out.println("sum of odd: " + oddbert.sum());
    }
}
