package Exercices.FirstStepsInCoding;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int otherPets = Integer.parseInt(scanner.nextLine());

        double sumDogs = dogs * 2.50;
        double sumOtherPets = otherPets * 4.0;
        double result = sumDogs + sumOtherPets;
        System.out.println(result);

    }
}
