package Exercices.FirstStepsInCoding;

import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());
        double Cm = inch * 2.54;
        System.out.println(Cm);


    }
}