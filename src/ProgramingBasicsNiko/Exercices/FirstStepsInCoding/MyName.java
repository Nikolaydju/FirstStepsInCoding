package Exercices.FirstStepsInCoding;

import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("My name is %s %s i am %d years old",firstName,lastName,age);
    }
}
