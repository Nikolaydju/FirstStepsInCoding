package Exercices.ForLoop;

import java.util.Scanner;

public class TextToNumbers {
    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  String text = scanner.nextLine();

     //hello
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            System.out.println(symbol);

        }
    }
}

