package week6;

import java.io.*;

public class C13_P_DosyadanSayiOkuma {
    public static void main(String[] args) {

        File file = new File("sayi.txt");//Dosya oluşturuldu

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fWriter = new FileWriter(file);//FileWriter çağırıldı
            BufferedWriter bWriter = new BufferedWriter(fWriter);//Bufferredwriter çağırıldı

            bWriter.write("5");//veri yazıldı
            bWriter.newLine();//yeni satıra atlandı
            bWriter.write("10");
            bWriter.newLine();
            bWriter.write("20");
            bWriter.newLine();
            bWriter.write("12");
            bWriter.newLine();
            bWriter.write("33");
            bWriter.newLine();

            bWriter.close();//nesne kapatıldı
            fWriter.close();

            //Dosyadan yazdırma

            String line;
            int sum=0;

            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);

            while ((line = bReader.readLine())!=null){
                sum += Integer.parseInt(line);
            }
            System.out.println("Dosyadaki sayıların toplamı: "+sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
