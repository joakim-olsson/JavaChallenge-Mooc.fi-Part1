
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> listbert = new ArrayList<String>();
        
        while (true) {
            
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        
        if (word.equals("")) {
            break;
        }
        
        listbert.add(word);

        }
        
        Collections.sort(listbert);
        
        System.out.println("You typed the following words: ");
        
            for (String test : listbert) {
                System.out.println(test);
            }
        

            
    }
}