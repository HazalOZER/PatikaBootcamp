package week1;

// Girilen Km'ye göre taksimetre tutarını ekrana yazdırın
//Taksimetre Km başı 2,20 Tl tutmaktadır
//Minimum ödenecek tutar 20 TL
//Taksimetre açılış ücreti 10 TL

import java.util.Scanner;

public class C06_P_Taksimetre {

    public static void main(String[] args) {

        double km,price=2.2,finalPrice;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kaç km gittiğinizi giriniz:");

        km=scan.nextDouble();

        finalPrice=price*km;

        System.out.println(finalPrice > 20 ? ("Ödenecek tutar: " + finalPrice) : "Ödenecek tutar: 20TL");


    }
}
