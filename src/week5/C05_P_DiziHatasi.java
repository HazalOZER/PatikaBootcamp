package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_P_DiziHatasi {
    //Tanımlanmış bir dizideki elemanları kullanıcıdan aldığımız veriyle döndüren metot yazılac

    public static void print(String[] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Index: ");
        try {
            int index = scan.nextInt();
            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println("Lütfen tamsayı değeri giriniz");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array 10 elemanlıdır. Lütfen 0'dan 10'a kadar bir sayı giriniz.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Kedi", "Köpek", "Kuş", "Balık", "Maymun", "Zürafa", "Gergedan", "Timsah", "Tavşan", "Yılan"};
        print(arr);


    }
}

