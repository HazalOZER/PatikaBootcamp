package week1;

//kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

import java.util.Scanner;

public class C36_P_UsluSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num=1, power;

        System.out.print("Sayı: ");
        num = scan.nextInt();

        System.out.print("Kuvveti: ");
        power = scan.nextInt();

        for (int i = 1; i < power; i++) {
            num *=num;
        }

        System.out.println(num);

    }
}
