package ProgramingBasicsNiko.Exercices.whileLoop.whileLoop.more;

import java.util.Scanner;

public class reportSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededSum = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        int transCard = 0;
        int transCash = 0;
        int moneyCash = 0;
        int moneyCard = 0;

        while (!input.equals("End")) {
            counter++;
            int newSum = Integer.parseInt(input);

            if (counter % 2 == 0) {
                if (newSum < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    transCard++;
                    moneyCard = moneyCard + newSum;
                    System.out.println("Product sold!");
                }

            } else {
                if (newSum > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    transCash++;
                    moneyCash = moneyCash + newSum;
                    System.out.println("Product sold!");
                }
            }
            if ((moneyCard + moneyCash) >= neededSum) {
                break;
            }
            input = scanner.nextLine();


        }
        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            double totalCard = moneyCard * 1.0 / transCard;
            double totalCash = moneyCash * 1.0 / transCash;
            System.out.printf("Average CS: %.2f%n", totalCash);
            System.out.printf("Average CC: %.2f", totalCard);
        }

    }
}

