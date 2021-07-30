package Exercices.MoreExercices.forLoop;

import java.util.Scanner;

public class hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
        //•	На следващите редове(равни на броят на дните) – броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]

        int period = Integer.parseInt(scanner.nextLine());
        int dr = 7;
        int treatedPatients = 0;
        int unTreatedPatients = 0;
        for (int i = 1; i <= period ; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (unTreatedPatients > treatedPatients) {
                    dr++;
                }
            }
                if (patients <= dr){
                    treatedPatients += patients;
                }else {
                    treatedPatients += dr;
                    unTreatedPatients = unTreatedPatients + (patients - dr);
                }
            }
            System.out.printf("Treated patients: %d.%n",treatedPatients);
            System.out.printf("Untreated patients: %d.",unTreatedPatients);

            
        }
    }

