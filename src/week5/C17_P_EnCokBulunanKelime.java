package week5;

import java.util.HashMap;
import java.util.Scanner;

public class C17_P_EnCokBulunanKelime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Scanner çağırıldı

        System.out.print("Text: ");//Kullanıcı ekranına mesaj yazdırıldı
        String text = scan.nextLine();//Kullanıcıdan alınan veri değişkene atandı

        HashMap<String, Integer> hashMap = new HashMap<>();//HashMap oluşturuldu

        String[] arr = text.split(" ");//split () metodu ile metin kelimelere ayrıldı, arraye atandı

        for (String s : arr) {//foreach ile array gezildi

            if (!hashMap.containsKey(s)) {
                hashMap.put(s, 1);//Olmayan kelimeler key olarak atandı, value olarak 1 atandı
            } else {
                hashMap.put(s, (hashMap.get(s) + 1));//var olan kelimelerin valuesu 1 arttırıldı
            }
        }


        Integer max = 0;//max sıfır atandı
        String most ="";//varsayılan atandı

        for (String s : hashMap.keySet()) {//foreach ile hashmapin keyi gezildi
            if (hashMap.get(s) > max) {
                max = hashMap.get(s);//max değerden büyük olanların valuesu maxa eklendi
                most = s;//kelime tekrar edan olarak belirlendi
            }
        }
        System.out.println(most);//ekrana yazdırıldı

    }
}
