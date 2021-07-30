package Exercices.FirstStepsInCoding;

import java.util.Scanner;

public class Garden1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        double NeedMoney = area * 7.61;
        double discound = 0.18 * NeedMoney;
        double finalPrice = NeedMoney - discound;

        System.out.printf("The final price is %f lv %n",finalPrice);
        System.out.printf("The discount is %f",discound);

    }
}
