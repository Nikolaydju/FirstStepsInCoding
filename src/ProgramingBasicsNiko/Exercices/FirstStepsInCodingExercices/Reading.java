package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                double pages = Double.parseDouble(scanner.nextLine());
                double timeToFinishReading = Double.parseDouble(scanner.nextLine());


                // presmqtaniq

        double pagesPerDay = pages / timeToFinishReading;
        System.out.printf("%f.2",pagesPerDay);

    }
}
