package week4.c08_maceraOyunu;

import java.util.Scanner;

public class ToolStore extends NormalLoc {

    private Scanner scan = new Scanner(System.in);

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {

        System.out.println("Mağazaya Hoşgeldiniz");
        menu();


        return true;

    }


    public void menu() {
        int select;


        do {

            System.out.println("1-Silahlar" +
                    "\n2-Zırhlar" +
                    "\n0-Mağazadan çık");

            select = scan.nextInt();
            if(select==0){
                System.out.println("Bir daha bekleriz");
                break;
            }

            switch (select) {
               // case 0:
                 //   System.out.println("Bir daha bekleriz");
                   // break;
                case 1:
                    selectWeapon();
                    break;
                case 2:
                    selectArmor();
                    break;

                default:
                    System.out.println("Hatalı giriş yaptınız");
            }
        } while (true);
    }

    public void printWeapon() {
        System.out.println("----- Silahlar -----");
        for (Weapon x : Weapon.weapons()) {
            System.out.println(x.getId() + ". " + x.getName() + " <Hasar: " + x.getDamage() + ", Para: " + x.getPrice() + ">");
        }
    }

    public void selectWeapon() {

        int select;

        do {

            printWeapon();
            System.out.println("0. Çıkış yap");

            System.out.println("Seçiminiz: ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            Weapon selectedWeapon = Weapon.getWeaponObjByID(select);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Paranız yetersiz.");
                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiye :" + getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                }
            }

        } while (select < 1 || select > Weapon.weapons().length);

    }

    public void printArmor() {
        System.out.println("----- Zırhlar -----");
        for (Armor x : Armor.armors()) {
            System.out.println(x.getId() + ". " + x.getName() + " <Engelleme: " + x.getBlock() + ", Para: " + x.getPrice() + ">");
        }
    }

    public void selectArmor() {

        int select;

        do {

            printArmor();
            System.out.println("0. Çıkış Yap");

            System.out.println("Seçiminiz: ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            Armor selectedArmor = Armor.getArmorObjByID(select);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Paranız yetersiz.");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiye :" + getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }

        } while (select < 1 || select > Armor.armors().length);


    }
}
