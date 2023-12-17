package week1;

import java.util.Scanner;

// girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
public class C34_P_DortVeBesKuvvetler {
    public static void main(String[] args) {

        int num, exponent=1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı: ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

            exponent*=4;
            System.out.print(exponent+",");

        }
        exponent=1;
        System.out.println();
        for (int i = 1; i <= num; i++) {

            exponent*=5;
            System.out.print(exponent+",");

        }

    }

}
