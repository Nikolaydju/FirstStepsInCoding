package Exercices.MoreExercices;

import java.util.Scanner;

public class KingKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vohd
        // Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
        //Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        //•	Декорът за филма е на стойност 10% от бюджета.
        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.

        double decor = budget * 0.10;
        double clothesSum = statist * clothesPrice;
        if (statist > 150) {
            clothesSum = clothesSum * 0.90;
        }
        double expenses = decor + clothesSum;
        if (expenses > budget) {
            System.out.printf("Not enough money!%n" +
                    "Wingard needs %.2f leva more.", expenses - budget);

        } else {
            System.out.printf("Action!%n" +
                    "Wingard starts filming with %.2f leva left.",budget - expenses);
        }

    }
}
