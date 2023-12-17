package week1;

import java.util.Scanner;

//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
public class C37_P_Basamak {
    public static void main(String[] args) {

        int num,digit,total=0;

        Scanner scan  = new Scanner(System.in);

        System.out.print("Sayı: ");
        num = scan.nextInt();

        while (num!=0) {

            digit = num % 10;
            total += digit;
            num /= 10;
        }
        System.out.println("Girdiğiniz sayısının rakamlar toplamı: "+total);
    }
}
