package week4.c02_Static;

public class User {
    public String name;
    public static int counter = 0;

    static {
        System.out.println("Static kod bloğu");
    }//Static olduğunda bir kere çalışıyor. static olmazsa her nesne oluşturuğunda çalışıyor. Hatta ilk olarak

    public User(String name) {
        this.name = name;
        counter++;

    }
}
