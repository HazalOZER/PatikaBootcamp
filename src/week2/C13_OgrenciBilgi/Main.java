package week2.C13_OgrenciBilgi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Kamil", "TRH", "05055555555");
        Teacher t2 = new Teacher("Ayten", "FZK", "05325323232");
        Teacher t3 = new Teacher("Ayşe", "BIO", "05455454545");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "201", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Ali", "73", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 77, 90, 85, 64, 100);
        s1.isPass();

        Student s2 = new Student("Fatih", "68", "7", tarih, fizik, biyoloji);
        s2.addBulkExamNote(55, 90, 67, 15, 100, 97);
        s2.isPass();
    }

}
