package Exercices.ExercicesChecks;

import java.util.Scanner;

public class workingTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour <= 18) {
            if (day.equals("Monday") || (day.equals("Tuesday")) || (day.equals("Wednesday")) || (day.equals("Thursday")) || (day.equals("Friday")) || day.equals("Saturday")) {
                System.out.printf("open");
        } else {
            System.out.printf("closed");
        }

    }else {
        System.out.printf("closed");
    }

   }
}
