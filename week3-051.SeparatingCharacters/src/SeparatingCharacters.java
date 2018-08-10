
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int i = 0;
        int number = 0;
        
        while (name.length() - 1 >= i){
            char character = name.charAt(i);
            number++;
            System.out.println(number + ". character: " + character);
            i++;
        }
    }
}
