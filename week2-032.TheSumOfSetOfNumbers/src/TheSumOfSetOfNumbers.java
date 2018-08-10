
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

            System.out.println("Until what? ");
            int i = Integer.parseInt(reader.nextLine());
            int mySum = 0;
            int arg = 0;
            while (i > arg) {
                arg++;
                mySum += arg;
            }

            System.out.println("Sum is: " + mySum);
    }
}
