package week1;

import java.util.Scanner;

public class C19_P_KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = scan.nextLine();

        System.out.print("Şifreniz: ");
        password = scan.nextLine();

        if(!(userName.equals("Patika"))){
            System.out.println("Bu kullanıcı adında kişi bulunamadı!");
        }else if (userName.equals("Patika")&&password.equals("Java")) {
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        }else {
            int select;
            System.out.println("Şifrenizi unuttuysanız lütfen 1'i tuşlayın");
            select = scan.nextInt();

            if (select==1) {

                Scanner scan1 =new Scanner(System.in);//Intden sonra String için Scanner kullanınca bir daha çağırmam gerekti. SEBEP?
                String newPassword;

                System.out.print("Lütfen yeni bir şifre belirleyiniz: ");
                newPassword = scan1.nextLine();

                if (newPassword.equals("Java")){
                    System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz!");
                }else {
                    password = newPassword;

                    System.out.println("Tebrikler şifre başarı ile değiştirildi");

                }

            }
        }
    }
}
