package week5;

import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =5;//0
        int b = 20;
        System.out.println("a");
        int c;
        int [] arr = new int[2];

        try {
            System.out.println("b");
            System.out.println(b/a);//Hata olabilecek yer
            System.out.println( "c");
          //  c =scan.nextInt();
           // arr [10]=11;
        }catch (ArithmeticException e){
            System.out.println("Aritmatik hata alındı");
            System.out.println(e.getMessage());
            System.out.println("Hatalısın");//Hata varsa yapılacak kod bloğu
        }catch (InputMismatchException e){
            System.out.println("Yanlış veri girildi");
            System.out.println(e.getMessage());

        }catch (Exception e){
            System.out.println("Bir hata aldındı");
        }finally {
            System.out.println("Bu kısım kesinlikle çalışır");
        }

        System.out.println("d");
    }
}
//Metotların içerisindeki kod bloklaraında çalışır
//class içinde yapılmaz