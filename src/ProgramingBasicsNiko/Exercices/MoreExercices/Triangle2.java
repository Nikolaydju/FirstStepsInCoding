package Exercices.MoreExercices;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        //area = a * h / 2. Форматирате

        double result = length * height / 2;
        System.out.printf("%.2f",result);
    }
}
