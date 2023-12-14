package week1;

public class C14_MantiksalOperatorler {

    public static void main(String args[]) {

        //MANTIKSAL OPERATÖRLER
        /*&& ve
        * || veya
        * ! ters işlem*/

        //( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar

        int a, b;
        a = 10;

        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
    }
}
