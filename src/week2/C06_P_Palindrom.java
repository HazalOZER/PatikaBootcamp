package week2;

import java.util.Scanner;

public class C06_P_Palindrom {
    static boolean isPalindrom(int num) {

        int temp = num, reverseNum = 0, lastNum;

        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = reverseNum * 10 + lastNum;
            temp /= 10;
        }
        if (reverseNum == num) {
            System.out.println(num+ " sayısı palindrom sayıdır.");
            return true;
        }
        System.out.println(num+" sayısı palindrom sayı değildir");
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı :");
        int num = scan.nextInt();
        isPalindrom(num);
    }
}
