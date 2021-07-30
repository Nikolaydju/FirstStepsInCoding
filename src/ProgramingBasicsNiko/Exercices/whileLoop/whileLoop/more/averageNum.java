package ProgramingBasicsNiko.Exercices.whileLoop.whileLoop.more;

import java.util.Scanner;

public class averageNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <=n ; i++) {
            double newNum = Double.parseDouble(scanner.nextLine());

            total = total + newNum;


        }
        double totalNum = total / n;
        System.out.printf("%.2f",totalNum);
    }
}
