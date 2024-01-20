package week6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import  java.io.ByteArrayOutputStream;

//güvenlik işlemlerined kullanılan yapılar
public class C04_ByteArrayStream {
    public static void main(String[] args) {

        byte[] dizi = {1, 2, 3, 54, 66,12,64,7,15};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi);//(dizi,2,4) olarak yazarask dizi arrayinin 2. indeksinden başlayıp 4 elemanı alır

        System.out.println(input.read());
        input.skip(2);
        System.out.println("Kullanılanılan byte sayısı :" + input.available());
        int i = input.read();
        while (i != -1) {
            System.out.println(i);
            i = input.read();
        }

        try {
            input.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //----------------------OUTPUT ÖRNEKLERİ--------------------------------------------------------------------------------

        String data ="Java 102 Dersleri";
        ByteArrayOutputStream output= new ByteArrayOutputStream();

        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("Çıkış akışı: "+newData);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
