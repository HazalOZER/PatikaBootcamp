package week4.c08_maceraOyunu;

import java.util.Random;

public class Snake extends Obstacle {

    private Random random = new Random();
    private int damage = random.nextInt(3, 7);

    public Snake() {
        super("Yılan", 4, 5, 12,20);//////////////////////////////////////////////////////////////

    }
}
