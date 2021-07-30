package Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        int scoredGoals = 0;
        String player = "";



        while (!name.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > scoredGoals){
                player = name;
                scoredGoals = goals;
            }
            if (scoredGoals >= 10){
                break;
            }

            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n",player);
        if (scoredGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",scoredGoals);

        }else {
            System.out.printf("He has scored %d goals.",scoredGoals);
        }



    }
}
