package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prochitane na vhod
         double depositSum = Double.parseDouble(scanner.nextLine());
         int months = Integer.parseInt(scanner.nextLine());
         double interestRate = Double.parseDouble(scanner.nextLine());
         // Presmqtaniq
        double interestPerMonth = (depositSum * interestRate / 100) / 12;
        double result = depositSum + months * interestPerMonth;
        System.out.println(result);



    }
}
