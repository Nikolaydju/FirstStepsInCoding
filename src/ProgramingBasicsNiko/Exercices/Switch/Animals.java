package Exercices.Checks1;

import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch (animal) {
            case "dog":
                System.out.printf("mammal");
                break;
            case "crocodile":
            case "snake":
            case "tortoise":
                System.out.printf("reptile");
                break;
            default:
                System.out.printf("unknown");
        }
    }
}
