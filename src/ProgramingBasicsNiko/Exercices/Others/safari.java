package ProgramingBasicsNiko.Exercices.Others;

import java.util.Scanner;

public class safari {
    public static void main(String[] args) {

//Бюджет – реално число в интервала [0.00… 10000.00]
//Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
//Ден от седмицата – текст с възможности "Saturday" и "Sunday"
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double neededFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        double total = 0;

        //Цената на един литър гориво е 2.10 лв.
        //Цената за екскурзовод е 100лв.
        //В зависимост от деня има отстъпки от общата цена - за събота 10%, а за неделя 20%

        double fuelPrice = neededFuel * 2.10;
        double fuelAndGuide = fuelPrice + 100;

        if (day.equals("Saturday")) {
            total = fuelAndGuide * 0.90;

        } else if (day.equals("Sunday")) {
            total = fuelAndGuide * 0.80;
        }
        if (budget >= total) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - total);
        } else if (budget < total) {
            System.out.printf("Not enough money! Money needed: %.2f lv.", total - budget);
        }
    }
}
