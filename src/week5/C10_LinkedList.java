package week5;

import java.util.Iterator;
import java.util.LinkedList;

public class C10_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(15);
        list.add(5);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        list.remove();//ilk indexsi siliyor
        System.out.println(list);
        list.remove(1);//1. indexsi siliyor
        System.out.println(list);
        list.remove((Integer) 5);//5 sayısını siliyor
        System.out.println(list);

        list.add(5);
        list.add(5);
        list.add(3);
        list.add(45);
        list.add(-14);
        System.out.println("-----");
        for (Integer i:list) {
            System.out.println(i);
        }

//ArrayListlerle aynı işlevi görüyor ama Araya eleman eklemek gerekirse daha azz maliyetli
    }
}
