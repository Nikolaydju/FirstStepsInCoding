package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        //1.	Депозирана сума – реално число в интервала [100.00 … 10000.00];
        //2.	Срок на депозита(в месеци) – цяло число в интервала [1…12];
        //3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00];

        double DepositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double InterestRate = Double.parseDouble(scanner.nextLine());

        double Interest = DepositSum * InterestRate / 100;
        double SumPerMonth = Interest / 12;
        double totalSum = DepositSum + months * SumPerMonth;
        System.out.println(totalSum);


    }
}
