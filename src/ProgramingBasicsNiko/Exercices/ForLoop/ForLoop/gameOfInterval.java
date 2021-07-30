package ProgramingBasicsNiko.Exercices.ForLoop.ForLoop;

import java.util.Scanner;

public class gameOfInterval {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int turns = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double zeroToNine = 0;
        double tenTo19 = 0;
        double twentyTo29 = 0;
        double thirtyTo39 = 0;
        double fortyTo50 = 0;
        double invalidNum = 0;

        for (int i = 1; i <= turns; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 0 && num <= 9) {
                result = result + (num * 0.2);
                zeroToNine++;
            } else if (num >= 10 && num <= 19) {
                result = result + (num * 0.3);
                tenTo19++;
            } else if (num >= 20 && num <= 29) {
                result = result + (num * 0.4);
                twentyTo29++;
            } else if (num >= 30 && num <= 39) {
                result = result + 50;
                thirtyTo39++;
            } else if (num >= 40 && num <= 50) {
                result = result + 100;
                fortyTo50++;
            } else {
                result = result / 2;
                invalidNum++;
            }


        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", zeroToNine / turns * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", tenTo19 / turns * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", twentyTo29 / turns * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", thirtyTo39 / turns * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", fortyTo50 / turns * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalidNum / turns * 100);

    }
}
