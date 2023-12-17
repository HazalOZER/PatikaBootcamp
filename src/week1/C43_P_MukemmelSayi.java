package week1;

import java.util.Scanner;

public class C43_P_MukemmelSayi {

    public static void main(String[] args) {

       int num, total=0;//Değişken tanımlandı
        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        System.out.print("Sayı: ");//Kullanıcı ekranına mesaj yazdırıldı.

        num = scan.nextInt();// Değer kullanıcıdan alındı, Atama yapıldı.


        for (int i = 1; i < num; i++) {// birden kullanıcıdan alınan değere gelene kadar dönecek döngü oluşturuldu
            if (num%i==0){
                total +=i;//kalansız bölenler toplandı
            }
        }
        if (total ==num){//toplanan sayılar kullanıcıdan alınan değere eşit olup olmadığı değerlendirildi
            System.out.println(num + " mükemmel sayıdır.");
        }else {
            System.out.println(num + " mükemmel sayı değildir.");//Kullanıcı ekranına sonu. yazdırıldı
        }
    }
}
