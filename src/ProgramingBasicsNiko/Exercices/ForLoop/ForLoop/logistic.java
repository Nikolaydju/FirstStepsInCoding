package ProgramingBasicsNiko.Exercices.ForLoop.ForLoop;

import java.util.Scanner;

public class logistic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
        //За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]

        int count = Integer.parseInt(scanner.nextLine());
        double totalTons = 0;
        double price = 0;
        double busWeight = 0;
        double trainWeight = 0;
        double truckWeight = 0;

        for (int i = 1; i <= count; i++) {
            double tons = Double.parseDouble(scanner.nextLine());;
            totalTons = totalTons + tons;

            if (tons <= 3) {
                busWeight = busWeight + tons;
                price = price + (tons * 200);

            } else if (tons >= 4 && tons <= 11) {
                price = price + tons * 175;
                truckWeight = truckWeight + tons;

            } else if (tons > 12) {
                price = price + (tons * 120);
                trainWeight = trainWeight + tons;

            }

        }
        double average = price / totalTons;
        double percentBus = busWeight / totalTons * 100;
        double percentTruck = truckWeight / totalTons * 100;
        double percentTrain = trainWeight / totalTons * 100;

        System.out.printf("%.2f%n",average);
        System.out.printf("%.2f%%%n",percentBus);
        System.out.printf("%.2f%%%n",percentTruck);
        System.out.printf("%.2f%%",percentTrain);

    }
}
