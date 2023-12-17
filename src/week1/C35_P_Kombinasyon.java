package week1;
/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
 N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/

import java.util.Scanner;

public class C35_P_Kombinasyon {

    public static void main(String[] args) {

        int n, nFac = 1, r, rFac = 1, nRFac = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç eleman var: ");
        n = scan.nextInt();

        System.out.print("Kaç elemanlı bir grup istiyorsunuz: ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFac *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nRFac *= i;
        }

        double formul = nFac / (rFac * nRFac);

        System.out.println("C(n,r)=" +formul);
    }

}
