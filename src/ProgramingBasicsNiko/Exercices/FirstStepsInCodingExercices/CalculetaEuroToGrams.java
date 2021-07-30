package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class CalculetaEuroToGrams {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Vhod

        double money = Double.parseDouble(scanner.nextLine());
        double gramsPrice = Double.parseDouble(scanner.nextLine());

        // Presmqtaniq

        double result = money / gramsPrice;

        System.out.printf("%.2f" , result);






    }
}
