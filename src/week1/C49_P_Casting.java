package week1;

import java.util.Scanner;

public class C49_P_Casting {
    public static void main(String[] args) {


        //byte < short < int < long<  float < double
        // Kullanıcıdan alınan tam sayıyı ondalıklı sayıya ondalıklı sayıyı tam sayıya çevrilmesi yapıldı.
        //Diğer veri tiplerine de alıştırma olması adına dönüşüm yapıldı.

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı
        System.out.print("Tam sayı: ");//Kullanıcı ekranına mesah yazıldı
        int numInt = scan.nextInt();//Değişkene kullanıcıdan alınan değer atandı

        System.out.print("Ondalıklı sayı: ");//Kullanıcı ekranına mesah yazıldı
        double numDouble = scan.nextDouble();//Değişkene kullanıcıdan alınan değer atandı


        int castingInt = (int) numDouble;// ondalıklı sayının tam sayıya dönüşümü yapıldı
        System.out.println("Girdiğiniz ondalıklı sayının int türündeki değeri: " + castingInt);//ekrana yazdırııldı

        double castingDouble = numInt; //tam sayının ondalıklı sayıya dönüşümü yapıldı
        System.out.println("Girdiğiniz tam sayının double türündeki değeri: " + castingDouble);// ekrana yazdırıldı

       //diğer data tiplerine de dönüşüm yapıldı ekrana yazdırıldı

        byte numByte = (byte) numInt;
        System.out.println("Girdiğiniz tam sayının byte türündeki değeri: " + numByte);

        numByte = (byte) numDouble;
        System.out.println("Girdiğiniz ondalıklı sayının byte türündeki değeri: " + numByte);

        short numShort = (short) numInt;
        System.out.println("Girdiğiniz tam sayının short türündeki değeri: " + numShort);

        numShort = (short) numDouble;
        System.out.println("Girdiğiniz ondalıklı sayının short türündeki değeri: " + numShort);

        long numLong = numInt;
        System.out.println("Girdiğiniz tam sayının long türündeki değeri: " + numLong);

        numLong = (long) numDouble;
        System.out.println("Girdiğiniz ondalıklı sayının long türündeki değeri: " + numLong);

        float numFloat = numInt;
        System.out.println("Girdiğiniz tam sayının float türündeki değeri: " + numFloat);

        numFloat = (float) numDouble;
        System.out.println("Girdiğiniz ondalıklı sayının float türündeki değeri: " + numFloat);

    }
}
