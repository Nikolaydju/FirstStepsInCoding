package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class Degreees {
    public static void main(String[] args) {
//Използвайте формулата: градус = радиан * 180 / π.Числото π в Java програми е достъпно чрез Math.PI. Закръглете резултата до най-близкото цяло число използвайки "%.0f".
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degreese = radians * 180 / Math.PI;
        System.out.printf("%.0f",degreese);


    }
}
