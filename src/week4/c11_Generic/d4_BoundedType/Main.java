package week4.c11_Generic.d4_BoundedType;

public class Main {
    public static void main(String[] args) {
//Intefer,Double,Float, extend Number
        Nullable<Integer> n1 = new Nullable<>(3);
        n1.run();

        A aObj= null;
        NullableExtends <A> a1= new NullableExtends<>(aObj);
        a1.run();

    }
//extenr B upper Bounded type
    //extend A lower bounded type
}
