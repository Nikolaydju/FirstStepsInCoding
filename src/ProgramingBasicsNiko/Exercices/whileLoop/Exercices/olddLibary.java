package Exercices.whileLoop.Exercices;

import java.util.Scanner;

public class olddLibary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        String searchingBook = scanner.nextLine();

        String nextBook = scanner.nextLine();

        while (!nextBook.equals("No More Books")){
            if (searchingBook.equals(nextBook)){
                break;
            }else {
                count++;
            }

            nextBook = scanner.nextLine();
        }
        if (nextBook.equals("No More Books")){
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books",count);
        }else {
            System.out.printf("You checked %d books and found it.",count);
        }
    }
}
