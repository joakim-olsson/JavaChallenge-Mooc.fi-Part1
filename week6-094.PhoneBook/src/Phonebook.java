/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> phonebook = new ArrayList<Person>();

    public void add(String name, String number) {
        Person doodlet = new Person(name, number);
        this.phonebook.add(doodlet);
    }

    public void printAll() {
        for (Person dood : this.phonebook) {
            System.out.println(dood);
        }
    }

    public String searchNumber(String name) {
        for (Person p : this.phonebook) {
            if (p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        return "number not known";}
}
