/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
public class Counter {
    private int startingvalue;
    private boolean check;
    private int value;
    
    public Counter(int startingValue, boolean check) {
        this.startingvalue = startingValue;
        this.check = check;
        this.value = startingValue;
    }
    
    public Counter(int startingValue) {
        this.startingvalue = startingValue;
        this.check = false;
        this.value = startingValue;
    }
    
    public Counter(boolean check) {
        this.startingvalue = 0;
        this.check = check;
        this.value = 0;
    }
    public Counter() {
        this.startingvalue = 0;
        this.check = false;
        this.value = 0;
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value++;
    }
    
    public void decrease() {
        if (this.check) {
            if (this.value > 0) {
                this.value--;
            }
        }
        else {
            this.value--;
        }
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.value += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
        if (this.check) {
            this.value -= decreaseAmount;
            if (this.value < 0) {
                this.value = 0;
            }
        }
        else {
            this.value -= decreaseAmount;
        }
    }
    }
}
