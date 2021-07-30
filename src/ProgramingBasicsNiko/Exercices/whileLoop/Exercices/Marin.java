package Exercices.whileLoop.Exercices;

import java.util.Scanner;

public class Marin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //•	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
        //•	След това многократно се четат по два реда:
        //o	Име на задача - текст
        //o	Оценка - цяло число в интервала [2…6]

        int badScore = 0;

        String exercisesName = scanner.nextLine();
        int score = Integer.parseInt(scanner.nextLine());

        while (!exercisesName.equals("Enough")){
            if (score <= 4){
                badScore++;
            }

        }
    }
}
