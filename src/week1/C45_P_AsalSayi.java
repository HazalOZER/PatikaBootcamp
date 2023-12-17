package week1;

public class C45_P_AsalSayi {

    public static void main(String[] args) {

        boolean prime=true;

        for (int i = 2; i <= 100; i++) { //100'e kadar tüm sayılar döndü

            for (int j = 2; j < i; j++) {//i ye kadar tüm sayılar döndü

                if (i % j == 0){//bölüm hesaplandı
                    prime =false;//kalansız bölen varsa  boolean ifade yanlışa döndü
                    break;//Bölen sayı bulunduktan sonra if bloğuna çalışmayı bıraktırıldı
                }
            }
            if(prime){// kalansız bölen yoksa ekrana yazdırıldı
                System.out.print(i+", ");//asal sayılar yazdırıldı
            }
            prime=true;// boolean ifade tekrar default değerine döndürüldü
        }
    }
}
