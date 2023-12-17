package week1;

import java.util.Scanner;

/*   *
 ***
 *****
 *******
 *********
 *******
 *****
 ***
 *
 */
public class C39_P_Elmas {

    public static void main(String[] args) {
        int num ;

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı: ");
        num= scan.nextInt();


        for (int i = 0; i < num; i++) {
            for (int j = num - i - 1; j > 0; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = num - 1; i > 0; i--) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");

            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
