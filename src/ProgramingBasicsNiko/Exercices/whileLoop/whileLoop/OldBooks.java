package ProgramingBasicsNiko.Exercices.whileLoop.whileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String currentBook = scanner.nextLine();
        int count = 0;
        boolean flag = false;

        while (!currentBook.equals("No More Books")) {

            if (currentBook.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.", count);
                flag = true;
                break;
            }
            count++;
            currentBook = scanner.nextLine();
        }

        if (!flag) {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", count);
        }
    }
}

