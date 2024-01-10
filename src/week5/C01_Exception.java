package week5;

import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);

        int a = scan.nextInt();
        System.out.println("a");
        int b=  10;
        System.out.println("b");
        System.out.println(b/a);
        System.out.println("c");

    }

}
//Unchecked Exception -Derlerken öngürülemeyen hatalar
//Checked exception- Derleme aşamasında görünen hatalar
