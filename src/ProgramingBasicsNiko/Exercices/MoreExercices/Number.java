package Exercices.MoreExercices;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String color = scanner.nextLine();
        {

            if (color.equals("red")) {
                System.out.println("tomato");
            } else {
                System.out.println("banana");
                System.out.println("bye");
            }
        }

    }}