package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class CharityCharity1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         //1.	Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
        //2.	Броят на сладкарите – цяло число в интервала [0 … 1000]
        //3.	Броят на тортите – цяло число в интервала [0… 2000]
        //4.	Броят на гофретите – цяло число в интервала [0 … 2000]
        //5.	Броят на палачинките – цяло число в интервала [0 … 2000]

        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int panckes = Integer.parseInt(scanner.nextLine());

        int sumPerDayCakes = cakes * 45;
        double sumPerDayWaffles = waffles * 5.80;
        double sumPerDayPanckes = panckes * 3.20;
        double SumPerDay = (sumPerDayCakes + sumPerDayWaffles + sumPerDayPanckes) * cooks;
        double TotalSum = SumPerDay * days;
        double result = TotalSum - (TotalSum/8);
        System.out.printf("%.2f",result);


    }
}
