package week5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class C12_Queue {
    //LinkedList list sınıfından üretilirse list gibi davranır Queue sınıfından üretilirse queue gibi davranır
    //queue-Kuyruk-Fifo normali ama lifo olarak da kullanılabilir
    //element()-kuyruğun başındaki eleman,
    //add(Eleman)-eleman kuyruğa eklenir. Başarısız işlem hata fırlatır
    //offer(eleman)- eleman kuyruğa eklenir.Başarısız olursa NULL döner
    //poll()- Kuyruğun başındaki elemanı kuyruktan çıkartır.
    //peek()-Kuyrukta sıradaki elemana ulaşmak için kullanırlır

    public static void main(String[] args) {
        //Polimorfizm-polimorphism-Çok Biçimlilik
        Queue<String> q = new LinkedList<>();
        q.add("Silinecek");
        q.add("Fatih");
        q.add("Kamil");
        q.offer("Altun");
        q.add("Test");
        q.add("Ekibi");
        q.remove();//İlk veriyi siler
        q.remove("Altun");//Veriyi bulup siler
        //q.remove(0);//İndex almaz

        System.out.println("Sıranın ilk elemanı. Silmeden bırakıyor: "+q.peek());
        System.out.println("Sıranın ilk elemanı silinecek: "+q.poll());

        System.out.println("----------");
        Iterator<String> itr = q.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------");
        System.out.println("İlk eleman: "+q.element());
    }
}
