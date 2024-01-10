package week4.c11_Generic.d4_BoundedType;

public class NullableExtends <T extends B >{
    private final T num ;

    public NullableExtends(T num) {
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
