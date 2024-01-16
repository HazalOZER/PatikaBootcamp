package week5;

import java.util.Vector;

public class C11_Vector {
    public static void main(String[] args) {

        Vector <String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");

        vector.add(1,"Ordu");
        System.out.println(vector);
        System.out.println(vector.contains("Bursa"));

        //iterator de kullanılıyor
        //foreach kullanılıyor
        
    }
}
