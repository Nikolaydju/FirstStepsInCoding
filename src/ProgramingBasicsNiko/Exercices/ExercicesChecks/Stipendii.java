package Exercices.ExercicesChecks;

import java.util.Scanner;

public class Stipendii {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.	Доход в лева - реално число в интервала [0.00..6000.00]
        //2.	Среден успех -  реално число в интервала [2.00...6.00]
        //3.	Минимална работна заплата - реално число в интервала [0.00..1000.00]

        double moneyIncome = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minimumSalery = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0; //
        double exellentScholarship = 0;
        String output = "";
        boolean isValid = false;
        //proverka za socialna stipendiq

        if (averageScore > 4.50) {
            if (moneyIncome < minimumSalery) {
                socialScholarship = Math.floor(minimumSalery * 0.35); // Math.floor zakruglqva do po malkoto cqlo cishlo
                isValid = true;
            }
            //proverka za otlichna stipendia
            if (averageScore >= 5.50) {
                exellentScholarship = Math.floor(averageScore * 25);
                isValid = true;
            }
            //proverka dali vaobshte moje da poluchi stipendiq
            if (socialScholarship == 0 && exellentScholarship == 0) {
                output = "You cannot get a scholarship!";
            }
            if (socialScholarship > exellentScholarship) {
                output = String.format("You get a Social scholarship %.0f BGN", socialScholarship);

            } else if (socialScholarship <= exellentScholarship) {
                output = String.format("You get a scholarship for excellent results %.0f BGN", exellentScholarship);
            }
            if (!isValid) {
                output = "You cannot get a scholarship!";
            }
            System.out.println(output);

            //proverka dali vaobshte moje da poluchi stipendiq

            //proverka koq stipendiq e po visoka i shte dadem neq

            //printirane na rezultat

        }

    }
}

