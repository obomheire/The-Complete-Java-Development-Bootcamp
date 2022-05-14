import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("Please what is your First Name? ");
        String firstName = scan.nextLine();
        //Ask for their last name.
        System.out.println("Please what is your Last Name? ");
        String lastName = scan.nextLine();
        //Ask: how old are you?
        System.out.println("How old are you? ");
        int age = scan.nextInt();
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        System.out.println("Please what is your username? ");
        scan.nextLine();
        String username = scan.nextLine();
       
        //Ask what city they live in.
        System.out.println("What city are you in? ");
        String city = scan.nextLine();
        //Ask what country that's from.
        System.out.println("What country are you from? ");
        String country = scan.nextLine();

        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //
        System.out.println("Your information:! ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("username: " + username);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}
