package week6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class DENEME {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir metin girin: ");
            String metin = scanner.nextLine();

            FileWriter fileWriter = new FileWriter("patika.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(metin);
            printWriter.close();

            // Reading from file
            FileReader fileReader = new FileReader("patika.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = bufferedReader.readLine();
            bufferedReader.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
