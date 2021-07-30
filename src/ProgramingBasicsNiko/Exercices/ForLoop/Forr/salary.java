package Exercices.ForLoop.Forr;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        //•	Заплата - число в интервала [500...1500]

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        //For Loop po broq na tabovete ( openTabs)
        for (int i = 0; i < openTabs; i++) {
            String website = scanner.nextLine();
            //Проверка за забранените сайтове
            if (website.equals("Facebook")) {
                salary -= 150;
            } else if (website.equals("Instagram")) {
                salary -= 100;
            } else if (website.equals("Reddit")) {
                salary -= 50;
            }
            //Ако по време на проверката заплатата стане по-малка или равна на 0 лева, на конзолата се изписва
            if (salary <= 0) {
                break;



            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.println(salary);

        }


    }
}
