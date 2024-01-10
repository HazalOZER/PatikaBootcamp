package week5.c04_OzelHataAyiklama;

public class AgeCheckException extends Exception {
    public AgeCheckException(String message) {
        super(message);

    }

    @Override
    public String toString() {
        return "AgeCheckException hatası";
    }
}
