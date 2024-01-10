package week4.c08_maceraOyunu;

public abstract class GameChar {
    //ata sınıf
    private int id;
    private String charName;
    private int damage;
    private int health;
    private int money;


    public GameChar(int id, String charName, int damage, int health, int money) {
       this.id = id;
        this.charName = charName;
        this.damage = damage;
        this.health= health;
        this.money = money;
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

    public int getId() {
        return id;
    }


    public void setMoney(int money) {
        this.money = money;
    }

}
