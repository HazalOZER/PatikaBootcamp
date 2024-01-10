package week4.c06_Inheritance;

public class OgretimGorevlisi extends Akademisyen{
   private String kapiNo;
    public OgretimGorevlisi(String adSoyad,String telefon, String eposta, String bolum, String unvan,String kapiNo){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.kapiNo = kapiNo;
    }
    public String getKapiNo(){
        return this.kapiNo;
    }
    public void setKapiNo(String kapiNo){
        this.kapiNo = kapiNo;
    }
    public void senatoToplantisi(){
        System.out.println(getAdSoyad()+" senato toplantısına girdi");
    }
    public void sinavYap(){
        System.out.println(getAdSoyad()+" sınav yaptı");
    }
    public void giris(){
        System.out.println(this.getAdSoyad()+" öğretim görevlisi B kapısından giriş yaptı");
    }
    @Override
    public void derseGir(String saat){
        System.out.println(getAdSoyad()+" öğretim görevlisi derse "+saat+" saatinde giriş yaptı");
    }
}
