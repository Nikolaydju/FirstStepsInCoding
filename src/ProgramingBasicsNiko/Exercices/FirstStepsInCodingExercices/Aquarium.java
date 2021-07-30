package Exercices.FirstStepsInCodingExercices;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1. Дължина в см – цяло число в интервала [10 … 500]
      //  2. Широчина в см – цяло число в интервала [10 … 300]
      //  3. Височина в см – цяло число в интервала [10… 200]
      //  4. Процент – реално число в интервала [0.000 … 100.000]
        //

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = lenght * width * height ;
        double volumeInLiters = volume / 1000;
        double result = volumeInLiters - volumeInLiters * percent / 100;
        System.out.printf("%.2f",result);






        int guest = Integer.parseInt(scanner.nextLine());
        double priceForOnePerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double cake =(budget*0.1);
        double priceForAll;
        if ( guest >= 10 && guest <= 15){
            priceForOnePerson*=0.85;
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



