package examNow;

import java.util.Scanner;

public class mini {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //•	На първия ред: цена на една видео карта – цяло число в интервала [1 … 2000]
        //•	На втория ред: цена на един преходник – цяло число в интервала [1 … 50]
        //•	На третия ред: цена на консумирания ток от карта за ден – реално число в интервала [0.01 ... 10.00]
        //•	На четвъртия ред: печалба от една карта за един ден – реално число в интервала [1.00 ... 100.00]

        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int adapter = Integer.parseInt(scanner.nextLine());
        double electricity = Double.parseDouble(scanner.nextLine());
        double rewardFromOneCardPerDay = Double.parseDouble(scanner.nextLine());


        double totalVideoCard = videoCardPrice * 13;
        double totalAdapterPrice = adapter * 13;
        double totalCosts = totalVideoCard + totalAdapterPrice + 1000;

        double totalRewardPerDayFromOne = rewardFromOneCardPerDay - electricity;
        double totalReward = totalRewardPerDayFromOne * 13;

        double days =  totalCosts / totalReward;
        System.out.printf("%.0f%n",totalCosts);
        System.out.printf("%.0f",Math.ceil(days));



    }
}
