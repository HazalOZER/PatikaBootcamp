package week1;

public class C11_AritmatikIslemler {
    public static void main(String[] args) {

        //int a;//varsayılan değer olarak 0 atar ama garbage değerdir. bu haliyle işlem yapılamaz

    /* = atama
    + toplama
    - çıkarma
    * çarpma
    / bölme
    % bölümünden kalan (mod alma başka bir şey)
    operatörlerin sağında ve solunda kalan değerlere operand denir */

        int ival = 11%-3;//11in 3e bölümünden kalan 2

        int mod=Math.floorMod(11,-3);//8,5,2,-1. eksi olana kadar 3 azaltıyor sonuç -1

        System.out.println(ival);
        System.out.println(mod);

        //BİR ARTTIR AZALT
        /* ++a => a değerini önce arttırıp sonra a değeri ile işlem yapıyor
           a++ => önce a değerinin mevcut haliyle işlem yapıp daha sonra arttırma işlemini gerçekleştiriyor
           --a ve a-- aynı şekilde
        * */

        int a=5,b=4;
        int c=++a + b-- + ++b;//6+4(4 bastırdı sonra 5 yaptı)+4(bir önceki komutla 5 olan byi bir eksiltip 4 yaptı ve öyle bastırdı)14
        System.out.println(c);


        /*
        * == eşit ise
        * ! eşit değilse
        * boolen değerinde sonuç üretir
        * */

        System.out.println(a == b);//false
        System.out.println(a!=b);//true
        System.out.println(!(a == b));//true

        //BitWiseNotOperator ~

        a=~1;
        System.out.println(a); //2lik sistemde 1 00000...0001 1 demektir
                                //~operatörü sıfırları bire birleri de sıfıra çevirir yani 1111...1110 bu da -2e denk geliyor

        //LocicalComplementOperator

        boolean isTrue = !true;
        System.out.println(isTrue);

        /*
        *   >> Bitsel olarak sayısı istenilen değer kadar sayıyı sağa kaydırır.(signed right shift)
            << Bitsel olarak sayısı istenilen değer kadar sayıyı sola kaydırır.(left shift)
            * >>>unsigned right shift -+ işaret de değişiyor
            *
            * System.out.println(9<<2); //  36 Olarak Ekrana Yazdırır.
            System.out.println(9>>2); // 2 Olarak Ekrana Yazdırır.
            *
            * 9 sayısının binary karşılığı 1001‘e karşılık gelir.
            * Bu sayıyı 2 bit sağa kaydıracak olursak en sağda bulunan 2 bit kaybolur ve kalan bitler 2 basamak sağa kaymış olur.
            * Yeni ortaya çıkacak sayımız 0010 olur ve bu değerin karşılığı da 2’ye denk gelir.
            *
            * Aynı şekilde bu sefer işlemi 2 bit sola kaydırma şeklinde düşünürsek karşımıza çıkacak sayı değeri 100100 olur.
            * Bu da 36 değerine karşılık gelir.*/


    }





}
