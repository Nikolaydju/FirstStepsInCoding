package Exercices.lastExercices;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int simple = 0;



        while (!input.equals("stop")){
            int number = Integer.parseInt(input);
            boolean isNonPrime = false;
            int primeSum = 0;
            int nonPrimeSum = 0;
            //Proverka za otricantelno chislo
            if (number < 0){
                System.out.printf("Number is negative.");
                input = scanner.nextLine();
             continue;
            }
            //Proverka za prosto i neprosto chislo
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    isNonPrime = true;
                    nonPrimeSum = nonPrimeSum + number;
                    break;
                }

            }



            input = scanner.nextLine();
        }

    }
}
