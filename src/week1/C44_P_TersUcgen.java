package week1;

import java.util.Scanner;

public class C44_P_TersUcgen {
    public static void main(String[] args) {

        int num;//Değişken tanımlandı

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        System.out.print("Sayı: ");//Kullanıcı ekranına talep yazıldı
        num = scan.nextInt();// Kullanıcıdan alınan değer değişkene atandı

        for (int i = num; i > 0; i--) { //Satır için döngü oluşturuldu

            for (int j = num - i; j > 0; j--) {//Boşluk için döngü oluşturuldu
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*"); //Yıldız için döngü oluşturuldu
            }
            System.out.println();//Alt satıra geçilebilmek için println komutu verildi

        }

    }
}
