package Exam;

import java.util.Scanner;

public class balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
//2.	След това се четат N на брой цветове.

        int ballsCount = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int other = 0;

        for (int i = 1; i <= ballsCount; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                points = points + 5;
                red++;
            } else if (color.equals("orange")) {
                points = points + 10;
                orange++;
            } else if (color.equals("yellow")) {
                points = points + 15;
                yellow++;
            } else if (color.equals("white")) {
                points = points + 20;
                white++;
            } else if (color.equals("black")) {
                points = points / 2;
                black++;

            }else {
                other++;
            }

        }
        System.out.printf("Total points: %d%n",points);
        System.out.printf("Points from red balls: %d%n",red);
        System.out.printf("Points from orange balls: %d%n",orange);
        System.out.printf("Points from yellow balls: %d%n",yellow);
        System.out.printf("Points from white balls: %d%n",white);
        System.out.printf("Other colors picked: %d%n",other);
        System.out.printf("Divides from black balls: %d",black);

    }
}
