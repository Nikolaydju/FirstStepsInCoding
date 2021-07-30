package ProgramingBasicsNiko.Exercices.ForLoop.ForLoop;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCont = Integer.parseInt(scanner.nextLine());
        double topStudents = 0;
        double goodStudents = 0;
        double badStudents = 0;
        double failStudents = 0;
        double averageScore = 0;

        for (int i = 1; i <= studentsCont; i++) {
            double examScore = Double.parseDouble(scanner.nextLine());

            if (examScore < 3) {
                failStudents++;
                averageScore = averageScore + examScore;
            } else if (examScore >= 3 && examScore <= 3.99) {
                badStudents++;
                averageScore = averageScore + examScore;
            } else if (examScore >= 4 && examScore <= 4.99) {
                goodStudents++;
                averageScore = averageScore + examScore;
            } else {
                topStudents++;
                averageScore = averageScore + examScore;
            }

        }
        double totalAverageScore = averageScore / studentsCont;

        System.out.printf("Top students: %.2f%%%n", topStudents / studentsCont * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodStudents / studentsCont * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", badStudents / studentsCont * 100);
        System.out.printf("Fail: %.2f%%%n", failStudents / studentsCont * 100);
        System.out.printf("Average: %.2f", totalAverageScore);


    }
}
