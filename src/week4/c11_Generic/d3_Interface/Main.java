package week4.c11_Generic.d3_Interface;

public class Main {
    public static void main(String[] args) {

        StudentTest <String> s = new StudentTest<>();
        s.insert("abc");

        StudentTest<Integer> i = new StudentTest<>();
        i.insert(4);

      //  Student stu = new Student<String>();
    }
}
