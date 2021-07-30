package Exam;

import java.util.Scanner;

public class EasterDayBakery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsBoxs = Integer.parseInt(scanner.nextLine());
        int Hefe = Integer.parseInt(scanner.nextLine());

        //presmqtaniq

        //•	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
        //•	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
        //•	цената на един пакет мая е с 80% по-ниска от цената на килограм захар


        double sugarPricePerKg = flourPrice - (flourPrice * 0.25);
        double eggsBoxPrice = flourPrice + (flourPrice * 0.10);
        double hefePrice = sugarPricePerKg - (sugarPricePerKg * 0.80);
        double flourTotal = flourKg * flourPrice;
        double sugarTotal = sugarKg * sugarPricePerKg;
        double eggsTotal = eggsBoxs * eggsBoxPrice;
        double hefeTotal = Hefe * hefePrice;
        double totalSum = flourTotal + sugarTotal + eggsTotal + hefeTotal;
        System.out.printf("%.2f", totalSum);


    }
}
