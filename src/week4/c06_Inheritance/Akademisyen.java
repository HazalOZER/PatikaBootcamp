package week4.c06_Inheritance;

public abstract class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;


    //subclass super clasın constracterını yazmalı

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);//üst sınıfının constracterını refarans gösterir
        //super en üste yazılır
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return this.bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return this.unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public abstract void derseGir(String dersSaati) ;
    @Override
    public  void  giris(){
        System.out.println(this.getAdSoyad()+ " akademisyeni A kapısından giriş yaptı");
    } // ata sınıfında olan metot yerine override edilen metot yazılır


}
