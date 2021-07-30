package ProgramingBasicsNiko.Exercices.NestedLoop.NestedLoops;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int current = 0;
        boolean isBigger = false;

        for (int row = 1; row <= num; row++) {

            for (int cols = 1; cols <= row; cols++) {
                current++;
                if (current > num){
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");


            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}
