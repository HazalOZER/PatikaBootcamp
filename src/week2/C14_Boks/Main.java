package week2.C14_Boks;

public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A", 20, 100, 90, 100);
        Fighter f2 = new Fighter("B", 15, 130, 95, 0);

        Match match = new Match(f1, f2, 80, 95);

        match.run();


    }

}
