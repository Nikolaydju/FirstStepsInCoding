package Exercices.Checks1;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double volleyballtime = 0.0;
        //Igrite v sofia prez weekends
        volleyballtime += (48 - h) * 3.0 / 4;

        //Igrite v sofia prez prazbuchnite dni
        volleyballtime += p * 2.0 / 3;

        //Igrite v rodnoto mqsno
        volleyballtime += h;

        //proverka za visokosna godina
        if (year.equals("leap")) {
            volleyballtime *= 1.15;
        }
        System.out.printf("%.0f",Math.floor(volleyballtime));


    }
}
