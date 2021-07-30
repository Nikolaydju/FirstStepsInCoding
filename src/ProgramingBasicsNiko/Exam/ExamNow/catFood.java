package examNow;

import java.util.Scanner;

public class catFood {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	На първи ред - броят на котките - цяло число в интервала [1..100]
        //•	На всеки следващ ред за всяка котка - Х грама храна - реално число в интервала [100.00..400.00]
        //ако 1 кг храна = 12.45 лева

        
        int catsCount = Integer.parseInt(scanner.nextLine());
        int groupOne = 0;
        int groupTwo = 0;
        int groupThree = 0;
        double eatenFoodAll = 0;

        for (int i = 1; i <= catsCount ; i++) {
            double food = Double.parseDouble(scanner.nextLine());

            if (food >= 100 && food <200){
                groupOne++;
                eatenFoodAll = eatenFoodAll + food;
            }else if (food >=200 && food < 300){
                groupTwo++;
                eatenFoodAll = eatenFoodAll + food;
            }else if (food >= 300 && food < 400){
                groupThree++;
                eatenFoodAll = eatenFoodAll + food;
            }



        }
        double totalEatenFoodInKg = eatenFoodAll / 1000;
        double pricePerDay = totalEatenFoodInKg * 12.45;
        //"Group 1: {броят на котките в група 1: малки котки} cats."
        //"Group 2: {броят на котките в група 2: големи котки} cats."
        //"Group 3: {броят на котките в група 3: огромни котки} cats."
        //"Price for food per day: {цената за храната} lv."
        System.out.printf("Group 1: %d cats.%n",groupOne);
        System.out.printf("Group 2: %d cats.%n",groupTwo);
        System.out.printf("Group 3: %d cats.%n",groupThree);
        System.out.printf("Price for food per day: %.2f lv.",pricePerDay);
    }
}
