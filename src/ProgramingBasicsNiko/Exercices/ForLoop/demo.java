package Exercices.ForLoop;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



     String text = "Hello";


        for (int i = text.length() - 1;i >= 0; i--){
            char symbol = text.charAt(i);
            System.out.println(symbol);

        }
    }
}
