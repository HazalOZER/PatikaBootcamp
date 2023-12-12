package week1;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;
        System.out.println("a için değer giriniz");
        a= scan.nextInt();
        System.out.println(a);
        System.out.println("Değer giriniz(ondalıklı bir değer girmek istiyorsanız lütfen ondalık kısmını ,(virgül) ile ayırın");
        double b = scan.nextDouble();
        System.out.println(b);
    }
}
