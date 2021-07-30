package Exercices.ExercicesChecks;

import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	Ако числото е до 100 включително, бонус точките са 5.
//•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
//•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
        double number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;


        if (number <= 100) {
            bonus = 5;

        } else if (number > 1000) {
            bonus = number * 0.10;
        }else {
            bonus = number * 0.20;
        }


        if (number % 2 == 0) {
            bonus = bonus + 1;
        } else if (number % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}


