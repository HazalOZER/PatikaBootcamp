package week4.c11_Generic.d1_Sınıflar;


public class NullableInteger {
    private final Integer value;

    public NullableInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public boolean isNull(){
        return this.getValue()==null;
    }
    public void run (){
        if (isNull()){
            System.out.println("Değer atanmamıştır");
        }else {
            System.out.println(this.getValue());
        }
    }
}
