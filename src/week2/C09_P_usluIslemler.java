package week2;

import java.util.Scanner;

public class C09_P_usluIslemler {
    static int uslu(int base, int exp) {

        int result = base;// sonuç değişkeni tanımlandı
        result *= base;//sonuç değişkeni sayıyla çarpıldı

        if (exp == 1)//üssün bir olması durumunda yineleme durduruldu
            return base;//sayının dönüşü sağlandı

        return uslu(base, (exp - 1)) * base;//üslü formülü
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        System.out.println("Sayı: ");//Kullanıcı ekranına mesaj yazdırıldı
        int base = scan.nextInt();//Kullanıcıdan alınan değer atandı

        System.out.println("Üs: ");//Kullanıcı ekranına mesaj yazdırıldı
        int exp = scan.nextInt();//Kullanıcıdan alınan değer atandı

        System.out.println(uslu(base, exp));//metot çağırıldı ve yazdırıldı
    }
}
