package examNow;

import java.util.Scanner;

public class puppyCare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
        //•	На всеки следващ ред до получаване на команда Adopted ще получавате колко грама изяжда кученцето на всяко хранене - цяло число в интервала [10 …1000]


        int purchasedFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalPurchasedFood = purchasedFood * 1000;
        int eatenFood = 0;

        while (!input.equals("Adopted")) {
          eatenFood = eatenFood + Integer.parseInt(input);
          input = scanner.nextLine();

        }
        int difference = Math.abs(totalPurchasedFood - eatenFood);
        if (eatenFood <= totalPurchasedFood){
            System.out.printf("Food is enough! Leftovers: %d grams.",difference);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",difference);
        }


    }
}

