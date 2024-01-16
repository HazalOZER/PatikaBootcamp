package week5.c16_P_KitapSiralayici;

import java.util.Comparator;

public class OrderNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}//İsme göre sıralama
