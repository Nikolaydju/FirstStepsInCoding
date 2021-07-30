package examNow;

import java.util.Scanner;

public class beerAndChips {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//•	На първия ред - името на футболният фен – текст
//•	На втория ред - предвиденият бюджет  – реално число в диапазона [1.0… 100 000.0]
//•	На третия ред - брой бутилки бира – цяло число в диапазона [1… 100 000]
//•	На четвърти ред - брой пакети чипс – цяло число в диапазона [1… 100 000]

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());


        double beerPrice = beers * 1.20;
        double chipsPrice = beerPrice * 0.45;
        double totalChipsPrice = Math.ceil(chips * chipsPrice);
        double totalSum = beerPrice + totalChipsPrice;

        if (budget >= totalSum) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - totalSum);

        } else {
            System.out.printf("%s needs %.2f more leva!", name, totalSum - budget);
        }
    }
}
