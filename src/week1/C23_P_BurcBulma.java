package week1;

import java.util.Scanner;

public class C23_P_BurcBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int month,day;

        System.out.print("Hangi ayda doğdunuz: ");
        month = scan.nextInt();

        System.out.print("Hangi günde doğdunuz: ");
        day = scan.nextInt();

        if(((month==3)&&(day >= 21)&&(day<=31))||((month==4)&&(day >= 1)&&(day<=20))){
            System.out.println("Koç Burcusunuz.");
        } else if (((month==4)&&(day >= 21)&&(day<=30))||((month==5)&&(day >= 1)&&(day<=21))) {
            System.out.println("Boğa Burcusunuz.");
        }else if (((month==5)&&(day >= 22)&&(day<=31))||((month==6)&&(day >= 1)&&(day<=22))) {
            System.out.println("İkizler Burcusunuz.");
        }else if (((month==6)&&(day >= 23)&&(day<=30))||((month==7)&&(day >= 1)&&(day<=22))) {
            System.out.println("Yengeç Burcusunuz.");
        }else if (((month==7)&&(day >= 23)&&(day<=31))||((month==8)&&(day >= 1)&&(day<=22))) {
            System.out.println("Aslan Burcusunuz.");
        }else if (((month==8)&&(day >= 23)&&(day<=31))||((month==9)&&(day >= 1)&&(day<=22))) {
            System.out.println("Başak Burcusunuz.");
        }else if (((month==9)&&(day >= 23)&&(day<=30))||((month==10)&&(day >= 1)&&(day<=22))) {
            System.out.println("Terazi Burcusunuz.");
        }else if (((month==10)&&(day >= 23)&&(day<=31))||((month==11)&&(day >= 1)&&(day<=21))) {
            System.out.println("Akrep Burcusunuz.");
        }else if (((month==11)&&(day >= 22)&&(day<=30))||((month==12)&&(day >= 1)&&(day<=21))) {
            System.out.println("Yay Burcusunuz.");
        }else if (((month==12)&&(day >= 22)&&(day<=31))||((month==1)&&(day >= 1)&&(day<=21))) {
            System.out.println("Oğlak Burcusunuz.");
        }else if (((month==1)&&(day >= 22)&&(day<=31))||((month==2)&&(day >= 1)&&(day<=19))) {
            System.out.println("Kova Burcusunuz.");
        }else if (((month==2)&&(day >= 20)&&(day<=29))||((month==3)&&(day >= 1)&&(day<=20))) {
            System.out.println("Balık Burcusunuz.");
        }else {
            System.out.println("Hatalı giriş yaaptınız");
        }
    }
}
