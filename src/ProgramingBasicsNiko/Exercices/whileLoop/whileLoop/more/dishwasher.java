package ProgramingBasicsNiko.Exercices.whileLoop.whileLoop.more;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class dishwasher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 //Брой бутилки от препарат, който ще бъде използван за миенето на чинии - цяло число в интервала [1…10]
        int bottles = parseInt(scanner.nextLine());
        String dishes;


        int totalDetergent = bottles * 750;
        int plates = 5;
        int pot = 15;
        int platesClean = 0;
        int potsClean = 0;
        int counter = 0;

      while (totalDetergent >= 0){
          dishes = scanner.nextLine();
          if (dishes.equals("End")){
              break;
          }
          counter++;
          if (counter % 3 == 0) {
              totalDetergent -= (parseInt(dishes) * pot);
              potsClean += parseInt(dishes);
          } else {
              totalDetergent = totalDetergent - (parseInt(dishes) * plates);
              platesClean += parseInt(dishes);
          }
      }
        if (totalDetergent >= 0) {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.", platesClean, potsClean, totalDetergent);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(totalDetergent));

      }



    }
}
