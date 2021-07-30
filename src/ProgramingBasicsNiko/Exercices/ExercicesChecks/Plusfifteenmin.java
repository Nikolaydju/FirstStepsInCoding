package Exercices.ExercicesChecks;

import java.util.Scanner;

public class Plusfifteenmin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours =Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        int totalTimeMin = hours  * 60 + mins + 15;
        hours = totalTimeMin / 60;
        mins = totalTimeMin % 60;

        if (hours > 23) {
            hours = 0;

        }
        System.out.printf("%d:%02d",hours,mins);


        }

        }

