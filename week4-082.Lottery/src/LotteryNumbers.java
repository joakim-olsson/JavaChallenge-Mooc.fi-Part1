
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random randombert = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        
        int helper;
        
        while (this.numbers.size() < 7) {
            helper = this.randombert.nextInt(39)+1;
            
            if (!this.containsNumber(helper)) {
                this.numbers.add(helper);
            }
        }
    // Write the number drawing here using the method containsNumber()
}

public boolean containsNumber(int number) {
    if (this.numbers.contains(number)) {
        return true;
    }
    else {
        return false;
    }
}
}
