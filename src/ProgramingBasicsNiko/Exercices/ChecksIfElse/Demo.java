package Exercices.Checks;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int grade = Integer.parseInt(scanner.nextLine());

if (grade >= 5) {
    System.out.println("Very Good");
} else if (grade >= 4) {
    System.out.println("Good");
}else {
    System.out.println("Bad");
}

    }
}
