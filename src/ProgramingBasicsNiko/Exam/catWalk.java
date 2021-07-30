package Exam;

import java.util.Scanner;

public class catWalk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input
        //•	На първия ред - минути разходка на ден - цяло число в интервала [1...50]
        //•	На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
        //•	На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]

        int minutes = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMin = walks * minutes;
        int burnedCalories = totalMin * 5;
        int fiftyPercentCalories = calories / 2;

        if (burnedCalories >= fiftyPercentCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",burnedCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",burnedCalories);

        }


    }
}
