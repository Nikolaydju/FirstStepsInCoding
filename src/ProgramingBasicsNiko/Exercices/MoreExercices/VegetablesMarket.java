package Exercices.MoreExercices;

import java.util.Scanner;

public class VegetablesMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Vhod
        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        double vegetablePrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        double vegetableKg = Double.parseDouble(scanner.nextLine());
        double fruitsKg = Double.parseDouble(scanner.nextLine());

        //Presmqtaniq

        double vegetablesCost = vegetablePrice * vegetableKg;
        double fruitsCost = fruitsPrice * fruitsKg;
        double totalCost = vegetablesCost + fruitsCost;
        double result = totalCost / 1.94;


        System.out.printf("%.2f",result);


















    }
}
