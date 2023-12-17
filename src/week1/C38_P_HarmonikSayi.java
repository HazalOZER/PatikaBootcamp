package week1;

import java.util.Scanner;

public class C38_P_HarmonikSayi {

    public static void main(String[] args) {
        int num ;
        double harmonic=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı: ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

            harmonic += (double) 1/i;

        }
        System.out.println(harmonic);
    }
}
