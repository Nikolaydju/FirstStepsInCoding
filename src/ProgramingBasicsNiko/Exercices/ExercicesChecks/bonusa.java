package Exercices.ExercicesChecks;

import java.util.Scanner;

public class bonusa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0;
//•	Ако числото е до 100 включително, бонус точките са 5.
//•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
//•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.

        if (num <= 100) {
            bonus = 5;
        }else if (num > 1000) {
            bonus = num - (num * 0.10);

        }else {
            bonus = num - (num * 0.10);
        }
        if (num % 2 == 0) {
            bonus = bonus + 1;
        }else if (num % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + num);
    }
}
