package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ///•	Торта - 45 лв.
        //        //•	Гофрета - 5.80 лв.
        //        //•	Палачинка - 3.20 лв.
        //        //1. Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
        //        //2. Броят на сладкарите – цяло число в интервала [0 … 1000]
        //        //3. Броят на тортите – цяло число в интервала [0… 2000]
        //        //4. Броят на гофретите – цяло число в интервала [0 … 2000]
        //        //5. Броят на палачинките – цяло число в интервала [0 … 2000]
        //       // Изчисляваме сумата, която се изкарва на ден за всеки един от продуктите,//направени от 1 сладкар:
        //        //Торти: 14 * 45 = 630 лв.;
        //Гофрети: 30 * 5.80 = 174 лв.;
        //Палачинки: 16 * 3.20 = 51.20 лв.

        int daysTheCharityChampaignGoes = Integer.parseInt(scanner.nextLine());
        int pastryChefs = Integer.parseInt(scanner.nextLine());
        int cake = Integer.parseInt(scanner.nextLine());
        int waffle = Integer.parseInt(scanner.nextLine());
        int pancake = Integer.parseInt(scanner.nextLine());
        int cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;

        int pricePerDayFromCake = cake * cakePrice;
        double pricePerDayFromwaffle = waffle * wafflePrice;
        double pricePerDayFromPancake = pancake * pancakePrice;
        double pricePerDayFromAll = (pricePerDayFromCake + pricePerDayFromwaffle + pricePerDayFromPancake) * pastryChefs;
        double amountCollectedFromTheEntireCampaign = pricePerDayFromAll * daysTheCharityChampaignGoes;
        double amountAfterExpensesAreCovered = amountCollectedFromTheEntireCampaign - (amountCollectedFromTheEntireCampaign/8);
        System.out.printf("%.2f", amountAfterExpensesAreCovered);


    }
}
