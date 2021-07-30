package Exercices.whileLoop;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int houseSize = width * length * height;

        String input = scanner.nextLine();

        int boxSum = 0;
        while (!input.equals("Done")){
            int box = Integer.parseInt(input);

            boxSum = boxSum + box;

            if (boxSum >= houseSize){
                break;
            }

            input = scanner.nextLine();


        }
        int diff = Math.abs(houseSize - boxSum);
       if (boxSum < houseSize){
           System.out.printf("%d Cubic meters left.",diff);

       }else {
           System.out.printf("No more free space! You need %d Cubic meter more,",diff);
       }

    }
}
