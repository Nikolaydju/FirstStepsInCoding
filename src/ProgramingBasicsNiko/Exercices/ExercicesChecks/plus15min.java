package Exercices.ExercicesChecks;

import java.util.Scanner;

public class plus15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        int totalTimeinMin = (hours * 60) + mins + 15;

        hours = totalTimeinMin / 60;
        mins = totalTimeinMin % 60;

        if (hours > 23) {
            hours = 0;

        }
        System.out.printf("%d:%02d",hours,mins);
    }
}
