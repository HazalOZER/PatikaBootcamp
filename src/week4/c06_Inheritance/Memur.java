package week4.c06_Inheritance;

public abstract class Memur extends Calisan {
    private String departman;
    private String mesai;

    public Memur(String adSoyad, String telefon, String eposta, String departman, String mesai) {
        super(adSoyad, telefon, eposta);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String getDepartman(){
        return  this.departman;
    }
    public void setDepartman(String departman){
        this.departman= departman;
    }
    public String getMesai(){
        return this.mesai;
    }
    public void setMesai(String mesai){
        this.mesai = mesai;
    }
    public void calis(){
        System.out.println(getAdSoyad()+" çalışmaya başladı.");
    }
    @Override
    public void giris (){
        System.out.println(getAdSoyad()+" memuru C kapısından giriş yaptı");
    }
}
