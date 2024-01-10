package week4.c08_maceraOyunu;

import java.util.Scanner;

public class Game {
    Player player;

    private Scanner scan = new Scanner(System.in);

    public void start() {

        System.out.println("Macera Oyununa Hoşgeldiniz!");
        System.out.print("Sana nasıl hitap etmemizi istersin? :");
        String playerName = scan.nextLine();
        this.player = new Player(playerName);
        System.out.println();
        System.out.println("Merhaba " + this.player.getPlayerName() + " seni aramızda görmek çok güzel");
        System.out.println();
        System.out.println("Karakterler");

        this.player.selectChar();
        selectLocation();

    }

    public void selectLocation() {
        Location location = null;
        int select;
        do {
            player.printInfo();
            System.out.println();

            System.out.print("1-Güvenli ev" +
                    "\n2-Dükkan" +
                    "\n3-Mağara" +
                    "\n4-Orman" +
                    "\n5-Nehir" +
                    "\n6_Maden" +
                    "\n0-Çıkış Yap" +
                    "\nLütfen gitmek istediğiniz bölgeyi seçiniz:");

            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            switch (select) {
                case 1:
                    location = new SafeHouse(player);

                    break;
                case 2:
                    location = new ToolStore(player);

                    break;
                case 3:
                    location = new Cave(player);

                    break;
                case 4:
                    location = new Forest(player);

                    break;
                case 5:
                    location = new River(player);

                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.");
            }
          if(location!=null) {
              location.onLocation();
          }

            if (player.getHealth() == 0) {
                break;
            }

        } while (true);

        System.out.println("Tekrar görüşmek üzere");
    }
}
