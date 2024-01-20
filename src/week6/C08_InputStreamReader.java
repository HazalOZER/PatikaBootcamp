package week6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class C08_InputStreamReader {
    public static void main(String[] args) {

        //Karakter akışı
        //reader soyut sınıf

        try {
            FileInputStream fileInput = new FileInputStream("patika.txt");
            InputStreamReader inputReader = new InputStreamReader(fileInput);//(fileInput,CharSet.forName("")) ile kullanılacak seti belirleyebiliriz

            System.out.println(inputReader.getEncoding());//UTF8 bizim dilimizi destekliyor

            int i = inputReader.read();
            while (i!=-1){
                System.out.print((char) i);
                i = inputReader.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
