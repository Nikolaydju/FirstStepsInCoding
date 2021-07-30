package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class LearningByDoing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Vohd
        //1.	Брой страници в текущата книга – цяло число в интервала [1…1000];
        //2.	Страници, които може да прочита за 1 час – цяло число в интервала [1…1000];
        //3.	Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000];

        double allPages = Double.parseDouble(scanner.nextLine());
        double pagesPerHour = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());

        //Presmqtaniq

        double timeToRead = allPages / pagesPerHour;
        double neededHours = timeToRead / days;
        System.out.printf("%.0f",neededHours);


    }
}
