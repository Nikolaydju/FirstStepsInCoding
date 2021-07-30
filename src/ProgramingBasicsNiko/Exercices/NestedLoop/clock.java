package Exercices.NestedLoop;

public class clock {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {
            for (int minutes = 0; minutes <= 59; minutes++) {

                System.out.printf("0%d:0%d%n",hour,minutes);

            }
            
        }
    }
}
