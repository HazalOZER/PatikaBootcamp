

// a+b*c-b işlemini kullanıcıdan veri alarak yazdıran program


package week1;

import java.util.Scanner;

public class C12_P_AritmatikIslemler {
    public static void main(String[] args) {


        double a, b, c; //Değişkenler tanımlandı.

        Scanner scan = new Scanner(System.in); // Kullanıcıdan veri alabilmek için Scanner dahil edildi

        System.out.println("Lütfen a+b*c-b işlemi için sırayla üç farklı sayı giriniz" +
                "\nGirdiğiniz her sayı sonrası enter tuşuna basınız");

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble(); //a,b ve c değişkenleri için kullanıcıdan değer alındı

        System.out.println("İşlem sonucunuz: "+(a+b*c-b)); //Sonuç ekrana yazdırıldı.



    }
}
