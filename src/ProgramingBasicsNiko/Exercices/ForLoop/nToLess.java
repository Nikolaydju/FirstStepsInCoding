package Exercices.ForLoop;

import java.util.Scanner;

public class nToLess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--){ // i-- namalqvashta stupka -1     i>=1 oburnato uslovie
            System.out.println(i);
        }
    }
}
