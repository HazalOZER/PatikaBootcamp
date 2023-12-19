package week2;

import java.util.Scanner;

public class C08_P_hesapMakinesi {

    static void sum() {

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayı: ");
        int num1 = scan.nextInt();

        System.out.print("İkinci sayı: ");
        int num2 = scan.nextInt();

        System.out.println("Toplam: " + (num1 + num2));
    }

    static void minus() {

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayı: ");
        int num1 = scan.nextInt();

        System.out.print("İkinci sayı: ");
        int num2 = scan.nextInt();

        System.out.println("Çıkarma: " + (num1 - num2));
    }

    static void times() {

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayı: ");
        int num1 = scan.nextInt();

        System.out.print("İkinci sayı: ");
        int num2 = scan.nextInt();

        System.out.println("Çarpma: " + (num1 * num2));
    }

    static void divided() {

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayı: ");
        double num1 = scan.nextInt();

        System.out.print("İkinci sayı: ");
        double num2 = scan.nextInt();

        if (num2 != 0)
            System.out.println("Bölme: " +  (num1 / num2));
        else
            System.out.println("İkinci sayı 0 olamaz!");
    }

    static void power() {

        Scanner scan = new Scanner(System.in);

        int result;

        System.out.print("Sayı: ");
        int num1 = scan.nextInt();

        System.out.print("Üs: ");
        int num2 = scan.nextInt();
        result = num1;

        for (int i = 1; i < num2; i++) {
            result *= num1;
        }
        System.out.println(num1 + " üssü " + num2 + ": " + result);

    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı: ");
        int num = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(num + " faktöriyel: " + result);
    }

    static void mod() {

        Scanner scan = new Scanner(System.in);

        int result;

        System.out.print("İlk sayı: ");
        int num1 = scan.nextInt();

        System.out.print("İkinci sayı: ");
        int num2 = scan.nextInt();

        result = num1 % num2;

        System.out.println(num1 + " sayısının " + num2 + " sayısına bölümünden kalan: " + result);

    }

    static void rectangle() {

        Scanner scan = new Scanner(System.in);

        int area, perimeter;

        System.out.print("Kısa kenar uzunluğu: ");
        int a = scan.nextInt();

        System.out.print("Uzun kenar uzunluğu: ");
        int b = scan.nextInt();

        area=a*b;
        perimeter=2*(a+b);
        System.out.println("Dikdörtgenin alanı: "+area
        +"\nDikdörtgenin Çevresi: "+perimeter);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma işlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        do {
            System.out.print("Yapmak İstediğiniz işlemi seçiniz: ");
            select = scan.nextInt();


            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Hesap makinesi kapanıyor. Tekrar bekleriz.");

            }
        } while (select != 0);


    }
}
