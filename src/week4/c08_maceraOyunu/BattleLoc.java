package week4.c08_maceraOyunu;

import java.util.Random;

public class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstracle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstracle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstracle = maxObstracle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Buradasınız: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsNumber + " " + this.getObstacle().getName() + " yaşıyor");
        System.out.print("<S>avaş veya <K>aç");
        String select = scan.nextLine();
        select = select.toUpperCase();
        if (select.equals("S")) {
            System.out.println("Savaş başlatılıyor. Silahları Kuşan!!");
            if (this.combat(obsNumber)) {
                System.out.println(this.getName() + " canavarlardan temizlendi");
                return true;
            }
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz");
            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber) {

        for (int i = 0; i < obsNumber; i++) {

            getObstacle().setHealth(getObstacle().getOriginalHealth());

            getPlayer().printInfo();
            obstacleStarts(i);
            while (getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println("<V>ur veya <K>aç");
                String select = scan.nextLine().toUpperCase();
                if (select.equals("V")) {
                    System.out.println("Siz vurdunuz.");
                    this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println("Canavar size vurdu!");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();

                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }

                }else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                System.out.println("Canavarı yendiniz!");
                System.out.println(this.getObstacle().getAward()+" para kazandınız.");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
                System.out.println("Güncel paranız: "+this.getPlayer().getMoney());
            }else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " canı: " + this.getObstacle().getHealth());
        System.out.println();
    }


    public void obstacleStarts(int i) {
        System.out.println((i+1) + ". " + this.getObstacle().getName() + " Değerleri" +
                "\n---------------"+
                "\nSağlık: " + this.getObstacle().getHealth() +
                "\tHasar: " + this.getObstacle().getDamage());
    }

    public int randomObstacleNumber() {
        Random random = new Random();
        return random.nextInt(this.getMaxObstracle()) + 1;

    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstracle() {
        return maxObstracle;
    }

    public void setMaxObstracle(int maxObstracle) {
        this.maxObstracle = maxObstracle;
    }
}
