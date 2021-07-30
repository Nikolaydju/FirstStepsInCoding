package Exam;

import java.util.Scanner;

public class energyBooster {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
        //2.	Размерът на сета - текст с възможности: "small" или "big"
        //3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int order = Integer.parseInt(scanner.nextLine());
        double orderPrice = 0;
        double sizePrice = 0;

        if (fruit.equals("Watermelon")){
            if (size.equals("small")){
                orderPrice = 2 * 56;
                sizePrice = order * orderPrice;

            }else if (size.equals("big")){
                orderPrice = 5 * 28.70;
                sizePrice = order * orderPrice;
            }
        }else if (fruit.equals("Mango")){
            if (size.equals("small")){
                orderPrice = 2 * 36.66;
                sizePrice = order * orderPrice;
            }else if (size.equals("big")){
                orderPrice = 5 * 19.60;
                sizePrice = order * orderPrice;
            }
        }else if (fruit.equals("Pineapple")){
            if (size.equals("small")){
                orderPrice = 2 * 42.10;
                sizePrice = order * orderPrice;
            }else if (size.equals("big")){
                orderPrice = 5 * 24.80;
                sizePrice = order * orderPrice;
            }
        }else if (fruit.equals("Raspberry")){
            if (size.equals("small")){
                orderPrice = 2 * 20.00;
                sizePrice = order * orderPrice;
            }else if (size.equals("big")){
                orderPrice = 5 * 15.20;
                sizePrice = order * orderPrice;
            }
        }
        if (sizePrice >= 400 && sizePrice <= 1000){
            sizePrice = sizePrice * 0.85;
        }else if (sizePrice > 1000){
            sizePrice = sizePrice / 2;
        }
        System.out.printf("%.2f lv.",sizePrice);

    }
}
