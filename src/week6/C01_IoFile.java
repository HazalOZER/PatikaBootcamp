package week6;

import java.io.File;
import java.io.IOException;

public class C01_IoFile {
    public static void main(String[] args) {

        File dosya  = new File("src/patika.txt");//path oluşturuyoruz srcye kaydettil

        //dosya oluşturuma  creatNewFile()
        try {


            /*if (!file.exists()){
                file.creatNewFile}
            * *///bu da ekleme metodu

            if(dosya.createNewFile()){
                System.out.println(dosya.getName()+" dosyası oluştururldu");
            }else{
                System.out.println(dosya.getName()+" dosyası zaten mevcut");
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //creatNewFile() exception attığı için try catchi zorunlu tutuyor.

        //dosya silme delete()
          //dosya.delete();//true false dönüyor


        File dizin = new File("test");
        dizin.mkdir();//dizin olutşrdu

        //üst klosörü de olutturdu. mkdir hata veriri çünkü patika klasörü yok. mkdirs ikisini de oluşturuur
        File ikiDizin = new File("Patika/dev");
        ikiDizin.mkdirs();

        //dizin listeleme

        File klasor = new File("src/week1");
        String[] arr = klasor.list();

        for (String s : klasor.list()) {
            System.out.println(s);
        }


    }
}
