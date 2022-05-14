import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three number between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Number cannot be less than 1. shuting the game down");
            System.exit(0);
        }
        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Number cannot be greater than 6. shuting the game down");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumbers);

        if (checkWin(sumDiceRolls, sumOfNumbers)) {
            System.out.println("Congrat you win!");
        } else {
            System.out.println("Sorry you lost!");
        }

        scan.close();
    }

    public static boolean checkWin(int sumDicerolls, int sumOfNumbers) {
        return (sumDicerolls < sumOfNumbers && sumOfNumbers - sumDicerolls < 3);
    }

    public static int rollDice() {

        double randomNumber = Math.random() * 6 + 1;
        return (int) randomNumber;
    }
}

/**
 * {
 * 
 * } else {
 * System.out.println("Sorry you lost!");
 * }
 */
