package Exercices.NestedLoop;

import java.util.Scanner;

public class ticketsCinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalTickets = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;

        while (true) {
            String movie = scanner.nextLine();
            if (movie.equals("Finish")) {
                break;
            }
            int capacity = Integer.parseInt(scanner.nextLine());  // 10

            int countTicketOneMovie = 0;
            int countFreeSeats = capacity;

            while (countFreeSeats > 0){
                String type = scanner.nextLine();

                if (type.equals("End")){
                    break;
                }
                switch (type){
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":{
                            kidCount++;
                            break;
                        }
                }
                countFreeSeats--;
                countTicketOneMovie++;

            }
            totalTickets = totalTickets + countTicketOneMovie;

            double percentTakeSeats = (countTicketOneMovie * 1.0) / capacity * 100;
            System.out.printf("%s - %.2f%% full.%n",movie,percentTakeSeats);
        }
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",studentCount * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n",standardCount * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n",kidCount * 1.0 / totalTickets * 100);
    }
}
