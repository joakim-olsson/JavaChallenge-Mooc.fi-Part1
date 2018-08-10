import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int mySum = 0;
        int i = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
                
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        while (true) {
            if (number == -1) {
                break;
            }
            System.out.println(number);
            mySum += number;
            i++;
            average += number;
            if (number % 2 == 0) {
                    even++;
                    }
            else {
                odd++;
            }
            number = Integer.parseInt(reader.nextLine());
            
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + mySum);
        System.out.println("How many numbers: " + i);
        System.out.println("Average: " + (average/i));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        }

    }
