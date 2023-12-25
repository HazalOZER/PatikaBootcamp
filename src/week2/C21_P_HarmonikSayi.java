package week2;

public class C21_P_HarmonikSayi {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int harmonic=1;
        for (int i = 0; i < num.length; i++) {
            harmonic += 1/num[i];
        }
        System.out.println(harmonic);
    }
}
