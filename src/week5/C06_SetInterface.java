package week5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class C06_SetInterface {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);//Tekrar eden sayıyı vermiyor
        hSet.add(30);
        hSet.add(null);
        for (Integer a:hSet) {
            System.out.println( a);
        }
        //Sıralama kendi ürettiği hashe göre sıralama yapıyor
        //Aynı çıkma ihtimali düşük
        System.out.println("Boyut: "+hSet.size());//null ı saymadı
        System.out.println(hSet.isEmpty());
        System.out.println(hSet.contains(2));//
        hSet.remove(10);//sil
        System.out.println(hSet.contains(10));
       // hSet.clear();
        System.out.println(hSet.isEmpty());

        Iterator <Integer> itr = hSet.iterator();

        while ( itr.hasNext()){
            System.out.println(itr.next());
        }





    }
}
