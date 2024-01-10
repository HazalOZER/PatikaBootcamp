package week4.c02_Static;

public class CourseMain {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "Mat101", 75);
        Course fzk = new Course("Fizik", "Fzk101", 15);
        Course trh = new Course("Tarih", "Trh101", 83);

        int[] notes = {mat.note, fzk.note, trh.note};
        Course [] dersler ={mat,fzk,trh};

        Calculate.calcAvarage(notes);//nesne üretmeden sınıf adı ile çağırdık
        Calculate.calcAvarage(dersler);//override yaptık, course sınıfından ürettik

    }
}
