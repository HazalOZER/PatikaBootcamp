package week2;

public class C03_overLoading {

    static  void print (){
        System.out.println("Parametresiz metot");
    }
    static void print (int a){
        System.out.println("Parametreli metot: "+a);
    }
    static void print (double a){
        System.out.println("Parametreli double metot: "+a);
    }
    static int print (int a, int b){
        return a+b;
    }
    static int print (int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        print();
        print(5);
        print(5.0);
        print(3,5);
        print(5,7,8);

    }
}
//Buradaki amaç aynı işlemi farklı parametrelerle yapacak olan metot ismini tek seferde kullanmaktır.
// Aşırı yüklenmiş metotlar aynı veya farklı dönüş türlerine sahip olabilir, ancak parametreler açısından farklılık göstermeleri gerekir.
