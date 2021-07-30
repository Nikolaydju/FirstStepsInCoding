package Exercices.whileLoop;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (true){
            int number = Integer.parseInt(scanner.nextLine());

            sum = sum + number;
            if (sum >= num){
                break;
            }
        }
        System.out.println(sum);
    }
}
