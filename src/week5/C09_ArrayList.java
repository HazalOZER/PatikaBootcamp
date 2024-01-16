package week5;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C09_ArrayList {
    //Sıralanmıştır. Girildiği gibi
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(null);
        list.add(5);
        list.add(5);
        list.add(-15);

        //3 farklı yazdırma yöntemi var

        //iterator ile yazdırma

        Iterator <Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //sout ike yazdırma

        System.out.println(list);//[10, 5, null, -15] iteratore bile gerek kalmadan

        //foreach ile yazdırma
        for (Integer  element:list) {
            System.out.println(element);
        }

        System.out.println(list.size());

        System.out.println(list.get(0));//indexdeki değeri döndürür

        System.out.println(list.indexOf(5));//ilk index

        System.out.println(list.lastIndexOf(5));//son index

        list.add(2,3);//2. index ve sonrasını bir kaydırıp 2. indexe 3 değerini ekledi
        System.out.println(list);

        list.set(3,5);
        System.out.println(list);//3. indexteki değeri 5 yaptı

        System.out.println(list.contains(10));//true- var mı yok mu kontrol

        list.remove(3);//3. indexi sildi
        System.out.println(list);

        list.remove((Integer) 3);//3 değerini sildi
        System.out.println(list);

        //String bir arrray üzerinde örnek
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Ankara");
        stringList.add("İstanbul");
        stringList.add("Bursa");
        stringList.add("Antalya");
        stringList.add("Bolu");
        stringList.add("Isparta");
        stringList.add("Muğla");

        stringList.add(2,"İzmir");

        stringList.set(5,"Siirt");
        System.out.println(stringList);

        String removeElement= stringList.remove(5);
        System.out.println("Silinen eleman "+removeElement );
        System.out.println(stringList);

        stringList.remove("Bursa");
        System.out.println(stringList);

       List <String> liste2 = new ArrayList<>();
       liste2.addAll(stringList);
        System.out.println("Liste 2: "+liste2);
        liste2.add("Bursa");
        System.out.println(liste2);
       // liste2.clear();// her şeyi temizler
        liste2=stringList.subList(2,5);//alt lise,2. indexten başlayıp 5. indekse kadar
        System.out.println(liste2);
        String[] str= liste2.toArray(new String[0]);//array yapıyor
        System.out.println(str[2]);


    }
}
