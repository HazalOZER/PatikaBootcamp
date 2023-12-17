package week1;

import java.util.Scanner;

//tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

public class C33_P_CiftSayi {
    public static void main(String[] args) {

        int total = 0;
        int num;
        boolean isNotOdd = true;

        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Sayı: ");
            num = scan.nextInt();

            if (num % 2 == 1) {
                isNotOdd = false;

            } else {
                if (num % 4 == 0) {
                    total += num;
                }

            }

        } while (isNotOdd);

        System.out.println("Sayıların toplamı: " + total);

    }
}
