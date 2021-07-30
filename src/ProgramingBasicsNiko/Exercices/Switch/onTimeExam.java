package Exercices.Checks1;

import java.util.Scanner;

public class onTimeExam {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //ървият ред съдържа час на изпита – цяло число от 0 до 23.
        //•	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
        //•	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
        //•	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());

        //prevrushtame vsichko v min

        int examTime = hourExam * 60 + minExam;
        int arrivedTime = arriveHour * 60 + arriveMin;
        String output = "";
        String output2 = "";
        int difference = 0;
        //Early
        if (arrivedTime < examTime - 30){
            output = "Early";
            difference = examTime - arrivedTime;
            if (difference < 60){
                output2 = String.format("%d minutes before the start",difference);
            }else {
                int hour = difference / 60;
                int mins = difference % 60;
                output2 = String.format("%d:%02d hours before the start",hour,mins);
            }

            //On time
        }else if (arrivedTime <= examTime){

            output = "On time";
            difference = examTime - arrivedTime;
            output2 = String.format("%d minutes before the start",difference);
            //Late

        }else if (arrivedTime > examTime){
            output = "Late";
            difference = arrivedTime - examTime;
            if (difference < 60){
                output2 = String.format("%d minutes after the start",difference);
            }else {
                int hour = difference / 60;
                int mins = difference % 60;
                output2 = String.format("%d:%02d hours after the start",hour,mins);
            }



        }
        System.out.println(output);
        System.out.println(output2);










    }
}
