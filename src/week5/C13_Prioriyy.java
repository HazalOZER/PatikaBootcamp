package week5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class C13_Prioriyy {
    public static void main(String[] args) {
        PriorityQueue<String > q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }/*.reversed()*/);//reversed ters çevrilir

        //Linkedlardan farklı sıralabiliyor olması

        q.add("Fatih");
        q.add("Kamil");
        q.add("Ali");
        q.add("Ayten");

        System.out.println("İlk eleman yazdırıp silinecek: "+q.poll()); //q.remove() yazdırmaz. direkt siler boolean değer döner
        System.out.println("İlk eleman durur: "+q.peek());
        System.out.println("İlk elemen: "+q.element());
        System.out.println("------------");
        for (String s:q ) {
            System.out.println(s);
        }
        System.out.println("-----------");
        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
