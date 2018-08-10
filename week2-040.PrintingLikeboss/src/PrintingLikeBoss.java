public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
        System.out.print("*");
        i++;
        }
        System.out.println();
    }
    
    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount){
        System.out.print(" ");
        i++;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        int amount = 1;
        while (amount <= size) {
            printWhitespaces(size - amount);
            printStars(amount);
            amount++;    
        }

        
        // 40.2
    }

    public static void xmasTree(int height) {
        int amount = 1;
        int times = 1;
        while (times <= height) {
            printWhitespaces(height - times);
            printStars(amount);
            times ++;
            amount += 2;           
        }
        int top = 0;
        while (top < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            top ++;
        }

        
        
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(3);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(4);
    }
}
