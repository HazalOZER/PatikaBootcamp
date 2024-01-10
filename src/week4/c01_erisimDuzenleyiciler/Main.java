package week4.c01_erisimDuzenleyiciler;

public class Main {
    public static void main(String[] args) {


        ErisimDuzenleyiciler erisim = new ErisimDuzenleyiciler("Ağaç");
       // System.out.println(erisim.str); Hata veriyor çünkü private
       // erisim.showStr();//kendi sınıfı içinde ulaşılıyor
        erisim.show();


    }
}