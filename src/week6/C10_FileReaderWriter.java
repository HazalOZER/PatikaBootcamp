package week6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C10_FileReaderWriter {
    public static void main(String[] args) {
        //fileReader


        try {
            FileReader readFile = new FileReader("patika.txt");

            int i = readFile.read();

            while (i != -1) {
                System.out.print((char) i);
                i = readFile.read();

            }
            readFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //writer
        String data = "Deneme 123ĞÜŞé";
        try {
            FileWriter writerFile = new FileWriter("patika.txt");
            writerFile.write(data);
            writerFile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
