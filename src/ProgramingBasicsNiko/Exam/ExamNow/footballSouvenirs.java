package examNow;

import java.util.Scanner;

public class footballSouvenirs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//•	Първият ред – отбор – текст с възможности: "Argentina", "Brazil", "Croatia", "Denmark"
//•	Вторият ред – вид сувенири – текст с възможности: "flags", "caps", "posters", "stickers"
//•	Третият ред – брой закупени сувенири – цяло число в интервала [1…200]

        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int purchasedSouvenirs = Integer.parseInt(scanner.nextLine());
        double souvenirPrice = 0;
        boolean isTrue = false;

        switch (team) {
            case "Argentina":
                switch (souvenir) {
                    case "flags":
                        souvenirPrice = purchasedSouvenirs * 3.25;
                        isTrue = true;
                        break;

                    case "caps":
                        souvenirPrice = purchasedSouvenirs * 7.20;
                        isTrue = true;
                        break;

                    case "posters":
                        souvenirPrice = purchasedSouvenirs * 5.10;
                        isTrue = true;
                        break;
                    case "stickers":
                        souvenirPrice = purchasedSouvenirs * 1.25;
                        isTrue = true;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            case "Brazil":
                switch (souvenir){
                    case "flags":


                }
        }

    }
}
