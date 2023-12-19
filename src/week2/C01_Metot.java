package week2;

public class C01_Metot {

    static int power (int base, int exp){
        int result = 1;
        for (int i = 1; i <=exp ; i++) {
            result *=base;
        }
        return result;
    }

    static void helloWorld(){
        System.out.println("Merhaba Dünya!");
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
        System.out.println(power(5,2));
        helloWorld();
    }
}

/*veriTipi metotAdi(parametre1, parametre2, ....) {
  // kod bloğu
}
veriTipi : Metotlar geriye bir değer döndürebilir, bu değerin veri tipini metot tanımlanırken belirtilir.
Örneğin metot geriye "integer" veri tipinde bir değer döndürecekse "veriTipi" kısmına "int" anahtar sözcüğü yazılmalıdır.
Eğer metotlar geriye bir değer döndürmeyecekse "void" anahtar sözcüğü kullanılır.

metotAdi : Metodumuzun benzersiz ismidir ve bu isimlendirme ile metotlar çağrılır.

kod bloğu : Bu kısım metot çağrıldığı zaman, program tarafından çalışacak kod bloğudur.

parametre1/parametre2 : Bu kısım metot içerisine aktarma istediğimiz verilerdir ve parametre olarak adlandırılır.



Java'da önceden yazdığımız metotları erişimi olduğu yerlerde çağırabiliriz.
Java'da bir metodu çağırmak için metodun adını ve ardından iki parantez () ve bir noktalı virgül yazılmalıdır.
*/

