
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!     
        
        int number = 0;
        while (number != numberDrawn) {
            
            System.out.println("Guess a number: ");
            number = Integer.parseInt(reader.nextLine());
            
            if (number > numberDrawn) {
                System.out.println("The number is lesser");
            }
            else {
                System.out.println("The number is greater");
            
            }
        }
                System.out.println("Congratulations, your guess is correct!");
          
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
