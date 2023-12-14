package week1;

import java.util.Scanner;

public class C22_P_BuyuktenKucuge {
    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sırayla üç adet sayı giriniz.\nHer sayı sonrası enter tuşuna basınız");

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

       /* if ((num1==num2)||(num2==num3)||(num1==num3)){
            if(num1==num2){

            }

        }

        bizden istenilmmediği ve işlem uzayacağı için yapmadım. Daha sonra yapmak için bırakıyorum*/


        if ((num1>num2)&&(num1>num3)){
            if(num2>num3){
                System.out.println("Girdiğiniz sayılara göre: "+num1+">="+num2+">="+num3);
            }else {
                System.out.println("Girdiğiniz sayılara göre: "+num1+">="+num3+">="+num2);
            }
        } else if ((num2>num1)&&(num2>num3)) {
            if (num1>num3){
                System.out.println("Girdiğiniz sayılara göre: "+num2+">="+num1+">="+num3);
            }else {
                System.out.println("Girdiğiniz sayılara göre: "+num2+">="+num3+">="+num1);
            }
        }else {
            if (num1>num2){
                System.out.println("Girdiğiniz sayılara göre: "+num3+">="+num1+">="+num2);
            }else {
                System.out.println("Girdiğiniz sayılara göre: "+num3+">="+num2+">="+num1);
            }
        }

    }
}
