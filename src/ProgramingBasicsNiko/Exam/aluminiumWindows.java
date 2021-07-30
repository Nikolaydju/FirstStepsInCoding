package Exam;

import java.util.Scanner;

public class aluminiumWindows {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int windowCount = Integer.parseInt(scanner.nextLine());
        String kindWindow = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;

        if (windowCount < 10) {
            System.out.print("Invalid order");
        }
        if (kindWindow.equals("90X130")) {
            if (windowCount >= 30 && windowCount <= 60) {
                price = windowCount * 110;
                price = price - (price * 0.05);

            } else if (windowCount > 60) {
                price = windowCount * 110;
                price = price - (price * 0.08);
            }
        }
        if (kindWindow.equals("100X150")) {
            if (windowCount >= 40 && windowCount <= 80) {
                price = windowCount * 140;
                price = price - (price * 0.06);

            } else if (windowCount > 80) {
                price = windowCount * 140;
                price = price - (price * 0.10);
            }
        }
        if (kindWindow.equals("130X180")) {
            if (windowCount >= 20 && windowCount <= 50) {
                price = windowCount * 190;
                price = price - (price * 0.07);

            } else if (windowCount > 50) {
                price = windowCount * 190;
                price = price - (price * 0.12);
            }
        }
        if (kindWindow.equals("200X300")) {
            if (windowCount >= 25 && windowCount <= 50) {
                price = windowCount * 250;
                price = price - (price * 0.09);

            } else if (windowCount > 50) {
                price = windowCount * 250;
                price = price - (price * 0.14);
            }
        }
        if (delivery.equals("With delivery")) {
            price = price + 60;
        } else if (delivery.equals("Without delivery")) {
            price = price;

        }
        if (windowCount > 99) {
            price = price - (price * 0.04);
        }
        System.out.printf("%.2f BGN", price);
    }
}