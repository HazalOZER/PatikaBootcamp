package week6;

import java.io.*;

public class C11_BufferedReaderWriter {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("patika.txt");
            BufferedReader readBuff = new BufferedReader(readFile);

            String line = readBuff.readLine();
            while (line != null){
                System.out.println(line);
                line = readBuff.readLine();
            }
            /*
            * while ((line == readBuff.readLine()) != null){
            * System.out.prinln(line
            * }
            * Bu şekilde yazmak daha az kod yazdırır
            * */
            readFile.close();
            readBuff.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //////////Write
        String data = "\nBuffer ile atama";
        try {
            FileWriter writeFile = new FileWriter("patika.txt",true);//Silmiyor çalıştırdığın kadar üzerine ekliyor, true yaptığımız için
            BufferedWriter writeBuff = new BufferedWriter(writeFile);
            writeFile.write(data);
            writeFile.close();
            writeBuff.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
