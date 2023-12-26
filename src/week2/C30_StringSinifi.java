package week2;

import java.util.Arrays;

public class C30_StringSinifi {
    public static void main(String[] args) {
        String str ="patika";
        String str2 ="    PATika . dev   ";
        String strNull;
        String strEmpty="";//Null ile empty aynı değil, tanımlanmamış değişkende isEmpty çalışmaz
        System.out.println(str.charAt(0));//p
        System.out.println(str.codePointAt(1));//97, 1. indeksteki harfin ascii numarasını veriyor
        System.out.println(str.compareTo(str2));//eşitlerse 0 çıkar
        System.out.println(str.compareToIgnoreCase(str2));//Büyük küçük harf duyarlılığını kaldırır
        System.out.println(str.concat(".dev"));//devamına ekliyor.
        System.out.println(str);// ama atama yapmıyor.
        System.out.println(str.contains("ati"));//boolean
        System.out.println(str.endsWith("ika"));//boolean
        System.out.println(str.equals(str2));//boolean
        System.out.println(str.equalsIgnoreCase(str2));//boolean
        System.out.println(str.indexOf('a'));//bulduğu ilk indeksi döndürüyor 1
        System.out.println(str.isEmpty());//boolean
        System.out.println(strEmpty.isEmpty());
        System.out.println(str.lastIndexOf("a"));//En son bulduğu indeksi 5
        System.out.println(str.length());//6
        System.out.println(str.replace('a','b'));
        System.out.println(str);//Atama yapmıyor.
        System.out.println(str.replaceAll("a", "b"));//regex kodu alabiliyor
        System.out.println(str.replaceFirst("a", "b"));//sadece ilk a yı değiştiriyor

        String [] sp = str.split("a");
        System.out.println(Arrays.toString(sp));//[p, tik] a ları çıkarttı ve kalanları bir array içine attı
        System.out.println(str.startsWith("pa"));//boolean neyle başladığını bakıyor
        System.out.println(str.substring(2));//tika
        System.out.println(str.substring(2,4));//ti

        System.out.println(str2.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str2.trim());//sağındaki ve solundaki boşlukları siler





    }
}
