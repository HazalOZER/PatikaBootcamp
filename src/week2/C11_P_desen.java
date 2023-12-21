package week2;

import java.util.Scanner;

public class C11_P_desen {

    static int desen(int num, int again, boolean isDecreasing) {

        if (again > 0 && isDecreasing) { //kontrol sayısı 0dan büyükse ve eksiltme aktifse çalıştırıldı

            System.out.print(again + " ");//sayı ekrana yazıldı

            return desen(num, again - 5, true);//Kontorl sayısı azaltırılarak metod çağırıldı

        } else {

            if (again <= num) {//Kontrol sayısı sayıdan küçükse çalıştırıldı

                System.out.print(again + " ");//sayı ekrana yazıldı

                return desen(num, again + 5, false);//Kontrol sayısı arttırılarak metod çağırıldı
            }
        }
        if (num == again) {//kontrol sayısı girilen sayı ekrana eşitse çalıştırıldı

            System.out.print(again + " ");//sayı ekrana yazıldı
        }
        return num;   //num döndü
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        System.out.print("Sayı: ");//Kullanıcı ekranına mesaj yazdırıldı.
        int a = scan.nextInt();//Değişken tanımlandı.Kullanıcıdan alınan değer değişkene atandı

        desen(a, a, true);//Metod çağırıldı
    }
}
