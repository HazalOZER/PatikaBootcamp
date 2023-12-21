package week2;

import java.util.Scanner;

public class C10_P_asalSayi {

    static boolean isPrime(int num, int num2) {


        if (num <= 0) {//Sayının pozitif olup olmadığı değerlendirilmesi yapıldı

            System.out.println("Asal sayılar sadece kendisine ve 1 sayısına kalansız bölünebilen 1'den büyük pozitif tam sayılardır. " +
                    "\nNegatif sayılar asal sayı değildir.");//negatif sayı giren kullanıcı ekranına mesaj verildi
            System.out.println(num + " sayısı asal bir sayı değildir.");//asal sayı olmadığı bilgisi verildi
            return false;//yanlış değeri döndürüldü

        } else {

            if (num == 2) {//sayının 2 sayısına eşitliği değerlendirildi

                System.out.println(num + " sayısı asal bir sayıdır.");//Kullanıcı ekranına mesaj yazdırıldı
                return true;//doğru değeri döndürüldü

            } else if (num % num2 == 0) {//sayının bölen sayısına bölümünden kalanı değerlendirildi

                System.out.println(num + " sayısı asal bir sayı değildir.");//Kullanıcı ekranına mesaj yazdırıldı
                return false;//yanlış değeri döndürüldü

            } else if (num / num2 <= 2) {//sayının bölünebilecek en küçük sayıdan daha küçük olması durumu değerlendirildi

                System.out.println(num + " sayısı asal bir sayıdır.");//Kullanıcı ekranına mesaj yazdırıldı
                return true;//doğru değeri döndürüldü

            }

            return isPrime(num, num2 + 1);//if bloklarına girene kadar bölen sayısını 1 arttıran recursive metot
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        System.out.print("Sayı: ");//Kullanıcı ekranına talep yazdırıldı
        int num = scan.nextInt();//Değişken tanımlandı ve kullanıcıdan alınan değer değişkene atandı.

        isPrime(num, 2);//metod çağırıldı

    }
}
