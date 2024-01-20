package week6;

import java.io.*;

public class C06_BufferedStream {
    public static void main(String[] args) {
        String data = "Java ogrenme çalışmaları HALA devam ediyor";
        try {
            //input
            FileInputStream fileInput = new FileInputStream("patika.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            //output

            FileOutputStream fileOutput = new FileOutputStream("patika.txt");
            BufferedOutputStream buffOutput = new BufferedOutputStream(fileOutput);

            byte[] arr = data.getBytes();
            buffOutput.write(arr);

            buffOutput.close();//BUFF kapanmadan yazdırmıyor
            fileOutput.close();

            //input yazdırma
            int i = buffInput.read();

            while (i != -1) {
                System.out.print((char) i);
                i = buffInput.read();

            }

            fileInput.close();
            buffInput.close();

        } catch (Exception e) {
            e.getMessage();
        }


    }
}
