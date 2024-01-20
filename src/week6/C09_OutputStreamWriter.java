package week6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class C09_OutputStreamWriter {
    public static void main(String[] args) {
        //Karakter
       String data="Java Başlangıç";
        try {
            FileOutputStream fileOutout =new FileOutputStream("patika.txt");
           // fileOutout.write(data.getBytes());//byte alıyor

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutout);
            fileWriter.write(data);//string alıyoor
            fileWriter.close();
            fileOutout.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
