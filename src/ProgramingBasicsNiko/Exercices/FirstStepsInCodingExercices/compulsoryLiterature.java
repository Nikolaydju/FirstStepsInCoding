package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class compulsoryLiterature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vhod
        //1. Брой страници в текущата книга – цяло число в интервала [1…1000];
        //2. Страници, които може да прочита за 1 час – цяло число в интервала [1…1000];
        //3. Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000];

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesForReading = Integer.parseInt(scanner.nextLine());
        int daysToFinishTheBook = Integer.parseInt(scanner.nextLine());

        int timeToReadTheBook = pages / pagesForReading;
        int result = timeToReadTheBook / daysToFinishTheBook;

        System.out.println(result);

    }
}
