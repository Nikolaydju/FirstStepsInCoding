package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
        //Vhod
        //1.	Дължина в см – цяло число в интервала [10 … 500]
        //2.	Широчина в см – цяло число в интервала [10 … 300]
        //3.	Височина в см – цяло число в интервала [10… 200]
        //4.	Процент  – реално число в интервала [0.000 … 100.000

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        //Изход
        //Да се отпечата на конзолата едно число:
        //•	литрите вода, които ще  събира аквариума.
        //Резултатът да се форматира до вторта цифра след десетичната запетая.

        int volume = length * width * height;
        double totalLitersThatWillCollect = volume * 0.001;
        double result = totalLitersThatWillCollect - totalLitersThatWillCollect * percent / 100;
        System.out.printf("%.2f",result);




    }
}
