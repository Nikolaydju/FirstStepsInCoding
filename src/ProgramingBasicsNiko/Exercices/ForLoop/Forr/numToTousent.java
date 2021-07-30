package Exercices.ForLoop.Forr;

import java.util.Scanner;

public class numToTousent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//*Забележка: С модулно деление на 10 може да намерите последната цифра, на което и да е цяло число, независимо каква е дължината му.
        for (int i = 7; i <= 997; i++) {
            if (i % 10 == 5){
                System.out.println(i);
            }

        }



    }
}
