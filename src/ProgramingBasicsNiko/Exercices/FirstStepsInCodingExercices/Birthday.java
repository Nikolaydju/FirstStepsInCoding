package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prochitane na vohd

           // Наем за залата – цяло число в интервала [100..10000]
        int hallRent = Integer.parseInt(scanner.nextLine());
        // Presmqtaniq
        //Торта – цената ѝ е 20% от наема на залата
        double cakePrice = hallRent * 0.20; //  Напитки – цената им е 45% по-малко от тази на тортата



        double drinksprice = cakePrice - cakePrice * 0.45;
        // Аниматор – цената му е 1/3 от цената за наема на залата

        double entertainmentPrice = hallRent * 1.0 / 3;

        double result = hallRent + cakePrice + drinksprice + entertainmentPrice;
        System.out.println(result);




    }
}
