package week2;

public class C12_0_Car {

    //Nitelikler- Değişkenler ile belirlenir
    //değişkenler sınıfın başında tanımlamak daha düzenli gösterir

    //this. sınıfıa aiy olan değişkenleri ayırt etmek için

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    //Constructor
    //Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır

    C12_0_Car(String model, int speed, String color) {

        System.out.println("Paremetreli kurucu metot oluşturuldu");

        this.model = model;//this olan classta tanımlanan model, atanan metot ile alınacak model
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";//varsayılan değer
        this.speedLimit = 180;
    }
    C12_0_Car(){//overloading
        System.out.println("Boş kurucu metodu oluşturuldu");
    }

    //Davranışlar


    void increaseSpeed(int increment) {
        if (this.speed + increment < 180) {
            this.speed += increment;
        } else {
            this.speed = speedLimit;
        }

    }

    void decreaseSpeed(int decrease) {
        if (this.speed - decrease >= 0) {
            this.speed -= decrease;
        } else
            this.speed = 0;
    }

    void printSpeed() {
        System.out.println(this.model + " Hızınız: " + this.speed);
    }

    void printInfo() {
        System.out.println("Model\t:"+this.model);
        System.out.println("Color\t:"+this.color);
        System.out.println("Type\t:"+this.type);
        System.out.println("Speed\t:"+this.speed);

    }


}