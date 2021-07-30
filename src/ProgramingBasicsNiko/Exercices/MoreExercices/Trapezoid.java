package Exercices.MoreExercices;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Trapezoid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double result = (b1 + b2) * h / 2;
        System.out.printf("%.2f",result);

    }
}
