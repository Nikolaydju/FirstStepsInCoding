package PBMoreExCondStatements;

import java.util.Scanner;

public class Harvest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineYardX = Integer.parseInt(scanner.nextLine());
        double grapesKgY = Double.parseDouble(scanner.nextLine());
        int wineZ = Integer.parseInt(scanner.nextLine());
        int worker = Integer.parseInt(scanner.nextLine());

        double harvestForWine = vineYardX * 0.4;
        double grapesForWine = harvestForWine * grapesKgY;
        double wineLiter = grapesForWine / 2.5;
        double rest = wineLiter - wineZ;
        double wineWorker = Math.ceil(rest / worker);


        if (wineZ > wineLiter) {
            rest = Math.floor(Math.abs(rest));
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", rest);

        } else if (wineZ <= wineLiter) {

            rest = Math.ceil(rest);
            wineLiter = Math.ceil(wineLiter);


            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wineLiter);
            System.out.printf("%.0f liters left -> %.0f liters per person.%n", rest, wineWorker);


        }

    }
}