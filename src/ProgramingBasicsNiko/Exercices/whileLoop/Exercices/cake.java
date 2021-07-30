package Exercices.whileLoop.Exercices;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());

        int totalPieces = width * lenght;
        // moje da e chislo ili string "Stop"
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int cakePieces = Integer.parseInt(input);
            totalPieces = totalPieces - cakePieces;

            if (totalPieces <= 0) {
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", totalPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more",Math.abs(totalPieces));
        }


    }
}
