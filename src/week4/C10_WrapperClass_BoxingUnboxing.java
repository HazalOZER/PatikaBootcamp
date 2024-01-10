package week4;

public class C10_WrapperClass_BoxingUnboxing {
    public static void main(String[] args) {


        Integer a =20;
        String str="abc";
        Short s=2;
        str =a.toString();
        String b ="10";
        int c = Integer.parseInt(b);
        System.out.println( Integer.sum(3,5));

        //AutoBoxing
        a=c;
        //Boxing
        a=Integer.valueOf(c);

        //AutoUnboxing
        c = a;
        //Unboxing
        c = a.intValue();


    }


}
