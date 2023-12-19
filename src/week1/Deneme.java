package week1;

import java.util.Scanner;



public class Deneme {
    public static void main(String[] args) {

        int q, a , b , n , total = 0;

        Scanner scan = new Scanner(System.in);
        q = scan.nextInt();

        for (int i = 1; i <= q; i++) {

            a = scan.nextInt();
            b = scan.nextInt();
            n = scan.nextInt();

            total=a;

            for (int j = 0; j < n; j++) {

                total +=  b * Math.pow(2, j);
                System.out.print(total + " ");
            }
            System.out.println();


        }
    }
}
