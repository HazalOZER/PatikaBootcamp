package week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C31_P_SayiTahmin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(100);

        //int num =(int) (Math.random()*100); yukarıdakiyle aynı işlem


        int right = 0;
        int select;
        int[] wrong = new int[5];
        boolean isWrong = false;

        while (right < 5) {

            System.out.println("Kalan hak :" + (5 - right));
            System.out.println("- - - - ");

            System.out.print("Lütfen tahmininizi giriniz: ");
            select = scan.nextInt();

            if (select < 0 || select > 100) {

                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");

                if (isWrong) {
                    right++;
                } else {
                    System.out.println("Değer aralığında girmediğiniz takdirde canınız azaltılacaktır.");
                    isWrong = true;
                }
                continue;
            }
            if (num == select) {

                System.out.println("Tebrikler!Doğru tahmin");
                break;

            } else if (right < 4) {

                System.out.println("Hatalı bir değer girdiniz.");

                if (select < num) {

                    System.out.println("Daha büyük bir değer giriniz");

                } else {

                    System.out.println("Daha küçük bir değer giriniz");
                }
            }
            wrong[right] = select;
            right++;

        }
        if (right == 5) {

            System.out.println("Üzgünüz, kazanamadınız." +
                    "\nTercihleriniz :" + Arrays.toString(wrong) +
                    "\nOyun sonu.");

        } else {

            System.out.println("Oyun sonu");

        }
    }
}
