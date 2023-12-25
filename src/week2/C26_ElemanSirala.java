package week2;

import java.util.Arrays;
import java.util.Scanner;

public class C26_ElemanSirala {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        System.out.print("Dizi kaç elemanlı olsun? :");// kullanıcı ekranına mesaj yazdırıldı

        int n = scan.nextInt();//Değişken tanımlandı, kullanıcıdan alınan veri değişkene atandı

        int[] arr = new int[n];// array tanımlandı

        for (int i = 0; i < n; i++) {

            System.out.print((i+1) + ". eleman :");// kullanıcı ekranına mesaj yazdırıldı
            arr[i] = scan.nextInt();// 0. indeksten n-1. indeksteki elamana kadar kullanıcıdan giriş alındı, her bir indekse ilgili değer atandı
        }

        Arrays.sort(arr);//Array küçükten büyüğe  sıralandı
        System.out.println("Sıralama: "+Arrays.toString(arr));//Array toString metoduyla yazdırıldı

    }
}
