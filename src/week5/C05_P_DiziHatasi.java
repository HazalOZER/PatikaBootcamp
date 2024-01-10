package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_P_DiziHatasi {
    //Tanımlanmış bir dizideki elemanları kullanıcıdan aldığımız veriyle döndüren metot yazılacak

    public static void print(String[] arr) {
        Scanner scan = new Scanner(System.in);//Scanner çağırıldı
        System.out.print("Index: ");//Kullanıcı ekranına mesaj gönderildi
        try {
            int index = scan.nextInt();//index kullanıcıdan alındı
            System.out.println(arr[index]);//Eleman ekrana yazdırıldı
        } catch (InputMismatchException e) {
            System.out.println("Lütfen tamsayı değeri giriniz");//input hatası değerlendirildi
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array 10 elemanlıdır. Lütfen 0'dan 10'a kadar bir sayı giriniz.");//dizi sınır değerlendirildi
        } catch (Exception e) {
            System.out.println(e.getMessage());//Kalan hatalar değerledirildi
        }
    }

    //Main metot
    public static void main(String[] args) {
        String[] arr = {"Kedi", "Köpek", "Kuş", "Balık", "Maymun", "Zürafa", "Gergedan", "Timsah", "Tavşan", "Yılan"};//Dizi Manuel olarak tanımlandı
        print(arr);//Print metodu çağırıldı. Dizi içine atıldı


    }
}

