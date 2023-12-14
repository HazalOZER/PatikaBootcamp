package week1;

import java.util.Scanner;

public class C20_P_SinifGecme {
    public static void main(String[] args) {

       double math, physics, chem, turkish, music, average;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen matematik ders notunuzu giriniz:");
        math = scan.nextDouble();

        System.out.print("Lütfen fizik ders notunuzu giriniz:");
        physics = scan.nextDouble();

        System.out.print("Lütfen kimya ders notunuzu giriniz:");
        chem = scan.nextDouble();

        System.out.print("Lütfen türkçe ders notunuzu giriniz:");
        turkish = scan.nextDouble();

        System.out.print("Lütfen müzik ders notunuzu giriniz:");
        music = scan.nextDouble();



        if ((0 <= math && math <= 100)
                && (0 <= physics && physics <= 100)
                && (0 <= chem && chem <= 100)
                && (0 <= turkish && turkish <= 100)
                && (0 <= music && music <= 100)) {

            average = (math + physics + chem + turkish + music) / 5;

            System.out.println("Dönem notunuz: "+average);

            if (average>=55) {
                System.out.println("Sınıfı geçtiniz");
            }else {
                System.out.println("Sınıfta kaldınız.");
            }
        }else {
            System.out.println("Hatalı not girişi yaptınız. Lütfen ders notunuzun 0 ila 100 arasında olduğundan emin olunuz!");
        }


    }
}
