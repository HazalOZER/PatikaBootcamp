package week1;

// 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

import java.util.Scanner;

public class C32_P_OnikininKati {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, flag = 0;
        double total = 0, average;

        System.out.print("Lütfen sayı giriniz: ");
        num = scan.nextInt();


        for (int i = 1; i < num; i++) {


            if (i%12==0) {

                total += i;
                flag++;

            }
        }
        average = total / flag;
        System.out.println(average);
    }
}
