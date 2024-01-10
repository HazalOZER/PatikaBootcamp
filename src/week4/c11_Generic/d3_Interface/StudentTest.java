package week4.c11_Generic.d3_Interface;

public class StudentTest<T> implements IDataBase<T>{
    @Override
    public boolean insert(T data) {
        System.out.println("Veri Eklendi");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Veri Silindi");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Veri Güncellendi");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Veri Çekildi");
        return null;
    }
}
