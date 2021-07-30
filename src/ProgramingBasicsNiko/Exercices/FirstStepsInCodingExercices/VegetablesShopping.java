package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class VegetablesShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Vhod
        //На конзолата се въвежда цената на ягодите в лв./кг. и количеството на бананите, портокалите, малините и ягодите, които трябва да закупи.
        //•	цената на малините е с 50% по-ниска от тази на ягодите;
        //•	цената на портокалите е с 40% по-ниска от цената на малините;
        //•	цената на бананите е с 80% по-ниска от цената на малините.
        //1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        //2.	Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
        //3.	Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        //4.	Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
        //5.	Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]
        double strawBerryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double  orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberrysKg = Double.parseDouble(scanner.nextLine());

        //Presmqtaniq

        double raspberrysPrice = strawBerryPrice / 2;
        double orangesPrice = raspberrysPrice - raspberrysPrice * 0.4;
        double bananasPrice = raspberrysPrice - raspberrysPrice * 0.8;
        double raspBerrySum = raspberryKg * raspberrysPrice;
        double orangeSum = orangesKg * orangesPrice;
        double bananasSum = bananasKg * bananasPrice;
        double strawberrySum = strawberrysKg * strawBerryPrice;
        double totalSum = raspBerrySum + orangeSum + bananasSum + strawberrySum;
        System.out.printf("%.2f",totalSum);







    }
}
