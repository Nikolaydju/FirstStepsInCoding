package Exam;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – име на филм – текст ("A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite")
        //•	Втори ред– вид на залата – текст ("normal", "luxury" или "ultra luxury")
        //•	Трети ред – брой на закупените билети – цяло число в интервала [1…100]
        String movieName = scanner.nextLine();
        String kindOfHall = scanner.nextLine();
        int purchasedTickets = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        switch (movieName){
            case "A Star Is Born":
                if (kindOfHall.equals("normal")){
                    totalPrice = purchasedTickets * 7.50;

                }else if (kindOfHall.equals("luxury")){
                    totalPrice = purchasedTickets * 10.50;
                }else if (kindOfHall.equals("ultra luxury")){
                    totalPrice = purchasedTickets * 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (kindOfHall.equals("normal")){
                    totalPrice = purchasedTickets * 7.35;

                }else if (kindOfHall.equals("luxury")){
                    totalPrice = purchasedTickets * 9.45;
                }else if (kindOfHall.equals("ultra luxury")){
                    totalPrice = purchasedTickets * 12.75;
                }
                break;
            case "Green Book":
                if (kindOfHall.equals("normal")){
                    totalPrice = purchasedTickets * 8.15;

                }else if (kindOfHall.equals("luxury")){
                    totalPrice = purchasedTickets * 10.25;
                }else if (kindOfHall.equals("ultra luxury")){
                    totalPrice = purchasedTickets * 13.25;
                }
                break;
            case "The Favourite":
                if (kindOfHall.equals("normal")){
                    totalPrice = purchasedTickets * 8.75;

                }else if (kindOfHall.equals("luxury")){
                    totalPrice = purchasedTickets * 11.55;
                }else if (kindOfHall.equals("ultra luxury")){
                    totalPrice = purchasedTickets * 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.",movieName,totalPrice);




    }
}
