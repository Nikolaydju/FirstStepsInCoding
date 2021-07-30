package Exam;

import java.util.Scanner;

public class agencyProfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.	Име на авиокомпанията - текст
        //2.	Брой билети за	 възрастни – цяло число в диапазона [1…400]
        //3.	Брой детски билети – цяло число в диапазона [25…120]
        //4.	Нетна цена на билет за възрастен – реално число в диапазона [100.0…1600.0]
        //5.	Цената на такса обслужване - реално число в диапазона [10.0…50.0]


        String companyName = scanner.nextLine();
        int ticketsAdult = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double sumNettoAdult = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double sumNettoKids = sumNettoAdult - (sumNettoAdult * 0.7);
        double totalPriceAdult = sumNettoAdult + tax;
        double totalPriceKids = sumNettoKids + tax;

        double priceAllTickets =  (ticketsAdult * totalPriceAdult) + (ticketsKids * totalPriceKids);
        double totalPrice = priceAllTickets - (priceAllTickets * 0.80);
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",companyName,totalPrice);

    }
}
