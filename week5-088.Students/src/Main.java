
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<Student>();
    
    while (true) {
        System.out.println("Name: ");
        String name = reader.nextLine();
        
        if (name.isEmpty()) {
            break;
        }
        
        System.out.println("studentNumber: ");
        String studentNumber = reader.nextLine();
        
        Student buffbert = new Student(name, studentNumber);
        
        list.add(buffbert);
        
    }
    
    for (Student bert : list) {
        System.out.println(bert);
    }
    
        System.out.println("Give search term: ");
        String searched = reader.nextLine();
        
        System.out.println("Result: ");
        for (Student std : list) {
            if (std.getName().contains(searched)) {
                System.out.println(std);
            }
        }
    }
}
