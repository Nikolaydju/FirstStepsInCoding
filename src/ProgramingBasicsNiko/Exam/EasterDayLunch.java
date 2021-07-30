package Exam;

import java.util.Scanner;

public class EasterDayLunch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vhod
        //•	Брой козунаци - цяло число в интервала [0 … 99]
        //•	Брой кори с яйца - цяло число в интервала [0 … 99]
        //•	Килограми курабии - цяло число в интервала [0 … 99]
         //•	Козунак  – 3.20 лв.
        //•	Яйца –  4.35 лв. за кора с 12 яйца
        //•	Курабии – 5.40 лв. за килограм
        //•	Боя за яйца - 0.15 лв. за яйце

        int kozonak = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int kurabiiKg = Integer.parseInt(scanner.nextLine());

        //presmqtaniq

        double kozonakPrice = kozonak * 3.20;
        double eggsBoxPrice = eggs * 4.35;
        double kurabiiPrice = kurabiiKg * 5.40;
        double paintedEggsPrice = (eggs * 12) * 0.15;
        double totalPrice = kozonakPrice + eggsBoxPrice + kurabiiPrice + paintedEggsPrice;
        System.out.printf("%.2f",totalPrice);


    }
}
