import org.junit.platform.console.options.PicocliCommandLineOptionsParser;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zack", 28);
        Person person2 = new Person(person);
        System.out.println(person2.equals(person));
        
    } 
}
