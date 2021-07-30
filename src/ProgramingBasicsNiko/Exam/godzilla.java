package Exam;

import java.util.Scanner;

public class godzilla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
        //Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());

        double clothesPriceForOneStatist = Double.parseDouble(scanner.nextLine());
        double decor = budget - (budget* 0.90);

        double statistPrice = statist * clothesPriceForOneStatist;

        if (statist > 150){
            statistPrice = statistPrice - (statistPrice * 0.10);
        }
        double totalPrice = decor + statistPrice;
        if (totalPrice > budget){
            System.out.printf("Not enough money!%n" +
                    "Wingard needs %.2f leva more.",totalPrice-budget);
        }else if (totalPrice <= budget){
            System.out.printf("Action!%n" +
                    "Wingard starts filming with %.2f leva left.",budget-totalPrice);
        }













    }
}
