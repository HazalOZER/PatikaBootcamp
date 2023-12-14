package week1;

import java.util.Scanner;

public class C24_P_UcakBilet {
    public static void main(String[] args) {

        double age, km, price = 0.1; // Değişkenler tanımlandı. 0.10Tl ücret ataması yapıldı
        int select;

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        System.out.println("Lütfen yolculuk tipini seçiniz:\n1) Tek Yön\n2) Gidiş Dönüş");
        select = scan.nextInt();//yolculuk tipi yolcudan alındı

        System.out.print("İki şehir arası mesafe kaç km?: ");
        km = scan.nextDouble(); //mesafe bilgisi yolcudan alındı

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = scan.nextDouble(); //yaş bilgisi yolcudan alındı

        price *= km; //Tek yön uçuşun indirimsiz fiyatı hesaplandı


        if (km >= 0) { //mesafe 0 km ve üzeriyse hesaplama yapılacak
            if (age >= 0 && age <= 125) {//yaş 0 ve 125 arasındaysa hesaplama yapılacak

                // Kayıtlara geçmiş en yaşlı insan 122 yaşında olduğu için üst sınırı 125 olarak belirlendi

                switch (select) {

                    case 1:

                        if (age < 12) {
                            price *= 0.5; //12 yaşından küçük yolcuya %50 indirim uygulandı.
                            System.out.println("Ödenecek indirimli tutar: " + price);
                        } else if (age <= 24) {
                            price *= 0.9; //12-24 yaş arasındaki yolcuya %10 indirim uygulandı
                            System.out.println("Ödenecek indirimli tutar: " + price);
                        } else if (age > 65) {
                            price *= 0.7; // 65 yaş üzeri yolcuya %30 indirim uygulandı
                            System.out.println("Ödenecek indirimli tutar: " + price);
                        } else {
                            System.out.println("Ödenecek tutar: " + price);
                        }

                        break;


                    case 2: //Gidiş-Dönüş seçilidğinde işleyecek kod


                        if (age < 12) {
                            price *= 0.5 * 0.8 * 2; //12 yaşından küçük yolcuya %50 ve gidiş dönüş seçimi için de %20 indirim uygulandı. 2 bilet fiyatı içn 2 ile çarpıldı
                            System.out.println("Ödenecek indirimli tutar: " + price);
                        } else if (age <= 24) {
                            price *= 0.9 * 0.8 * 2; //12-24 yaş arasındaki yolcuya %10 ve gidiş dönüş seçimi için de %20 indirim uygulandı. 2 bilet fiyatı içn 2 ile çarpıldı
                            System.out.println("Ödenecek indirimli tutar: " + price);
                        } else if (age > 65) {
                            price *= 0.7 * 0.8*2; // 65 yaş üzeri yolcuya %30 ve gidiş dönüş seçimi için de %20 indirim uygulandı. 2 bilet fiyatı içn 2 ile çarpıldı
                            System.out.println("Ödenecek indirimli tutar: " + price);
                        } else {
                            price *= 0.8*2; //Gidiş Dönüş seçimi için %20 indirim uygulandı. 2 bilet fiyatı içn 2 ile çarpıldı
                            System.out.println("Ödenecek tutar: " + price);
                        }

                        break;
                    default:
                        System.out.println("Lütfen yolculuk tipi seçiminizi kontrol ediniz.");
                        //1 ve 2 dışında veri girildiğinde hata mesajı verecek

                }
            } else {
                System.out.println("Lütfen girdiğiniz yaşı kontrol ediniz!");
                //Koşul dışında yaş verisi girilirse hata mesajı verecek
            }
        } else {
            System.out.println("Lütfen girdiğiniz mesafeyi kontrol ediniz!");
            //Koşul dışında mesafe verisi girilirse hata mesajı verecek
        }
    }
}
