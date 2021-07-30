package Exam;

import java.util.Scanner;

public class changeBuro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – броят биткойни. Цяло число в интервала [0…20]
        //•	На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
        //•	На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double uana = Double.parseDouble(scanner.nextLine());
        double charge = Double.parseDouble(scanner.nextLine());

        //•	1 биткойн = 1168 лева.88
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.

        int totalBitcoinToLev = bitcoin * 1168;
        double totalUanaDollars = uana * 0.15;
        double dollarsToLev = totalUanaDollars * 1.76;
        double totalLev = totalBitcoinToLev + dollarsToLev;
        double totalEuro = totalLev / 1.95;
        double total = totalEuro - (totalEuro * (charge * 0.01));


        System.out.printf("%.2f",total);;

    }
}
