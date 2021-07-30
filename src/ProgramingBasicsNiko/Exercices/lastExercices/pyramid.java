package Exercices.lastExercices;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        boolean isEqual = false;
        //for loop po redovete
        for (int row = 1; row <= n; row++) {

            //for loop po kolnkite
            for (int col = 1; col <= row; col++) {
                number++;
                if (number > n) {
                    isEqual = true;
                    break;
                }
                System.out.print(number + " ");
                //prekusvam vutreshniq
            }
            //prekusvame vunshniq
            if (isEqual) {
                break;
            }
            System.out.println();

        }


    }
}
