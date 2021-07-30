package Exercices.whileLoop.Exercices;

import java.util.Scanner;

public class prepForExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int badScore = Integer.parseInt(scanner.nextLine());


        int badScoreCount = 0;
        int solvedPriblemsCount = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (badScoreCount < badScore) {
            String name = scanner.nextLine();


            if (name.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                badScoreCount++;
            }
            gradesSum = gradesSum + grade;
            solvedPriblemsCount++;
            lastProblem = name;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badScore);
        } else {
            System.out.printf("Average score: %.2f%n", gradesSum / solvedPriblemsCount);
            System.out.printf("Number of problems: %d%n", solvedPriblemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
