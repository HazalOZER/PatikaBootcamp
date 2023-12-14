package week1;

import java.util.Scanner;

public class C18_P_HesapMakinesi {
    public static void main(String[] args) {

        double num1,num2;
        int select;

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen ilk tam sayıyı giriniz: ");
        num1=scan.nextDouble();

        System.out.print("Lütfen ikinci tam sayıyı giriniz: ");
        num2 = scan.nextDouble();

        System.out.println("Lütfen yapılmasını istediğiniz işlemin numarasını giriniz:" +
                "\n1)Toplama" +
                "\n2)Çıkarma" +
                "\n3)Çarpma" +
                "\n4)Bölme");
        select = scan.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+(num1+num2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(num1-num2));
                break;
            case 3:
                System.out.println("Çarpma: "+(num1*num2));
                break;
            case 4:
                if (num2!=0) {
                    System.out.println("Bölme: "+(num1/num2));
                }else {
                    System.out.println("Bir sayı sıfıra bölünemez");
                }

                break;
            default:
                System.out.println("Hatalı seçim yaptınız");

        }
    }
}
