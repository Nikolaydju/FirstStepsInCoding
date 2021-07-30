package Exercices.Checks1;

import java.util.Scanner;

public class KiNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//•	Premiere – премиерна прожекция, на цена 12.00 лева.
//•	Normal – стандартна прожекция, на цена 7.50 лева.
//•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        String projetction = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double income = 0;

        if (projetction.equals("Premiere")) {
            income = r * c * 12.00;


        } else if (projetction.equals("Normal")) {
            income = r * c * 7.50;

        } else if (projetction.equals("Discount")) {
            income = r * c * 5.00;

        }
        System.out.printf("%.2f",income);

    }
}
