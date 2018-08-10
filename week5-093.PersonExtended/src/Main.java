public class Main {
  public static void main(String[] args) {
      
        Person pekka = new Person("Pekka", 15, 2, 1993);
        Person steve = new Person("Thomas", 1, 3, 1955);
        Person Joakim = new Person("Joakim", 13, 8, 1998);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
        System.out.println( Joakim.getName() + " age " + Joakim.age() + " years");
        
    // write test code here
    // Person pekka = new Person("Pekka", 15, 2, 1993);
  }
}
