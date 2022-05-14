import java.util.Scanner;

public class Dealership {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("\nWelcome to java Dealership");
      System.out.println(" . select option 'a' to buy a car");
      System.out.println(" . select option 'b' to sell a car");

      String option = scan.nextLine();
      switch (option) {
          case "a":
              System.out.println("\nWhat is your budjet?");
              int budget = scan.nextInt();
              if (budget >= 10000) {
                  System.out.println("\nGreat! A Nisan Altima is available");
                  System.out.println("\nDo you have insurance? 'yes' or 'no'");
                  scan.nextLine();
                  String insurance = scan.nextLine();
                  System.out.println("\nDo you have licence? 'yes' or 'no'");
                  String licence = scan.nextLine();
                  System.out.println("\nWhat is your credit score? ");
                  int creditScore = scan.nextInt();
                  if (insurance.equals("yes") && licence.equals("yes") && creditScore > 660) {
                      System.out.println("\nSold! pleasure doing business with you");
                  } else {
                      System.out.println("\nSorry you are not eligible");
                  }
              } else {
                  System.out.println("\nSorry we don't sell cars under $10,000");
              }
              break;
          case "b":
              System.out.println("\nWhat is your car valued at? ");
              int value = scan.nextInt();
              System.out.println("\nWhat is your sellign price? ");
              int price = scan.nextInt();
              if (value > price && price < 30000) {
                  System.out.println("\nWe will buy your car, nice doing business with you ");
              } else {
                  System.out.println("\nsorry we are not interested");
              }
              break;
          default:
              System.out.println("\nInvalid option");
      }
     
      scan.close();
  }  
}
