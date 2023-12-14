package week1;

import java.util.Scanner;

public class C26_P_ArtikYil {

    public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in); //Scanner çağırıldı.

        System.out.print("Lütfen yılı giriniz: ");//Kullanıcı ekranına istek mesajı gönderildi
        year = scan.nextInt(); //Kullanıcıdan veri alındı.

        if (year%4==0){             //dördün katı olup olmadığı kontrol edildi
            if (year%100==0){       //yüzün katı olup olmadığı kontrol edildi
                if(year%400==0){    //dört yüzün katı olup olmadığı kontrol edildi
                    System.out.println(year+" bir artık yıldır!");
                }else {
                    System.out.println(year+" bir artık yıl değildir!");
                }
            }else {
                System.out.println(year + " bir artık yıldır!");
            }
        }else {
            System.out.println(year+" bir artık yıl değildir!");
        }

    }
}
