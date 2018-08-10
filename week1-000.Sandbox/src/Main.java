/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
public class Main {

    public static String[] giveStringTable() {
        String[] tchrs = new String[3];

        tchrs[0] = "Bonus";
        tchrs[1] = "Ihq";
        tchrs[2] = "Lennon";

        return tchrs;
    }

    public static void main(String[] args) {
        String[] teachers = giveStringTable();

        for (String teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
