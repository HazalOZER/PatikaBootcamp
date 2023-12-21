package week2;

public class C16_Array {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }
        return reverse;
    }

    public static void main(String[] args) {


       int [] list = new int[10];// 10 elaman sayısı
        // int list2 [] =new int[50];    //kullanılan yöntem değil

        list[0] = 10;
        list[1] = 1;
        list[2] = 20;
        //list [10]=4; index 9 en son
        //System.out.println(list[1]);

        for (int i = 0; i < list.length; i++) {
            list[i] = i * 10 + 10;
            System.out.println(list[i]);
        }
        int[] list2 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }
        //while ile yap
        double[] list3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(list3);

        int [] yeniListe=reverse(list);
        printArray(list);
        printArray(yeniListe);

        //Diziler sabit boyutludur ve tanımlanırken boyutları belirtilir
        //printArray ( int[] array ) kırmızı olarak işaretlediğimiz yer diziyi yerel değişken olarak fonksiyona gönderdiğimiz noktadır. Java'da tüm değişkenler "Pass by Value" yöntemiyle geçilir. Bu şu demektir. Sizin tanımladığınız değişkenin, nesnenin veya dizinin birebir kopyası oluşturulur. Bu kopya değer fonksiyona yerel değişken olarak gider.
        // Bu Java mülakatlarında size sorulabilecek bir detaydır.



    }

}
