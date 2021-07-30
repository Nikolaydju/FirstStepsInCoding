package Exam;

import java.util.Scanner;

public class DesiBirthdayEaster {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vhod
        //
        int guest = Integer.parseInt(scanner.nextLine());
        double priceForOnePerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double cake =(budget*0.10);
        double priceForAll;
        if ( guest >= 10 && guest <= 15){
            priceForOnePerson = priceForOnePerson * 0.85;
            priceForAll=priceForOnePerson*guest;
        }else if ( guest > 15 && guest <= 20){
            priceForOnePerson*=0.80;
            priceForAll=priceForOnePerson*guest;
        }else if ( guest > 20 ){
            priceForOnePerson*=0.75;
            priceForAll=priceForOnePerson*guest;
        }else{
            priceForAll=priceForOnePerson*guest;
        }
        if ( budget >= ( priceForAll +cake)){
            System.out.printf("It is party time! %.2f leva left.%n",( budget - ( priceForAll +cake)));
        }else {
            System.out.printf("No party! %.2f leva needed.",(( priceForAll +cake)-budget));
        }
    }
}