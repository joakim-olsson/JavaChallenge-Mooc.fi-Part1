/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInlastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInlastPrint = 0;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.starsInlastPrint = 0;
    }

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInlastPrint = 0;
    }

    public void printLine() {
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInlastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public void print() {
        this.starsInlastPrint = 0;
        
        for (int i = 0; i < this.height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return this.starsInlastPrint;
    }
}
