package Exercices.ExercicesChecks;

import java.util.Scanner;

public class sekundi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totalTimeInSec = first + second + third;
        int min = totalTimeInSec / 60;
        int sec = totalTimeInSec % 60;
        if (sec < 10) {
            System.out.printf("%d:0%d",min,sec);

        }else {
            System.out.printf("%d:%d",min,sec);
        }

    }
}
