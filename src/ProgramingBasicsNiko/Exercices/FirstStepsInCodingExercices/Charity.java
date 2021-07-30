package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Vhod
        //1.	Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
        //2.	Броят на сладкарите – цяло число в интервала [0 … 1000]
        //3.	Броят на тортите – цяло число в интервала [0… 2000]
        //4.	Броят на гофретите – цяло число в интервала [0 … 2000]
        //5.	Броят на палачинките – цяло число в интервала [0 … 2000]
        //•	Торта - 45 лв.
        //•	Гофрета - 5.80 лв.
        //•	Палачинка - 3.20 лв.

        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int cakesPrice = 45;
        double wafflesPrice = 5.80;
        double panckaesPrice = 3.20;

        //Presmqtaniq
        int pricePerDayCakes = cakes * cakesPrice;
        double pricePerDayWaffles = waffles * wafflesPrice;
        double pricePerDayPancakes = pancakes * pricePerDayCakes;
        double pricePerDayFromAll = (pricePerDayCakes + pricePerDayPancakes + pricePerDayWaffles) * cooks;
        double sumNetto = pricePerDayCakes * days;
        double totalSum = sumNetto - sumNetto/8;
        System.out.printf("%.2f",totalSum);

    }
}
