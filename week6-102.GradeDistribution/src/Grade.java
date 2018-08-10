/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */

import java.util.Scanner;

public class Grade {
    
    String zeroGrade = "";
    String oneGrade = "";
    String twoGrade = "";
    String threeGrade = "";
    String fourGrade = "";
    String fiveGrade = "";
    
    int total = 0;
    double accept = 0.0;
    
    public void grades(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes:");
        int i = 0;
        while (i != -1) {
            i = Integer.parseInt(scanner.nextLine());
            
            if (i >= 0 && i <= 29) {
                zeroGrade += "*";
                total++;
            }
            else if (i > 29 && i <= 34) {
                oneGrade += "*";
                total++;
                accept++;
            }
            else if (i > 34 && i <= 39) {
                twoGrade += "*";
                total++;
                accept++;
            }
            else if (i > 39 && i <= 44) {
                threeGrade += "*";
                total++;
                accept++;
            }
            else if (i > 44 && i <= 49) {
                fourGrade += "*";
                total++;
                accept++;
            }             
            else if (i > 49 && i <= 60) {
                fiveGrade += "*";
                total++;
                accept++;
            }
        }
    }
    
    public double failRate() {
        if (total == 0) {
            return 0.0;
        } else {
            return 100*accept/total;
        }
    }
    
    public void printStars() {
        System.out.println("Grade distribution: ");
        System.out.println("5: " + fiveGrade);
        System.out.println("4: " + fourGrade);
        System.out.println("3: " + threeGrade);
        System.out.println("2: " + twoGrade);
        System.out.println("1: " + oneGrade);
        System.out.println("0: " + zeroGrade);
        System.out.println("Acceptance percentage: " + failRate());
}
}
