package Exercices.Checks;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Pass = scanner.nextLine();

        if (Pass .equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        }else System.out.println("Wrong password!");
        }
    }

