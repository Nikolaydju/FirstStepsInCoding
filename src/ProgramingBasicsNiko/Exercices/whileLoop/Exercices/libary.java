package Exercices.whileLoop.Exercices;

import java.util.Scanner;

public class libary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String currentBook = scanner.nextLine();
        int count = 0;

        while (!currentBook.equals("No More Books")){
            if (searchedBook.equals(currentBook)){
                break;
            }
            count++;
            currentBook = scanner.nextLine();


        }
        if (searchedBook.equals(currentBook)){
            System.out.printf("You checked %d books and found it.",count);

        }else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.",count);
        }

    }
}
