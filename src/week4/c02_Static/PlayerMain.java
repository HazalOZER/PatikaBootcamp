package week4.c02_Static;

public class PlayerMain {
    public static void main(String[] args) {

        System.out.println(Player.count);// hiçbir nesne oluşturmadan sınıf ismiyle çağırılır


        Player p1 = new Player("Hazal",123);
        p1.login();
        System.out.println(Player.count);
        Player p2 = new Player ("Kamil",12);
        p2.login();
        System.out.println(Player.count);
        Player p3 = new Player("Fatih",1);
        p3.login();
        System.out.println(Player.count);

        p1.showName();
    }
}
