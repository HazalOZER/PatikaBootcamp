package week4.c07_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Tutar :");
        double price = scan.nextDouble();
        System.out.print("Kart No :");
        scan.nextLine();
        String cardNumber = scan.nextLine();
        System.out.print("Son tarih :");
        String date = scan.nextLine();
        System.out.print("CVV :");
        String cvv = scan.nextLine();

        System.out.println("1. A Bankası"
                + "\n2. B Bankası"
                + "\n3. C Bankası"
                + "\nSeçiminizi yapınız");
        int selectBank = scan.nextInt();

        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A Bankası","123123","123");
               aPos.connect("123.1.1.1");
               aPos.payment(price,cardNumber,date,cvv);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankası","123123","123");
                bPos.connect("123.1.1.1");
                bPos.payment(price,cardNumber,date,cvv);
                break;
            case 3:
                break;
            default:
                System.out.println("Geçerli banka giriniz");

        }

    }
}
