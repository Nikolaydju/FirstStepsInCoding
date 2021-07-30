package Exercices.ExercicesChecks;

import java.util.Scanner;

public class MetersAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Първи ред: число за преобразуване - реално число
        //•	Втори ред: входна мерна единица - текст
        //•	Трети ред: изходна мерна единица (за резултата) - текст

        //m cm mm

        double num = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("cm")) {
            num = num / 100;
        } else if (input.equals("mm")) {
            num = num / 1000;
        }
        if (output.equals("cm")) {
            num = num * 100;
        } else if (output.equals("mm")) {
            num = num * 1000;
        }
        System.out.printf("%.3f",num);
    }
}
