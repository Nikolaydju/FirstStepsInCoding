package Exercices.ExercicesChecks;

import java.util.Scanner;

public class Secs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThirt = Integer.parseInt(scanner.nextLine());

        int totalSecs = (timeFirst + timeSecond + timeThirt);
        int min = totalSecs / 60;
        int secs = totalSecs % 60;

        if (secs < 10) {
            System.out.printf("%d:0%d", min, secs);

        } else {
            System.out.printf("%d:%d", min, secs);


        }
    }
}
