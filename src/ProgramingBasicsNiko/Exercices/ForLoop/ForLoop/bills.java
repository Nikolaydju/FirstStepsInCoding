package ProgramingBasicsNiko.Exercices.ForLoop.ForLoop;

import java.util.Scanner;

public class bills {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Първи ред – месеците за които се търси средният разход – цяло число в интервала [1...100]
        //За всеки месец – сметката за ток – реално число в интервала [1.00...1000.00]
//За ток – всеки месец е различен, ще се чете от конзолата
//за вода – 20 лв.
//за интернет – 15 лв.
//за други – събират се тока, водата и интернета за месеца и към сумата се прибавят 20%.
        int months = Integer.parseInt(scanner.nextLine());
        double water = 20;
        double internet = 50;
        double others = 0;
        double othersPrice = 0;
        double electricityPrice = 0;
        double waterPrice = 0;
        double internetPrice = 0;


        for (int i = 1; i <= months; i++) {
            double Electricity = Double.parseDouble(scanner.nextLine());

            electricityPrice = electricityPrice + Electricity;
            waterPrice = waterPrice + water;
            internetPrice = internetPrice + internet;
            others = electricityPrice + waterPrice + internetPrice;
            othersPrice = others + (others * 0.20);


        }
       double average = (electricityPrice + waterPrice +internetPrice + othersPrice) / months;

        System.out.printf("Electricity: %.2f lv%n",electricityPrice);
        System.out.printf("Water: %.2f lv%n",waterPrice);
        System.out.printf("Internet: %.2f lv%n",internetPrice);
        System.out.printf("Other: %.2f lv%n",othersPrice);
        System.out.printf("Average: %.2f lv%n",average);
    }
}
