package week6;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_FileOutput {
    public static void main(String[] args) {
        String metin ="OutputStream Öğreniyorum\nPatika.dev ile";

        try {
            FileOutputStream output = new FileOutputStream("src/patika.txt",true);//true yazmaksak dosyayı her seferinde sıfırlar,eski verileri siler
            //devamına yazmak için true yazıyoruz
            byte [] metinByte = metin.getBytes();
            output.write(metinByte);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());//DOSYA YOKSA KENDİ OLUŞTURUYPR
        }
    }
}
