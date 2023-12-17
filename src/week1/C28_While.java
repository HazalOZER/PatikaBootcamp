package week1;

import java.util.Scanner;

public class C28_While {
    public static void main(String[] args) {

        int i =1,k;
        System.out.println("Program başladı");
        while ( i<=5){
            System.out.println(i);
            i++;
            k=1;
            while (k<=10){
                System.out.println(k+", ");
                k++;
            }
        }
        System.out.println("Program bitti");


        int left=100, right=200;
        while (++left < --right);

        System.out.println(left);//150

        int password;
        boolean isPasswordSuccess = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz: ");
        password = scan.nextInt();

        while (!isPasswordSuccess){

            System.out.print("Şifre: ");
            password = scan.nextInt();

            if (password==123){
                System.out.println("Doğru");
                isPasswordSuccess = true;
            }else {
                System.out.println("Yanlış");
            }
        }
        }

        }


