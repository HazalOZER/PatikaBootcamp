package week1;

import java.util.Scanner;

public class C04_P_KDVTutarHesaplama {
    public static void main(String[] args) {
        //Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program yazınız.
        //Girilen tutar 0 ve 1000TL arasındaysa KDV %18 tutar 1000 TLden büyük ise KDV %8 olarak hesaplayınız

        double price, finalPrice, kdv;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Ürünün fiyatını giriniz");
        price = scan.nextDouble();

        kdv = price <= 1000 ? 0.18 : 0.08;

        finalPrice = price+ price * kdv;

        System.out.println("KDV'siz Fiyat: " + price +
                "\nKDV'li fiyat: " + finalPrice +
                "\nKDV tutarı: " + kdv*price+
                "\nUygulanan KDV oranı: "+kdv);


    }
}
