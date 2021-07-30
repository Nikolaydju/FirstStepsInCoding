package Exercices.ForLoop;

import java.util.Scanner;

public class EvenPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();
        //a = 1
        //e = 2
        //i = 3
        //o = 4
        //u = 5
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            switch (symbol) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;

            }

        }
        System.out.println(sum);

    }
}
