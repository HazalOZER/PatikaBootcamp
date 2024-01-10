package week4.c05_SiniflarArasiIliskiler;

public class Course {
    private String courseName;
    private String code;
    private  Instructor instructor;
    //Course has a Instructor (Sınıfın bir öğretmeni var)

    Course(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public Instructor getInstructor(){
        return this.instructor;
    }
    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }


    //Course uses Student/ Course,Student sınıfna Bağlı
    // note u student sınıfından kaldırırsak course sınıfında hata alıyoruz.
    public double calcAvarage(Student[] students) {
        double avarage = 0;

        for (Student student : students) {
            avarage += student.getNote();
        }
        avarage /=students.length;

        return avarage;
    }
}
