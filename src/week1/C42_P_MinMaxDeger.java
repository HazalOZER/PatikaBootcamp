package week1;

import java.util.Scanner;

public class C42_P_MinMaxDeger {
    public static void main(String[] args) {

        int request, num1, min = 0, max = 0;//Değişkenler tanımlandı.

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı.

        System.out.print("Kaç tane tamsayı gireceksiniz?: "); //Kullanıcı ekranına mesaj yazdırıldı
        request = scan.nextInt();//Talep alındı

        System.out.print( "1. sayı: ");
        num1 = scan.nextInt();//İlk sayı döngü dışında alındı
        max=num1;
        min = num1;//ilk sayı min max değere atandı

        for (int i = 2; i <= request; i++) {

            System.out.print(i + ". sayı: ");
            num1 = scan.nextInt();


            if (num1 >= max) {//karşılaştırma yapılıyor
                max = num1;

            } else if(num1<=min) {
                min = num1;
            }

        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);//sonuç yazdırıldı

        }
    }

