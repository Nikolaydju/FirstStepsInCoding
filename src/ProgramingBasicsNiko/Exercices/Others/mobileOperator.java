package ProgramingBasicsNiko.Exercices.Others;

import java.util.Scanner;

public class mobileOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String contract = scanner.nextLine();
        String kindContract = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double tax = 0;


        if (contract.equals("one")) {
            if (kindContract.equals("Small")) {
                tax = 9.98;
            } else if (kindContract.equals("Middle")) {
                tax = 18.99;
            } else if (kindContract.equals("Large")) {
                tax = 25.98;
            } else if (kindContract.equals("ExtraLarge")) {
                tax = 35.99;
            }
        } else if (contract.equals("two")) {
            if (kindContract.equals("Small")) {
                tax = 8.58;
            } else if (kindContract.equals("Middle")) {
                tax = 17.09;
            } else if (kindContract.equals("Large")) {
                tax = 23.59;
            } else if (kindContract.equals("ExtraLarge")) {
                tax = 31.79;
            }
        }
        if (mobileInternet.equals("yes")) {
            if (tax <= 10) {
                tax = tax + 5.50;

            } else if (tax <= 30) {
                tax = tax + 4.35;
            } else {
                tax = tax + 3.85;
            }
        } else if (mobileInternet.equals("no")) {
            tax = tax;
        }
        double totalPrice = tax * months;

        if (contract.equals("two")) {
            totalPrice = totalPrice - (totalPrice * 0.0375);
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
