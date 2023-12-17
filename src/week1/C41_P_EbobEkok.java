package week1;

import java.util.Scanner;

public class C41_P_EbobEkok {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, ebob=1, ekok=1;

        System.out.println("İlk sayı: ");
        num1 = scan.nextInt();

        System.out.println("İkinci sayı: ");
        num2 = scan.nextInt();

        //EBOB
        if (num1 > num2) {

            for (int i = 1; i <= num2; i++) {

                if (num1 % i == 0 && num2 % i == 0) {

                    ebob = i;
                }

            }

        } else {
            for (int i = 1; i <= num1; i++) {

                if (num1 % i == 0 && num2 % i == 0) {

                    ebob = i;
                }
            }
        }

        System.out.println("Ebob: "+ebob);

        //EBOB kısa çözüm

       /* if (num1 > num2) {

            for (int i = 1; i <= num2; i++) {

                if (num1 % i == 0 && num2 % i == 0) {

                    ekok = i;
                }

            }

        } else {
            for (int i = 1; i <= num1; i++) {

                if (num1 % i == 0 && num2 % i == 0) {

                    ebob = i;
                }
            }
        }*/



    }
}