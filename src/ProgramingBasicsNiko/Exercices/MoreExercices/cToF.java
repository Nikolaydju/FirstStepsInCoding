package Exercices.MoreExercices;

import java.util.Scanner;

public class cToF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //(15 °C × 9/5) + 32 = 59 °F
        //(9/5) * 35 + 32 = 95 F.

        double C = Double.parseDouble(scanner.nextLine());


        double result = (C * 1.8) + 32;
        System.out.printf("%.2f",result);



    }
}
