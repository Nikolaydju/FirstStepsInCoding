package ProgramingBasicsNiko.Exercices.Others;

import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countChicken = Integer.parseInt(scanner.nextLine());
        int countFish = Integer.parseInt(scanner.nextLine());
        int countVegetarianFood = Integer.parseInt(scanner.nextLine());
        //Пилешко меню –  10.35 лв.
        //Меню с риба – 12.40 лв.
        //Вегетарианско меню  – 8.15 лв.

        double chickenPrice = countChicken * 10.35;
        double fishPrice = countFish * 12.40;
        double vegetarianPrice = countVegetarianFood * 8.15;

        double allPrice = chickenPrice + fishPrice + vegetarianPrice;
        double desertPrice = allPrice * 0.20;
        double totalPrice = allPrice + desertPrice + 2.50;

        System.out.printf("Total: %.2f",totalPrice);
    }
}
