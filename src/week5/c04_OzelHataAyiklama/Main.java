package week5.c04_OzelHataAyiklama;

import java.util.Scanner;

public class Main {

    public static void checkAge (int  age ) throws AgeCheckException{
        if(age<18){
            throw new AgeCheckException("Yaş hatası alındı");
        }
        System.out.println("Yaşı uygun");
    }
    public static void main(String[] args) throws AgeCheckException {
        System.out.println( "Yaş:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        try {
            checkAge(a);
        }catch (AgeCheckException e){
            System.out.println(e.toString());
        }

        System.out.println("Program bitti" +
                "");
    }
}
