package Exercices.Checks;

import java.util.Scanner;

public class journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
        //•	Втори ред –  Един от двата възможни сезона: „summer” или “winter”

        double budget = Double.parseDouble(scanner.nextLine());
        String seson = scanner.nextLine();
        String campOrHotel = "";
        String where = "";
        double expenses = 0;

        if (budget <= 100){
            if (seson.equals("summer")){
                where = "Bulgaria";
                expenses = budget * 0.30;
                campOrHotel = "Camp";
            }else if (seson.equals("winter")){
                where = "Bulgaria";
                expenses = budget * 0.70;
                campOrHotel = "Hotel";
            }
        }
        if (budget > 100 && budget <= 1000){
            if (seson.equals("summer")){
                where = "Balkans";
                expenses = budget * 0.40;
                campOrHotel = "Camp";
            }else if (seson.equals("winter")){
                where = "Balkans";
                expenses = budget * 0.80;
                campOrHotel = "Hotel";
            }
        }else if (budget >= 1000){
            if (seson.equals("summer") || seson.equals("winter"))
            where = "Europe";
            expenses = budget * 0.90;
            campOrHotel = "Hotel";
        }
        System.out.printf("Somewhere in %s%n" +
                "%s - %.2f",where,campOrHotel,expenses);









    }
}
