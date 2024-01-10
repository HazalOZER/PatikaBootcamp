package week4.c08_maceraOyunu;

public class SafeHouse extends NormalLoc{
    SafeHouse (Player player){
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {

        getPlayer().setHealth(getPlayer().getOriginHealth());
        System.out.println("Güvenli evdesiniz. Canınız yenilendi."
        +"\nCanınız: "+getPlayer().getHealth());

        return true;
    }
    public boolean isFinish(){
        getPlayer().getInventory();
        return false;
    }

}
