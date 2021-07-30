package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class ShoppingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Vhod
        //1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        //2.	Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
        //3.	Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        //4.	Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
        //5.	Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]
        //•	цената на малините е с 50% по-ниска от тази на ягодите;
        //•	цената на портокалите е с 40% по-ниска от цената на малините;
        //•	цената на бананите е с 80% по-ниска от цената на малините.

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberrys = Double.parseDouble(scanner.nextLine());
        double strawberrys = Double.parseDouble(scanner.nextLine());

        double raspberrysPrice = strawberryPrice / 2;
        double orangesPrice = raspberrysPrice - (raspberrysPrice * 0.4);
        double bananasPrice = raspberrysPrice - (raspberrysPrice * 0.8);
        double sumStrawberry = strawberrys * strawberryPrice;
        double sumRaspberyy = raspberrys * raspberrysPrice;
        double sumOranges = orangesKg * orangesPrice;
        double sumBananas = bananasKg * bananasPrice;
        double totalSum = sumStrawberry + sumRaspberyy + sumOranges + sumBananas;

        System.out.printf("%.2f",totalSum);


    }
}
