package week2;

// return değer döndüren metotlar
//void değer döndürmez

public class C02_returnVoid {

static void  toplam (int a,int b){
    int result = a+b;
    System.out.println(result);
}
    static int sum(int a, int b) {
        System.out.println("Kod çalıştı");
        return a + b;
    }

    public static void main(String[] args) {

        int result = sum(5, 7);
        System.out.println(result);
        System.out.println(sum(3, 7));
        result = sum(5, 8) + sum(3, 1);

       // result = toplam(3,5);
        //System.out.println(toplam(3,4));
        toplam(3,6);
    }
}
