package Exercices.MoreExercices;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Да се напише конзолна Java програма, която пресмята и отпечатва стойността на следния числен израз:
        //
        //(3522 + 52353) * 23 - (2336 * 501 + 23432 - 6743) * 3

 double result = (3522 + 52353) * 23 - (2336 * 501 + 23432 - 6743) * 3;
 System.out.printf("%.0f",result);
    }
}
