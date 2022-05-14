import java.util.Scanner;
public class Survey {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! thank you for taking the Survey");
        int counter = 0;
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;
        System.out.println("How much do you spend on Coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;
        System.out.println("How many times a week do you buy Fast Food?");
        int coffeeAmonth = scan.nextInt();
        counter++;

        System.out.println("\nthank you " + name + " for answering all " + counter + " questions");
        //Always close the scanner after use to prevent memory leak
        scan.close();
    }
}
