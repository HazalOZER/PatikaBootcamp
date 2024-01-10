package week4.c11_Generic.d3_Interface;

public class Student implements IDataBase<Student>{
    @Override
    public boolean insert(Student data) {
        return false;
    }

    @Override
    public boolean delete(Student data) {
        return false;
    }

    @Override
    public boolean update(Student data) {
        return false;
    }

    @Override
    public Student select() {
        return null;
    }
}
