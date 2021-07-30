package Exercices.Checks;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double time = Double.parseDouble(scanner.nextLine());

        if (time < 100) {
            System.out.println("hello");
        } else if (time > 100) {
            System.out.println("bye");

        }
    }
}
