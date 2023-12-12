package week1;

import java.util.Scanner;

public class C03_P_NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        //Matematik, Fizik, Kimya,Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortamalarını hesaplayıp ekrana bastıran program ayzdın
        //Eğer kullanıcının ortalamsı 60'dan büyük ise ekrana "Sınavı geçti", küçük ise "Sınıfta kaldı" yazsın
        // İf kullanılmayacak

        Scanner scan = new Scanner(System.in);

        double math, physics, chem,turkish, history, music, average;

        System.out.print("Lütfen matematik ders notunuzu giriniz:");
        math = scan.nextDouble();
        System.out.print("Lütfen fizik ders notunuzu giriniz:");
        physics = scan.nextDouble();
        System.out.print("Lütfen kimya ders notunuzu giriniz:");
        chem = scan.nextDouble();
        System.out.print("Lütfen türkçe ders notunuzu giriniz:");
        turkish = scan.nextDouble();
        System.out.print("Lütfen tarih ders notunuzu giriniz:");
        history = scan.nextDouble();
        System.out.print("Lütfen müzik ders notunuzu giriniz:");
        music = scan.nextDouble();

        average =(math+physics+chem+turkish+history+music)/6;

        String result= average >60 ? ("Dönem Notunuz: "+ average+ "! Tebrikler, Sınıfı Geçtiniz"):
                ("Dönem Notunuz: "+ average+ "! Üzgünüz, Sınıfta Kaldınız");
        System.out.println(result);
       }

}
