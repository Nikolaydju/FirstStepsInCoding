package Exam;

import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());
        boolean isNominated = false;
        //For Loop po broq na jurito
        for (int i = 0; i < juryCount; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            //дължината на името на оценяващия умножено по точките, които дава делено на две.
            academyPoints = academyPoints + (judgeName.length() * judgePoints / 2);
            // Ako резултатът ж някой момент надхвърли 1250.50
            if (academyPoints > 1250.50) {
                isNominated = true;
                break;
            }
        }
            if (isNominated) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academyPoints);
            } else {
                System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.50 - academyPoints);
            }
        }
    }

