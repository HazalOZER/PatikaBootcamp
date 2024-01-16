package week5;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class C07_LinkedHashSet {
    //Hashsetlerin alt sınıfı
    //hashsetlerden farkı giren değerler çıkan değerlerle eşit
    //çift bağlantılı liste
    //bir önceki ve bir sonraki elemanın yerini tutar
    public static void main(String[] args) {
        LinkedHashSet <Integer> lSet= new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(15);
        lSet.add(4);
        lSet.add(85);
        lSet.add(15);

        //Girdiğimiz sıraula veriyor ama aynı sayıyı(15) tekrar yazdırmıyor

        Iterator<Integer> itr = lSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
