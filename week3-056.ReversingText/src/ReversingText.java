
import java.util.Scanner;
import java.util.ArrayList;

public class ReversingText {

    public static String reverse(String subfuck) {
        
        String help = "";
        int i = subfuck.length() - 1;
        
        while (i >= 0) {
            help += subfuck.charAt(i);
            i--;
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return help;
    }

public static void main(String[] args)
{
    ArrayList<String> teachers = new ArrayList<String>();

    teachers.add("Anthony");
    teachers.add("Paul");
    teachers.add("John");
    teachers.add("Martin");
    teachers.add("Matt");

    int place = 0;
    while ( place < teachers.size() ) {  // remember why place <= teachers.size() doesn't work?
        System.out.println( teachers.get(place) );
            place++;
    }
}
}
