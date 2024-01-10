package week4.c11_Generic.d4_BoundedType;

public class Nullable <T extends Number> {
   private final T num ;

    public Nullable(T num) {
        this.num = num;
    }
    public T getNum(){
        return this.num;
    }

    public boolean isNull(){
        return this.num==null;
    }
    public void run(){
        if(isNull()){
            System.out.println("Bir değer girilmemiştir");
        }else {
            System.out.println("Girilen Değer: "+this.getNum());
        }
    }
}
