/* yarı çapını kullanıcıdan aldığınız dairenin alanını,
çevresini ve kullanıcıdan aldığınız açı ile
daire dilimiinin alanını hesaplayan programı yazın.

Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
Daire Dilimi Alanı Formülü : (𝜋 * (r*r) * 𝛼) / 360
𝜋 sayısını = 3.14 alınız.*/


package week1;

import java.util.Scanner;

public class C07_P_DaireDilimininAlani {

    public static void main(String[] args) {

        double r, a, pi = 3.14, alan, dilimAlani,cevre;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = scan.nextDouble();

        System.out.print("Lütfen daire diliminin açısını giriniz giriniz: ");
        a = scan.nextDouble();

        alan=pi*r*r;
        cevre =2*pi*r;
        dilimAlani=(pi*r*r*a)/360;

        System.out.println("Girdiğini bilgilere göre;" +
                "\nDairenin çevresi: " + cevre +
                "\nDairenin alanı: " + alan +
                "\nDaire diliminin alanı: " + dilimAlani);

    }
}
