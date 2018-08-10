import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int first = 0;
        int factorial = 1;
        
                
        while (number > first) {
            first++;
            factorial *= first;
            if (number == 0) {
                break;
            }
            
        }
        System.out.println("Factorial is " + factorial);
    }
}
