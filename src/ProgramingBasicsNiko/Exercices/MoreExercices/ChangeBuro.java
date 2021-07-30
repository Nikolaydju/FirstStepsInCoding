package Exercices.MoreExercices;

import java.util.Scanner;

public class ChangeBuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.
//•	На първия ред – броят биткойни. Цяло число в интервала [0…20]
//•	На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
//•	На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]
        //vhod

       int bitcoin = Integer.parseInt(scanner.nextLine());
       double uana = Double.parseDouble(scanner.nextLine());
       double Charge = Double.parseDouble(scanner.nextLine());

       double uanToDolar = uana * 0.15;
       double dolarSum = uanToDolar * 1.76;
       double totalSumLv = uanToDolar + dolarSum;
       double totalSumEu = totalSumLv * 1.95;
       double ChangeCharge = totalSumEu - (totalSumEu - 0.5);
       double result = totalSumEu - ChangeCharge;
       System.out.println(result);








    }
}
