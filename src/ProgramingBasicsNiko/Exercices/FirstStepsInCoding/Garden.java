package Exercices.FirstStepsInCoding;

import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00… 10000.00]
        // Цената на един кв. м. е 7.61лв със ДДС.


        double SmToBelandscaped = Double.parseDouble(scanner.nextLine());

        double NeedMoney = SmToBelandscaped * 7.61;
        double discount = 0.18 * NeedMoney;
        double FinalPrice= NeedMoney - discount;
        System.out.println("The final price is " + FinalPrice);
        System.out.println("The discount is " + discount);










    }
}
