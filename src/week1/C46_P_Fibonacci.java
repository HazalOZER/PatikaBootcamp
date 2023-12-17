package week1;

import java.util.Scanner;

public class C46_P_Fibonacci {
    public static void main(String[] args) {

        int request = 9, num1 = 1, num2 = 1, num3;

        Scanner scan = new Scanner(System.in); //Scanner çağırıldı.

        System.out.print("Sayı: "); //Kullanıcı ekranına mesaj yazdırıldı.
        request = scan.nextInt();//Kullanıcıdan alınan değer değişkene atandı.

        System.out.print("0, 1, ");//ilk iki basamak manuel yazdırıldı

        for (int i = 1; i < request; i++) {

            num3 = num2;
            num2 += num1;
            num1 = num3;

            System.out.print(num1 + ", ");//seri yazdırıldı
        }


    }
}
