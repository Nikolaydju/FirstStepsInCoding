package Exercices.Checks1;

import java.util.Scanner;

public class SummerClothes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Градусите - цяло число в интервала [10…42]
        //•	Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"


        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String sneaker = "";

        if (time.equals("Morning")){
            if (degrees >= 10 && degrees <= 18){
                outfit = "Sweatshirt";
                sneaker = "Sneakers";

            }else if (degrees > 18 && degrees <= 24){
                outfit = "Shirt";
                sneaker = "Moccasins";

            }else if (degrees >= 25){
                outfit = "T-Shirt";
                sneaker = "Sandals";
            }
        }
        if (time.equals("Afternoon")){
            if (degrees >= 10 && degrees <= 18){
                outfit = "Shirt";
                sneaker = "Moccasins";

            }else if ( degrees > 18 && degrees <= 24){
                outfit = "T-Shirt";
                sneaker = "Sandals";

            }else if (degrees >= 25){
                outfit = "Swim Suit";
                sneaker = "Barefoot";
            }
        }
        if (time.equals("Evening")){
            if (degrees >= 10 && degrees <= 18){
                outfit = "Shirt";
                sneaker = "Moccasins";

            }else if ( degrees > 18 && degrees <= 24){
                outfit = "Shirt";
                sneaker = "Moccasins";

            }else if (degrees >= 25){
                outfit = "Shirt";
                sneaker = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees, outfit, sneaker);

    }
}
