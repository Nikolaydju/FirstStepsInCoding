package Exercices.MoreExercices;

import java.util.Scanner;

public class Architec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//1.	Името на архитекта - текст
//2.	Брой на проектите - цяло число в интервала [0… 100

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        //Presmqtaniq
        int NeededHours = projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,NeededHours,projects);



        //Изход
        //На конзолата се отпечатва:
        //•	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."

    }
}
