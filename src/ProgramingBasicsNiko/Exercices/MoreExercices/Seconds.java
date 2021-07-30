package Exercices.MoreExercices;

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vohd

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());
        int totalTime = timeFirst + timeSecond + timeThird;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

         System.out.printf("%d:%02d",minutes,seconds);

    }
}
