package Exam;

import java.util.Scanner;

public class addBags {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double luggagePriceMore20Kg = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countLuggage = Integer.parseInt(scanner.nextLine());

        double taxKg = 0;
        double totalTax = 0;


        if (luggageKg < 10) {
            taxKg = luggagePriceMore20Kg - (luggagePriceMore20Kg * 0.80);

        } else if (luggageKg >= 10 && luggageKg <= 20) {
            taxKg = luggagePriceMore20Kg / 2;

        } else if (luggageKg > 20) {
            taxKg = luggagePriceMore20Kg;
        }

        if (days > 30) {
            totalTax = taxKg + (taxKg * 0.10);
        } else if (days >= 7 && days <= 30) {
            totalTax = taxKg + (taxKg * 0.15);
        } else if (days < 7) {
            totalTax = taxKg + (taxKg * 0.40);
        }
        double totalSum = totalTax * countLuggage;
        System.out.printf("The total price of bags is: %.2f lv. ", totalSum);

    }
}
