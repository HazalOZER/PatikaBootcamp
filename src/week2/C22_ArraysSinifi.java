package week2;


import java.util.Arrays;

public class C22_ArraysSinifi {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        int[] list2 = {4, 3, 5, 1, 1};
        double[] list3 = {2.2, 1.8, 3.5};

        C22_1_HelperArray helper = new C22_1_HelperArray(); //kurucu metot

        helper.print(list);
        helper.print(list2);
        helper.print(list3);


        // Arrays.toString(list); listeyi ekrana bastırmak için

        System.out.println(Arrays.toString(list));//kütüphaneden direkt alıyoruz
        //arrays sınıfında statik metotlardır

        //Arrays.fill(list,value); listenin tüm elamanlarına girilen değeri atama

        Arrays.fill(list, 3);//Tüm elamanlarını 3 yapıyor
        System.out.println(Arrays.toString(list));

        list = helper.fill(list, 5);
        helper.print(list); //bitim metotlarla


        Arrays.fill(list, 1, 3, 2);//1. indeksden 3. indekse kadar 2 değerini ata
        System.out.println(Arrays.toString(list));

        //Arrays.sort (list) Listeyi küçükten büyüğe sıralıyor

        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));//[1, 1, 3, 4, 5]

        //Arrays.binarySearch(list,value);//girdiğimiz değeri listede arıyor

        System.out.println(Arrays.binarySearch(list2, 10));
        System.out.println(helper.search(list2, 5));

        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(liste);//ÖNCE SIRALI OLMALI!!!!!!!!!!!2YE BÖLE BÖLE ARIYOR
        System.out.println(Arrays.binarySearch(liste, 55));

        int[] copyList = Arrays.copyOf(liste, 4);//dört indeksli bir metot
        System.out.println(Arrays.toString(copyList));

        copyList = Arrays.copyOf(liste, liste.length);//birebir kopyaladık
        System.out.println(Arrays.toString(copyList));

        //belirli bir indeks aralığı kontorl ediyor
        copyList = Arrays.copyOfRange(liste, 2, 5);//2. 3. ve 4. indeks kopyalanır
        System.out.println(Arrays.toString(copyList));

        int[] liste1 = {1, 2, 3};
        int[] liste2 = {1, 2, 3};
        int[] liste3 = {1, 2, 10};

        System.out.println(Arrays.equals(liste1, liste2)); // true
        System.out.println(Arrays.equals(liste2, liste3)); // false

        System.out.println(helper.equals(liste1, liste2));//bizim yaptığımız yöntem
        System.out.println(helper.equals(liste2, liste3));


    }
}
