package week2.C13_OgrenciBilgi;

public class Student {

    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int viva1, int note2, int viva2, int note3, int viva3) {

        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (viva1 >= 0 && viva1 <= 100) {
            this.course1.viva = viva1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (viva2 >= 0 && viva2 <= 100) {
            this.course2.viva = viva2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
        if (viva3 >= 0 && viva3 <= 100) {
            this.course3.viva = viva3;
        }

    }

    void isPass() {
        this.avarage = ((this.course1.note * 0.8 + this.course1.viva * 0.2) + (this.course2.note * 0.8 + this.course2.viva * 0.2) + (this.course3.note * 0.8 + this.course3.viva * 0.2)) / 3.0;

        if (this.avarage >= 55) {
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz");
            isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız");
            isPass = false;
        }
        printNote();
    }


    void printNote() {
        System.out.println(course1.name + " Notu\t:" + (this.course1.note * 0.8 + this.course1.viva * 0.2));
        System.out.println(course2.name + " Notu\t:" + (this.course2.note * 0.8 + this.course2.viva * 0.2));
        System.out.println(course3.name + " Notu\t:" + (this.course3.note * 0.8 + this.course3.viva * 0.2));
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
