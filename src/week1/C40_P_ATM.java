package week1;

import java.util.Scanner;

public class C40_P_ATM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName, password;

        int right = 3, balance = 1500, select, price;

        while (right > 0) {

            System.out.print("Kullanıcı adı: ");
            userName = scan.nextLine();
            System.out.print("Şifre: ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {

                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.print("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap\n" +
                            "Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();

                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }

                            break;
                        case 3:

                            System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);

                System.out.println("Tekrar görüşmek üzere.");

                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
