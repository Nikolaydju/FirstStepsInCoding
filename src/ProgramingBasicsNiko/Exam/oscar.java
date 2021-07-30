package Exam;

import java.util.Scanner;

public class oscar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        //•	Статуетки  – цената им е 30% по-малка от наема на залата
        //•	Кетъринг – цената му е 15% по-малка от тази на статуетките
        //•	Озвучаване – цената му е 1 / 2 от цената за кетъринг
      double statui = hallRent * 0.7;
      double ketaring = statui * 0.85;
      double sound = ketaring / 2;
      double totalPrice = hallRent + statui + ketaring + sound;
        System.out.printf("%.2f",totalPrice);

    }
}
