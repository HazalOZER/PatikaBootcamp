package week1;

import java.util.Scanner;

public class C25_P_CinZodyagi {
    public static void main(String[] args) {

        int year; //Değişken tanımlandı

        Scanner scan = new Scanner(System.in); //Scanner çağırıldı

        System.out.print("Lütfen doğum yılınızı giriniz: "); //Kullanıcı ekranına istek mesajı gönderildi

        year = scan.nextInt(); //Kullanıcıdan veri alındı.

        switch (year % 12) {
            case 0:
                System.out.println("Doğum yılınıza göre çin burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Doğum yılınıza göre çin burcunuz: Horoz ");
                break;
            case 2:
                System.out.println("Doğum yılınıza göre çin burcunuz: Köpek ");
                break;
            case 3:
                System.out.println("Doğum yılınıza göre çin burcunuz: Domuz ");
                break;
            case 4:
                System.out.println("Doğum yılınıza göre çin burcunuz: Fare ");
                break;
            case 5:
                System.out.println("Doğum yılınıza göre çin burcunuz: Öküz ");
                break;
            case 6:
                System.out.println("BDoğum yılınıza göre çin burcunuz: Kaplan ");
                break;
            case 7:
                System.out.println("Doğum yılınıza göre çin burcunuz: Tavşan ");
                break;
            case 8:
                System.out.println("Doğum yılınıza göre çin burcunuz: Ejderha ");
                break;
            case 9:
                System.out.println("Doğum yılınıza göre çin burcunuz: Yılan ");
                break;
            case 10:
                System.out.println("Doğum yılınıza göre çin burcunuz: At ");
                break;
            case 11:
                System.out.println("Doğum yılınıza göre çin burcunuz: Koyun ");
                //11 durumundan sonra devam edecek başka kod olmadığı için break koymadım
        }


    }
}
