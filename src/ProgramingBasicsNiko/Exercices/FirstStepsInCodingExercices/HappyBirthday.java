package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vhod
        //•	Наем за залата – цяло число в интервала [100..10000]
        //•	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата

        double rentHall = Double.parseDouble(scanner.nextLine());


        double cakePrice = rentHall * 0.2;
        double dirnksPrice = cakePrice - cakePrice * 0.45;
        double animator = rentHall * 1/3;
        double totalPrice = cakePrice + dirnksPrice + animator + rentHall;

        System.out.println(totalPrice);





    }
}
