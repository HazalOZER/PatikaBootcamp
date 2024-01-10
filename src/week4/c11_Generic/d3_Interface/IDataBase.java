package week4.c11_Generic.d3_Interface;

public interface IDataBase <T> {
    public boolean insert(T data);
    public boolean delete(T data);
    public  boolean update(T data);
    public T select();
}
