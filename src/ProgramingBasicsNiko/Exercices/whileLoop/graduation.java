package Exercices.whileLoop;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int count = 1;
        int excluded = 0;
        double totalSum = 0;
        while (count <= 12){
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.0){
                excluded++;
            }else {
                count++;
            }
            if (excluded > 1){

                break;
            }
            totalSum = totalSum + grade;

        }
        double average = totalSum / 12;
        if (excluded > 1){
            System.out.printf("%s has been excluded at %d grade",name,count);
        }else
        System.out.printf("%s graduated. Average grade: %.2f",name,average);

    }
}
