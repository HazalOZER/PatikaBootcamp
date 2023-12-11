package week1;

public class C01TemelOperator {

    public static void main(String[] args) {

        int a = 5, b=1;

       //ARİTMATİK OPERATÖRLER

        System.out.println(a+b);//toplama
        System.out.println(a-b);//çıkarma
        System.out.println(a*b);//çarpma
        System.out.println(a/b);//bölme
        System.out.println(a%b);//mod alma(bölümünden kalan)
        System.out.println(a++);// önce yazdır sonra bir arttır
        System.out.println(a);
        System.out.println(b++);//önce yazdır sonra bir arttır
        System.out.println(b);
        System.out.println(++a);//önce arttır sonra yazdır
        System.out.println(a);
        System.out.println(++b);//önce arttır sonra yazdır
        System.out.println(b);

        //ATAMA OPERATÖRÜ

        a=b;
        System.out.println(a);

        a +=b; //a=a+b;
        a -=b;
        a *=b;
        a /=b;
        a %=b;

        //KARŞILAŞTIRMA OPERATÖRLERİ

        boolean sonuc = a == b; //eşit mi?

        System.out.println(sonuc);

        sonuc = a != b; // eşit değil mi?

        System.out.println(sonuc);


    }

}
