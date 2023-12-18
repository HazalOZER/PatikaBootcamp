package week1;

public class C48_Casting {
    //byte < short < int < long<  float < double
    //Auto Widenning (Otomatik genişletme
    //Explicit Narrowing(açıkça daraltma

    public static void main(String[] args) {
        byte sayiByte = 15;
        int sayiInt = sayiByte;//Auto Widenning

        double sayiDouble= 25.3;
       short sayiShort = (short) sayiDouble;//Explicit Narrowing

        char karakter = 'A';
        int asciiDeger = karakter;
        System.out.println(karakter); // Çıktı: A
        System.out.println(asciiDeger); // Çıktı: 65

         asciiDeger = 97;
        karakter = (char) asciiDeger;

        System.out.println(asciiDeger); // Çıktı: 97
        System.out.println(karakter); // Çıktı: a

        long buyukSayi = 130L;
        byte byteDeger = (byte) buyukSayi;

        System.out.println(buyukSayi); // Çıktı: 130
        System.out.println(byteDeger); // Çıktı: -126 (Byte tipinin sınırlarını aştığı için hatalı dönüşüm oluşur)

        /**    *   STRING DEN INTEGER'A ÇEVİRME (String TO int/float/byte/long):       *
         *  - Parseint ve valueof metotları kullanılır.
         *  - Parseint metodu valueof metoduna göre daha hızlıdır.
         *  - örneğin Parseint metodu int tipinde bir değer döndürür.
         *  - örneğin Valueof metodu Integer tipinde bir nesne döndürür.
         *       **/
        String sdeger = "10";
        int ideger = 20;
        int ideger2 = Integer.parseInt(sdeger); //parsint metodu ile string in int e cevrilmesi.
        int ideger3 = Integer.valueOf(sdeger);  //valueof metedu ile string in int e çevrilmesi.
        float fdeger4 = Float.parseFloat(sdeger);
        float fdeger5 = Float.valueOf(sdeger);
        byte bdeger6 = Byte.parseByte(sdeger);
        byte bdeger7 = Byte.valueOf(sdeger);
        long ldeger8 = Long.parseLong(sdeger);
        long ldeger9 = Long.valueOf(sdeger);
        System.out.println("String To Int Orn. Sonuç1 : "+ (ideger+ideger2) );
        System.out.println("String To Int Orn. Sonuç2 : "+ (ideger/ideger2) );
        System.out.println("String To float Orn. Sonuç1 : "+ fdeger4 );
        System.out.println("String To float Orn. Sonuç2 : "+ fdeger5 );
        System.out.println("String To byte Orn. Sonuç1 : "+ bdeger6 );
        System.out.println("String To byte Orn. Sonuç2 : "+ bdeger7 );
        System.out.println("String To long Orn. Sonuç1 : "+ ldeger8 );
        System.out.println("String To long Orn. Sonuç2 : "+ ldeger9 );
////////////////////////////////////////////////////////////////////
/**    *  INTEGER DAN STRING'E ÇEVİRME (int TO String/float/byte/long/char):             *
 * - ÇEvirme işleminde String Sınıfının valueof metodu veya
 *  Integer sınıfının toString metodu kullanılır.             *             **/
        int intDeger = 100;
        String stringDeger1 = Integer.toString(intDeger);
        String stringDeger2 = String.valueOf(200);
        String stringDeger3 = ("Sınavdan "+stringDeger1+ " aldım,");
        String stringDeger4 = (" babam "+stringDeger2+ "TL harçlık verdi");
        System.out.println("Int To String Orn. Sonuç : "+stringDeger3+stringDeger4);
        System.out.println("int To float Orn. Sonuç : " + ((float) intDeger));
        System.out.println("int To byte Orn. Sonuç : " + ((byte) intDeger));
        System.out.println("int To long Orn. Sonuç : " + ((long) intDeger));
        System.out.println("int To char Orn. Sonuç : " + ((char) intDeger));
////////////////////////////////////////////////////////////////////
        //  FLOAT DAN INT E ÇEVİRME (float TO int):
        float floatDeger1 = (float) 10.6;
        float floatDeger2 =  10.7f;
        int floatDeger3 = (int) floatDeger1;
        int floatDeger4 = (int) floatDeger2;
        float floatDeger5 = floatDeger3 + floatDeger4;
        System.out.println("float To int Orn. Sonuç : "+((int) floatDeger5));
////////////////////////////////////////////////////////////////////
        //  BYTE DEN  FLOAT A ÇEVİRME (byte TO float):
        byte byteDeger1 = 127;
        float floatDeger11 = (float)byteDeger1;
        System.out.println("byte To float Orn. Sonuç : " + floatDeger11);
////////////////////////////////////////////////////////////////////
        //  LONG DAN  FLOAT A ÇEVİRME (long TO float):
        long longDegeri1 = 954564653;
        float floatDeger00 = (float) longDegeri1;
        System.out.println("long To float Orn. Sonuç : " + floatDeger00);
////////////////////////////////////////////////////////////////////
        //  CHAR DAN  INT E ÇEVİRME (char TO int):
        char charDeger1 = '9';
        String donusturC = String.valueOf(charDeger1);
        int intDeger00 = Integer.valueOf(donusturC);
        System.out.println("char To int Orn. Sonuç : " + intDeger00);
////////////////////////////////////////////////////////////////////
        //  CHAR DAN  BOOLEAN A ÇEVİRME (char TO boolean):
        char cDeger1 = '1';
        String durum = String.valueOf(cDeger1);
        int donus = Integer.valueOf(durum);
        System.out.println("sonDonus : " + donus);
        boolean sonDonus = Boolean.parseBoolean("true");
        System.out.println("sonDonus : " + sonDonus);
        if (Character.isDigit(cDeger1)){
            if (donus == 1) {
                sonDonus = true;
            }
            if (donus == 0) {
                sonDonus = false;
            }
        }
        System.out.println("char To boolean Orn. Sonuç : " + sonDonus);
////////////////////////////////////////////////////////////////////
//  STRING DEN  BOOLEAN A ÇEVİRME (String TO boolean):
        String aSting = "true";
        boolean durumB = Boolean.parseBoolean(aSting);
        System.out.println("Gelen durum : " + durumB);
////////////////////////////////////////////////////////////////////
    }
}
