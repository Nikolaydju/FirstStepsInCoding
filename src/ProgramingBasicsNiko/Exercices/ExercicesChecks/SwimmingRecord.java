package Exercices.ExercicesChecks;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3.	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double swimmingTime = distance * timeForOneMeter;
        double addingTime = Math.floor(distance / 15) * 12.5;
        double totalTime = swimmingTime + addingTime;
        if (recordInSec <= totalTime) {
            double needSecs = totalTime - recordInSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.",needSecs);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }





    }
}
