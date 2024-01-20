package week6;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class C07_PrintStream {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("print.txt");
            output.print("123"+45645600);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
