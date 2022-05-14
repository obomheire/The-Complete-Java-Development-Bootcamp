public class Loops {
    public static void main(String[] args) {

        double choice = 0.01;
        double quess = 0.99;

        while (quess > choice) {
            System.out.println(quess);
            quess = Math.random();
        }
        
        
    }
}
