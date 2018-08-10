import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> listbert = new ArrayList<String>();
        
        while (true) {
            
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        
        if (word.equals("")) {
            break;
        }
        
        else {
        listbert.add(word);
        }
            
        }
        
        Collections.reverse(listbert);
        
        System.out.println("You typed the following words: ");
        
        for (String word : listbert) {
            System.out.println(word);
        }
            
        
        
        
        
        
        
        // create here an ArrayList
    }
}
