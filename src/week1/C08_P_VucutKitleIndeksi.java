
/*Kullanıcıdan alınan verilerle VKİ hesaplayan program
* VKİ formülü: Kilo (kg)/Boy (m)*Boy (m)*/

package week1;

import java.util.Scanner;

public class C08_P_VucutKitleIndeksi {

    public static void main(String[] args) {

        double height,weight,vki;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        weight= scan.nextDouble();

        System.out.print("Lütfen boyunuzu cm cinsinden giriniz: "); // metre cinsine kod aracılığıyla çevrilecektir.
        height= scan.nextDouble();

        height/=100;// double değerleri kullanıcıdan alırken virgül ile almamız gerekmektedir.
                    // Kullanıcı hatalı giriş yapmasına karşın (virgül yerine nokta) önlem almak adına,
                    // kullanıcıya bilgi vermek yerine cm cinsinden istedim.
                    //metre dönüşümünü kod içerisinde sağladım

        vki=weight/(height*height);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);


    }
}
