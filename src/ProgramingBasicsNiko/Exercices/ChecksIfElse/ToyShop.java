package Exercices.Checks;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2.	Брой пъзели - цяло число в интервала [0… 1000]
        //3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5.	Брой миньони - цяло число в интервала [0 … 1000]
        //6.	Брой камиончета - цяло число в интервала [0 … 1000]

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int talkingToy = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.

        double puzzelPrice = 2.60;
        double talkingToyPrice = 3;
        double teddyBearsPrice = 4.10;
        double minionsPrice = 8.20;
        double trucksPrice = 2;

        double toysPrice = (puzzle * puzzelPrice) + (talkingToy * talkingToyPrice) +
                (teddyBears * teddyBearsPrice) + (minions * minionsPrice) + (trucks * trucksPrice);
        int totalToysCount = puzzle+talkingToy+teddyBears+minions+trucks;

        if (totalToysCount >= 50){
            toysPrice = toysPrice - (toysPrice * 0.25);

        }
        toysPrice = toysPrice - (toysPrice * 0.10);

        if (toysPrice >= holidayPrice) {
            double leftMoney = toysPrice - holidayPrice;
            System.out.printf("Yes! %.2f lv left.", leftMoney);
        }else{
            double MoneyNeeded = holidayPrice - toysPrice;
            System.out.printf("Not enough money! %.2f lv needed.",MoneyNeeded);
        }

    }
}
