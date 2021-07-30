package Exercices.Checks;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class FigureArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Figure = scanner.nextLine();
        double result = 0.0;

        if (Figure.equalsIgnoreCase("square")) {
            //TODO a*b
            double a = Double.parseDouble(scanner.nextLine());
           result = a * a;

        } else if (Figure.equalsIgnoreCase("rectangle")) {
            //TODO a*b
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
           result = a * b;

        } else if (Figure.equalsIgnoreCase("circle")) {
            //TODO pi * r*r
            double r = Double.parseDouble(scanner.nextLine());
           result = Math.PI * (Math.pow(r, 2));

        } else if (Figure.equalsIgnoreCase("triangle")) {
            //TODO a * ha/2
            double a = Double.parseDouble(scanner.nextLine());
            double ha = Double.parseDouble(scanner.nextLine());
             result = a * ha / 2;

        }
        System.out.printf("%.3f",result);
    }
}
