package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class FrutsShopping {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        // Vhod

        //1. Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        //2. Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
        //3. Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        //4. Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
        //5. Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]

        double strawberrysPrice = Double.parseDouble(scanner.nextLine());
        double bananas =  Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        // Presmqtania

        double raspberriesPrice = strawberrysPrice / 2;
        double orangesPrice = raspberriesPrice - raspberriesPrice * 0.4;
        double bananasPrice = raspberriesPrice - raspberriesPrice * 0.8;

        double result = raspberries * raspberriesPrice + oranges * orangesPrice + bananas * bananasPrice + strawberries *strawberrysPrice;


        System.out.printf("%.2f",result);









    }
}
