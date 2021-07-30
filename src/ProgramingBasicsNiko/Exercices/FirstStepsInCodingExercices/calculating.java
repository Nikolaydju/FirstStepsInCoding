package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class calculating {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int result = a * b;
        System.out.println(result);
    }
}
