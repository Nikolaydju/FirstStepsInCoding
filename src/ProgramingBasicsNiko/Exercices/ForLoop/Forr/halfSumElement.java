package Exercices.ForLoop.Forr;

import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());   //n na broi puti
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        // Направете for цикъл, за да прочетете n на брой числа.
        // При всяко прочитане на число го добавяйте към сумата.
        // Направете проверка дали въведеното число е по-голямо от моментния максимум.
        // Ако е по-голямо, максимумът става равен на това число.

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        sum = sum - maxNumber;

        if (sum == maxNumber) {
            System.out.printf("Yes%n" +
                    "Sum = %d", maxNumber);

        } else {
            System.out.printf("No%n" +
                    "Diff = %d", Math.abs(sum - maxNumber));
        }


    }
}
