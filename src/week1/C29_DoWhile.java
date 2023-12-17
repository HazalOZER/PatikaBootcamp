package week1;

import java.util.Scanner;

public class C29_DoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            //koşul yanlış olsa bile en az 1 kere çalışır çünkü kod baştan sonra okunuyor önce
            //do okunduğu için koşul kontorl edilemez
            System.out.print("Şifre: ");
            pass = scan.nextInt();

            if(pass ==123){
                System.out.println("Doğru");
                askPassword=false;
            }else {
                System.out.println("Yanlış");
            }
        } while (askPassword);


    }
}
