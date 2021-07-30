package Exercices.ForLoop.Forr;

import java.util.Scanner;

public class histograma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers < 200) {
               p1++;
            } else if (numbers < 400) {
                p2++;
            } else if (numbers < 600) {
                p3++;
            } else if (numbers < 800) {
                p4++;
            } else {
                p5++;
            }

        }
        //за да го направиш в проценти
        //как ще намериш 3 колко процента е от 10
        //ами делиш 3 на 10 и го умножаваш по 100
        System.out.printf("%.2f%%%n",p1 / n * 100);
        System.out.printf("%.2f%%%n",p2 / n * 100);
        System.out.printf("%.2f%%%n",p3 / n * 100);
        System.out.printf("%.2f%%%n",p4 / n * 100);
        System.out.printf("%.2f%%%n",p5 / n * 100);
    }
}
