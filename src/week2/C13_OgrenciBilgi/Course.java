package week2.C13_OgrenciBilgi;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int viva;
    String Teacher;

    Course(String name, String code, String prefix ) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int viva=0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }


}
