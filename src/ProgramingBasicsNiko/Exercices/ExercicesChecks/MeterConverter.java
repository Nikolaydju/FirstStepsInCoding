package Exercices.ExercicesChecks;

import java.util.Scanner;

public class MeterConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vhod
        //•	Първи ред: число за преобразуване - реално число
        //•	Втори ред: входна мерна единица - текст
        //•	Трети ред: изходна мерна единица (за резултата) - текст
        double convertNum = Double.parseDouble(scanner.nextLine());
        String measurementUnitIn = scanner.nextLine();
        String measurementUnitOut = scanner.nextLine();

        //1 meter (m)	1000 millimeters (mm)
        //1 meter (m)	100 centimeters (cm)
       // prevrushtame input v metri

        if (measurementUnitIn.equals("cm")) {
            convertNum = convertNum / 100;
        }else if (measurementUnitIn.equals("mm")) {
            convertNum = convertNum / 1000;

            }
            if (measurementUnitOut.equals("cm")) {
                convertNum = convertNum * 100;
            }else if (measurementUnitOut.equals("mm")) {
                convertNum = convertNum * 1000;
            }
            System.out.printf("%.3f",convertNum);


            }
        }






