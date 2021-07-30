package Exercices.ExercicesChecks;

import java.util.Scanner;

public class modulnoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number =Double.parseDouble(scanner.nextLine());

        //boolean result = number % 10 == 5;
        //System.out.println(result);

        //boolean result = number % 2 == 0;
        //System.out.println(result);

        double result = number % 2;
        System.out.println(result);
    }
}
