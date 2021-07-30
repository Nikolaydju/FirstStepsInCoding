package Exercices.ExercicesChecks;

import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vhod
        //1.	Доход в лева - реално число в интервала [0.00..6000.00]
        //2.	Среден успех -  реално число в интервала [2.00...6.00]
        //3.	Минимална работна заплата - реално число в интервала [0.00..1000.00]

        double moneyIncome = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0.0;
        double exellentScholarship = 0.0;
        String output = "";
        boolean Approved = false;
        //proverka za socialna stipendiq

        if (moneyIncome < minimalSalary) {
            if (averageSuccess > 4.5) {
                socialScholarship = Math.floor(minimalSalary * 0.35);
                Approved = true;
            }
        }
        //proverka za Otlichna stipendiq
        if (averageSuccess >= 5.5) {
            exellentScholarship = Math.floor(averageSuccess * 25);
            Approved = true;
        }
        //proverka koq stipendiq e po visoka
        if (socialScholarship > exellentScholarship) {
            output = String.format("You get a Social scholarship %.0f BGN",socialScholarship);

        }else {
            output = String.format("You get a scholarship for excellent results %.0f BGN",exellentScholarship);
        }
          if (!Approved) {
              output = "You cannot get a scholarship!";
          }
        System.out.println(output);
    }
}
