package Exercices.Checks1;

import java.util.Scanner;

public class Cheks1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 1) {
            System.out.printf("Monday");
        } else if (num == 2) {
            System.out.printf("Tuesday");
        } else if (num == 3) {
            System.out.printf("Wednesday");
        } else if (num == 4) {
            System.out.printf("Thursday");
        }else if (num == 5) {
            System.out.printf("Friday");
        }else if (num == 6){
            System.out.printf("Saturday");
        }else if (num == 7){
            System.out.printf("Sunday");
        }else
            System.out.printf("Error");
    }
}