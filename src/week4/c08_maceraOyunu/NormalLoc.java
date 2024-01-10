package week4.c08_maceraOyunu;


public class NormalLoc extends Location{
    public NormalLoc(Player player,String name) {
        super(player,name);
    }

    @Override
  public   boolean onLocation() {
        return true;
    }
}
