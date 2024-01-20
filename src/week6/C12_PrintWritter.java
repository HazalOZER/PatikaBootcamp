package week6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C12_PrintWritter {
    public static void main(String[] args) {
        String data = "PrintWriter ile";
        try {
            PrintWriter writer = new PrintWriter("patika.txt");
            writer.println(data);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
