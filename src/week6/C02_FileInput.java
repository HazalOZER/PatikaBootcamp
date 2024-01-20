package week6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInput {
    public static void main(String[] args) {

        //dosyadaki verileri byte cinsinde okur

        //File nesnesi ile dosya oluşturup direkt nesneyi atabiliriz.

        try {

            FileInputStream input = new FileInputStream("src/patika.txt");

            System.out.println("Kullanılabilir byte sayısı: " + input.available());
            System.out.println("------------");

            input.read();
            input.read();//2 byte kullandık

            System.out.println("Kullanılabilir byte sayısı: " + input.available());
            System.out.println("------------");

            input.skip(5);//kaldığı yerden 5 karakter atlar

            System.out.println("Kullanılabilir byte sayısı: " + input.available());
            System.out.println("------------");

            int i = input.read();//7. bytedan başlıyor çünkü yukarda 2 karark çağırdık 5 karakter atladıkkullandık
            while (i != -1) {//karakter kalmadığında read metotud -1 döndürür
                System.out.print((char) i);//türkçe kararkerlerde hata veriyor
                i = input.read();
            }

            System.out.println();
            System.out.println("------------");
            System.out.println("Kullanılabilir byte sayısı: " + input.available());

            input.close();//hafıza sorunu olmaması adına işi bitince kapatmalıyız.

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //try catch yapmak yerine maine metoda trows IOException dahil edebilirdik.


    }
}
