package week2;
/*ClassName object = new ClassName();
* ClassName : Nesne oluşturmak istediğimiz sınıfı belirtiyoruz. Bu sınıf daha öncesinde projemizde tanımlanmış olması gerekmektedir.
object : Nesnemize verdiğimiz isimdir ve aynı isimde birden fazla nesne oluşturulamaz.
new : Java'da nesne üretmek için "new" anahtar kelimesini kullanırız.
ClassName(); : Sınıfa ait Kurucu (Constructor) Metodu temsil eder. Varsayılan olarak parametresiz tanımlanır.*/

public class C12_1_carMain {
    public static void main(String[] args) {

        C12_0_Car audi = new C12_0_Car("Audi", 10,"Blue"); //Kurucu metot

        audi.increaseSpeed(20);

        audi.printInfo();

        C12_0_Car bmw = new C12_0_Car("BMW",60,"pink");

        bmw.speed=70;//bu şekilde de değer atanabilir
        bmw.decreaseSpeed(15);
        bmw.printSpeed();

        C12_0_Car mercedes = new C12_0_Car("Mercedes", 80,"red");

        mercedes.printInfo();

        C12_0_Car tesla =new C12_0_Car();//boş metot

    }
}
