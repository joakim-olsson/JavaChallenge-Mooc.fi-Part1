
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        amountOfNumbers++;
        sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }

    public int sum() {
        if (amountOfNumbers > 0) {
            return sum;
        } else {
            return 0;
        }
    }

    public double average() {
        double sum = 0.0;
        if (this.amountOfNumbers > 0) {
            sum = (double) this.sum / (double) this.amountOfNumbers;
            return sum;
        } else {
            return 0;
        }

    }
}
