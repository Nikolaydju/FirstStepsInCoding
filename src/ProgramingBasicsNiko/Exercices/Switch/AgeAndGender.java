package Exercices.Checks1;

import java.util.Scanner;

public class AgeAndGender {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender .equals("m")) {
            if (age >= 16) {
                System.out.printf("Mr.");

            }else {
                System.out.printf("Master");
            }
        }else if (gender.equals("f")) {
            if (age >= 16){
                System.out.printf("Ms.");
            }else {
                System.out.printf("Miss");
            }
        }
    }
}
