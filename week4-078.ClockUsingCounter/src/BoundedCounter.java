/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
        // write code here
    }

    public void next() {
        this.value++;   
        if (this.value > upperLimit) {
            this.value = 0;
        }
        // write code here
    }
    @Override
    public String toString() {
        if (this.value > 9) {
            return "" + this.value;
        }
        else {
        return "0" + this.value;
        }
    }
public int getValue() {
    return this.value;
    // write here code that returns the value
}

    public void setValue(int newValue){
        if (newValue>=0 && newValue<=this.upperLimit){
            this.value = newValue;
        }
    }
}
    

