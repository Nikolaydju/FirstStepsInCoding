package Exercices.FirstStepsInCoding;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Vhod
        //1.	Името на архитекта - текст
        //2.	Брой на проектите - цяло число в интервала [0… 100]

        String name = scanner.nextLine();
     int project = Integer.parseInt(scanner.nextLine());
     int totalTime = project * 3;
     System.out.println("The architect "+ name + " will need " +  totalTime + " hours to complete "+  project + " project/s.");




    }
}
