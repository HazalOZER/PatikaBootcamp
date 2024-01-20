package week6;

import java.io.*;
import java.util.Scanner;

public class C14_P_Notepad {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        try { //try catch eklendi
            FileReader fReader = new FileReader("notlar.txt");//fileReader çağırıldı
            BufferedReader bReader = new BufferedReader(fReader);//bufferedReader çağırıldı

            String line;


            while ((line = bReader.readLine()) != null) {
                System.out.println(line);//notlar.txt sayfasındaki satırlar yazdırıldı
            }

            System.out.print("Yeni Not: ");
            String text = scan.nextLine();//scanner ile not aldındı

            FileWriter fWriter = new FileWriter("notlar.txt", true);//fileWriter çağırıldı
            PrintWriter pWriter = new PrintWriter(fWriter);//printWriter çağırıldı


            pWriter.println(text);//kullanıcıdan alınan not notlar.txt dosyasına yazdırııldı
            pWriter.close();//nesne kapamalar yapıldı
            fWriter.close();
            bReader.close();
            fReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());//hata mesajı verildi
        }

    }
}
