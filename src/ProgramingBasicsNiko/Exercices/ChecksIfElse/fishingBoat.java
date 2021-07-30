package Exercices.Checks;

import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Бюджет на групата – цяло число в интервала [1…8000]
        //•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
        //•	Брой рибари – цяло число в интервала [4…18]


        int budget = Integer.parseInt(scanner.nextLine());
        String seson = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double boatMoney = 0;

        if (seson.equals("Spring")){
            boatMoney = 3000;

        }else if (seson.equals("Summer") || seson.equals("Autumn")){
            boatMoney = 4200;

        }else if (seson.equals("Winter")){
            boatMoney = 2600;

        }
        if (fisherman <= 6){
            boatMoney = boatMoney - (boatMoney * 0.10);

        }else if (fisherman <= 11){
            boatMoney = boatMoney - (boatMoney * 0.15);

        }else if (fisherman > 12){
            boatMoney = boatMoney - (boatMoney * 0.25);
        }
        if (fisherman % 2 == 0){
            if (seson.equals("Spring")||seson.equals("Summer")||seson.equals("Winter")){
                boatMoney = boatMoney - (boatMoney * 0.05);
            }
        }
        if (budget >= boatMoney){
            System.out.printf("Yes! You have %.2f leva left.",budget - boatMoney);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",boatMoney - budget);
        }











    }
}
