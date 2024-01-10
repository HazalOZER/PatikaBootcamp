package week4.c08_maceraOyunu;

import java.util.Scanner;

public class Player {

    private String charName;
    private String PlayerName;
    private int damage;
    private int health;
 private int originHealth;
    private int money;
    private Inventory inventory;
    private Scanner scan = new Scanner(System.in);

    public Player(String playerName) {
        this.PlayerName = playerName;
        this.inventory = new Inventory();
    }

    public void selectChar() {

        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};

        int select;

        do {
            System.out.println("-----------------------------------------------------------------");
            for (GameChar gameChar : charList) {
                System.out.println(gameChar.getId() + ". Karakter: " + gameChar.getCharName()
                        + " --> Hasar: " + gameChar.getDamage()
                        + "\tSağlık: " + gameChar.getHealth()
                        + "\tPara: " + gameChar.getMoney());
            }
            System.out.println("-----------------------------------------------------------------");
            System.out.print("Lütfen bir karakter seçiniz: ");

            select = scan.nextInt();
            System.out.println();

            switch (select) {
                case 1:
                    initPlayer(new Samurai());
                    break;
                case 2:
                    initPlayer(new Archer());
                    break;
                case 3:
                    initPlayer(new Knight());
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız lütfen tekrar deneyiniz");
            }

        } while (select != 1 && select != 2 && select != 3);

    }

    public void initPlayer(GameChar gameChar) {

        this.setCharName(gameChar.getCharName());
        this.setDamage(gameChar.getDamage());
        this.setOriginHealth(gameChar.getHealth());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());

    }

    public void printInfo() {
        System.out.println("# "+this.getCharName() + " Karakterinin Silahı: " + this.getInventory().getWeapon().getName()
                + "\tZırh: "+this.getInventory().getArmor().getName()
                + "\tBloklama: "+this.getInventory().getArmor().getBlock()
                + "\tHasarı: " + this.getTotalDamage()
                + "\tSağlığı: " + this.getHealth()
                + "\tParası: " + this.getMoney()+" #");
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getDamage() {
        return damage;
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginHealth() {
        return originHealth;
    }

    public void setOriginHealth(int originHealth) {
        this.originHealth = originHealth;
    }
}
