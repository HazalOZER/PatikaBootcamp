package week5.c16_P_KitapSiralayici;

import java.util.Comparator;

public class OrderPageComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getPage() - b2.getPage();
    }
}//Sayfa sayısına göre sıralama
