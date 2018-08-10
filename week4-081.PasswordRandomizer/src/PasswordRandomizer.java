import java.util.Random;

public class PasswordRandomizer {
    private Random password = new Random();
    private int length;
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length = length;
        // Initialize the variable
    }

    public String createPassword() {
        // write code that returns a randomized password
        String helper = "";
        
        for (int i = 0; i < this.length; i++) {
        char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.password.nextInt(26));
        helper += symbol;
        }
        return helper;
    }
}
