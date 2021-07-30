package Exercices.Checks1;

import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
//•	Брой цветя - цяло число в интервала [10…1000]
//•	Бюджет - цяло число в интервала [50…2500]

        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double neededMoney = 0;

        if ("Roses".equals(flowers)) {
            neededMoney = countFlowers * 5;
            if (countFlowers > 80) {
                neededMoney = neededMoney - (neededMoney * 0.10);

            }
        } else if ("Dahlias".equals(flowers)) {
            neededMoney = countFlowers * 3.80;
            if (countFlowers > 90)
                neededMoney = neededMoney - (neededMoney * 0.15);
        } else if ("Tulips".equals(flowers)) {
            neededMoney = countFlowers * 2.80;
            if (countFlowers > 80){
                neededMoney = neededMoney - (neededMoney * 0.15);
            }
        } else if ("Narcissus".equals(flowers)) {
            neededMoney = countFlowers * 3;
            if (countFlowers < 120){
                neededMoney = neededMoney + (neededMoney * 0.15);
            }
        } else if ("Gladiolus".equals(flowers)) {
            neededMoney = countFlowers * 2.50;
            if (countFlowers < 80){
                neededMoney = neededMoney + (neededMoney * 0.20);
            }
        }

        double totalprice = budget - neededMoney;

        if (budget >= neededMoney){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlowers,flowers,totalprice);
        }else if (budget < neededMoney){
            totalprice = neededMoney - budget;
            System.out.printf("Not enough money, you need %.2f leva more.",totalprice);
        }



    }
}
