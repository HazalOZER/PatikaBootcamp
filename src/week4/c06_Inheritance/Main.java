package week4.c06_Inheritance;

public class Main {
    public static void main(String[] args) {

        //   Calisan c1 = new Calisan("Kamil Kamile", "123", "kamil@gmail.com");
        //   c1.cikis();

        // Akademisyen a1 = new Akademisyen("Şamil Şamile", "123", "şamil@gmail.com", "Tarih", "Prof.");
        // System.out.println(a1.getAdSoyad());

        //Calisan m1 =new Memur("Ali Aliye","123","ali@gmail.com","Öğrenci işleri","13.00-15.00");
        //çalışan sınıfından memur üretilebilir ama memur sınıfından metotlar kullanılmaz

        //  Memur m1 = new Memur("Ali Aliye", "123", "ali@gmail.com", "Öğrenci işleri", "13.00-15.00");
        //m1.calis();

        OgretimGorevlisi o1 = new OgretimGorevlisi("Ali Veli", "1", "veli@gmail.com", "matematik", "dr", "204");
        o1.cikis();
        o1.derseGir("12.00");

        o1.giris();
        //   m1.giris();
        // c1.giris();
        //   a1.giris();

//polimorfizm

        // Calisan a2 = new Akademisyen("Ayten", "123", "ayten@gmail.com", "Mat", "prf");
        //   a2.giris();//override edilmiş metotlara erişebiliyor
        // a2.getBolum

        //   int [] loginUser = new int [5];

        //polimorfizm

        Calisan[] loginUser = {o1};
        Calisan.girisYapanalar(loginUser);
    }
}
