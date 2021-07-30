package ProgramingBasicsNiko.Exercices.ForLoop.ForLoop;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

         //Капацитетът на стадиона – цяло число в интервала [1 … 10000];
        //Броят на всички фенове – цяло число в интервала [1 … 10000].

        double stadionCapacity = Double.parseDouble(scanner.nextLine());
        double fansCount = Double.parseDouble(scanner.nextLine());
        int fansA = 0;
        int fansB = 0;
        int fansV = 0;
        int fansG = 0;

        for (int i = 1; i <= fansCount ; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")){
                fansA++;
            }else if (sector.equals("B")){
                fansB++;
            }else if (sector.equals("V")){
                fansV++;
            }else if (sector.equals("G")){
                fansG++;
            }
            
        }
//Процентът на феновете в сектор А
//Процентът на феновете в сектор Б
//Процентът на феновете в сектор В
//Процентът на феновете в сектор Г
//Процентът на всички фенове, спрямо капацитета на стадиона.
        System.out.printf("%.2f%%%n",(fansA / fansCount) * 100);
        System.out.printf("%.2f%%%n",(fansB / fansCount) * 100);
        System.out.printf("%.2f%%%n",(fansV / fansCount) * 100);
        System.out.printf("%.2f%%%n",(fansG / fansCount) * 100);
        System.out.printf("%.2f%%",(fansCount / stadionCapacity) * 100);

        

    }
}
