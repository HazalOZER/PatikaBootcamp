package week5.c16_P_KitapSiralayici;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> booksSortedByName = new TreeSet<>(new OrderNameComparator());//TreeSet oluşturuldu,İsme göre sıralandı

        booksSortedByName.add(new Book("Harry Potter ve Felsece Taşı", 134, "J.K.Rowling", 1997));
        booksSortedByName.add(new Book("Harry Potter ve Sırlar Odası", 287, "J.K.Rowling", 1998));
        booksSortedByName.add(new Book("Harry Potter ve Azkaban Tutsağı", 347, "J.K.Rowling", 1999));
        booksSortedByName.add(new Book("Harry Potter ve Ateş Kadehi", 423, "J.K.Rowling", 2000));
        booksSortedByName.add(new Book("Harry Potter ve Zümrüdüanka Yoldaşlığı", 794, "J.K.Rowling", 2003));
        booksSortedByName.add(new Book("Harry Potter ve Melez Prens", 646, "J.K.Rowling", 2005));
        booksSortedByName.add(new Book("Harry Potter ve Olüm Yadigarları", 429, "J.K.Rowling", 2007));
        //Nesneler Oluşturuldu, sete eklendi

        TreeSet<Book> booksSortedByPage = new TreeSet<>(new OrderPageComparator());//treeset oluşturuldu, Sayfa Sayısına göre  sıralandı
        booksSortedByPage.addAll(booksSortedByName);// isme göre sıralanmış set yeni setimize eklendi

        for (Book book : booksSortedByName) {
            System.out.println(book.getName());
        }//isme göre sıralanmış set foreach ile yazdırıldı
        System.out.println("-------------------------------------");
        for (Book book : booksSortedByPage) {
            System.out.println(book.getName());
        }//Sayfa sayısına göre yazdırılmış set foreach ile yazdırıldı


    }
}
