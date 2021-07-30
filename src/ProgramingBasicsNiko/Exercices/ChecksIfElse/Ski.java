package Exercices.Checks;

import java.util.Scanner;

public class Ski {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        String premises = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double nights = days - 1;
        double totalprice = 0;

        if (premises.equals("room for one person")) {
            totalprice = nights * 18.00;

        } else if (premises.equals("apartment")) {
            if (days < 10) {
                totalprice = nights * 25.00;
                totalprice = totalprice - (totalprice * 0.30);

            } else if (days >= 10 && days <= 15) {
                totalprice = nights * 25.00;
                totalprice = totalprice - (totalprice * 0.35);

            } else if (days > 15) {
                totalprice = nights * 25.00;
                totalprice = totalprice - (totalprice * 0.50);
            }

        } else if (premises.equals("president apartment")) {
            if (days < 10) {
                totalprice = nights * 35.00;
                totalprice = totalprice - (totalprice * 0.10);
            } else if (days >= 10 && days <= 15) {
                totalprice = nights * 35.00;
                totalprice = totalprice - (totalprice * 0.15);

            } else if (days > 15) {
                totalprice = nights * 35.00;
                totalprice = totalprice - (totalprice * 0.20);
            }
        }
        if (evaluation.equals("positive")) {
            totalprice = totalprice + (totalprice * 0.25);

        } else if (evaluation.equals("negative")) {
            totalprice = totalprice - (totalprice * 0.10);

        }
        System.out.printf("%.2f", totalprice);

    }
}
