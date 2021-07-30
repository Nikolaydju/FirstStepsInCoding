package Exercices.Checks;

import java.util.Scanner;

public class PassGeues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        if (pass.equalsIgnoreCase("Nikolaydju")) {
            System.out.println("Welcome");
        } else
            System.out.println("Wrong Pass");

        }
    }

