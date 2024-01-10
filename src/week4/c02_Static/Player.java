package week4.c02_Static;

public class Player {
    public String name;
    public  int id;
    public static String game = "Cs";
    public static int count =0 ;

    public Player (String name, int id){
        this.name=name;
        this.id = id;

    }
     public  void login(){
        count++;
     }

     public static void showName(){
         //System.out.println(this.name);//Static metot içerisinde static olmayan metot kullanılmaz
         //this. kullanılmaz
         //System.out.println(this.count); Hatalı kullanım

         Player p1 = new Player("Ali",456);
         System.out.println(p1.name);
         System.out.println(count);//doğru kullanım
         System.out.println(Player.count);//doğru kullanım
     }
}
