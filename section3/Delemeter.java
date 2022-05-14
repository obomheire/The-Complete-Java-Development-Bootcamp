/*
import java.util.Scanner;

public class Delemeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers on the same line");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter two big integers on the same line");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();
        System.out.println("Enter two decilas on the same line");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();
        System.out.println("Enter two text values on the same line");
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        scan.close();

        System.out.println("\tIntegers: " + num1 + " " + num2);
        System.out.println("\tLongs: " + bigNum1 + " " + bigNum2);
        System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
        System.out.println("\tWords: " + text1 + " " + text2);
    }
}
*/

import java.util.Scanner;

public class Delemeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers on the same line");
        String num = scan.nextLine();
        System.out.println("Enter two big integers on the same line");
        String bigNum = scan.nextLine();
        System.out.println("Enter two decilas on the same line");
        String decimal = scan.nextLine();
        System.out.println("Enter two text values on the same line");
        String text = scan.nextLine();
        scan.close();

        System.out.println("\tIntegers: " + num);
        System.out.println("\tLongs: " + bigNum);
        System.out.println("\tDecimals: " + decimal);
        System.out.println("\tWords: " + text);
    }
}
