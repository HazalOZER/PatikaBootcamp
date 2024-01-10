package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Throw {
    public static void checkAge(int age){
        if(age <18){

          //  throw new Exception("Yaşınız tutmuyor")
            throw new ArithmeticException("Yaşınız tutmuyor");//İstediğimiz exceptionu verebiliriz bu şekilde
        }
        System.out.println("Yaşı uygundur");
    }

    public static void checkParents(int age) throws Exception {
        if(age <5){
            throw new Exception("Velisi var mı kontrol edilmeli");
        }//genel exception kullanılmak isteniyorsa metot istmine throws exception yazılmalı
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yaş: ");
        int age = scan.nextInt();
        try {

            checkAge(age);

        }catch (Exception e){
            System.out.println("Yaşı uymadı");
        }
        checkParents(age);

    }


}
