package week4.c11_Generic.d1_Sınıflar;

public class Main {
    public static void main(String[] args) {

        String s;//Undefined-Tanımlanmamış
        String s1= null;//null-Değeri yok
        String s2="";//Empty-boş
        String s3="abc";


        //Nullable n = new Nullable(s2);
        //n.run();

    Integer a;
        Integer b= null;
        Integer c =3;
        NullableInteger i = new NullableInteger(b);

        Nullable<Integer> n = new Nullable<>(c);
        Nullable<String> str = new Nullable<>(s1);
        Nullable<Character> chr = new Nullable<>('a');
        n.run();
        str.run();
        chr.run();
        Character f='.';
        String str1="asd";
        Integer d=3;

        Test<Integer,String,Character> t= new Test<>(d,s3,f);
        t.setObj2(str1);
        t.showInfo();

    }
}
