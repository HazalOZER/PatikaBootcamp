package week4.c05_SiniflarArasiIliskiler;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ali", "Özer", "123", "Alanya", 50);
        Student st2 = new Student("Ayten", "Özer", "1", "Alanya", 100);

        Student[] students = {st1, st2};

        Instructor teacher = new Instructor("Ayşe","Çiçek","Mat");
        Course mat = new Course("Mat101", "Mat",teacher);


        System.out.println(mat.calcAvarage(students)); //uses a- bağımlılık
        System.out.println(mat.getInstructor().getName());//has a birleştirme

        //Aggretation = course sınıfı olmasa da Instructor tek başına kullanılabilir Composition ise tek başına kullanılmıyor
        //Kalıtım (Inheritance) is a,


    }
}
