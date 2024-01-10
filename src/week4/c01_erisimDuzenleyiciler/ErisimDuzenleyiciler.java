package week4.c01_erisimDuzenleyiciler;

public class ErisimDuzenleyiciler {//public silsek sorun yarataz

    public  int a;//public silsek sorun yaratmaz
    private String str;


   ErisimDuzenleyiciler (String str){
       this.str = str;
   }
   private void showStr (){
       System.out.println(str);//sınıf içinde erişilebiliyor
    }

    void show(){
       this.showStr();
    }

}
/*private: ait olduğu sınıftan erişilebilir.
başka sınıflardan erişilemez. class içinde
*
!!!! sınıf private olamaz. Erişilemez sınıf kullanılamaz da(kalıtım hariç)

*Public : başka sınıf ve package üzerinden ulaşılabilir

*Protected :  Aynı package içinde ulaşılır ama farklı package üzerinde ulaşılamaz

*default değer: hiçbir erişim belirleyicisi yazmazsak erişime ait olduğu package üzerinde erişilir

Public =paket dışı erişim
+protected(paket dışı kalıtımla erişim
+defaut(paket içi erişim
+privatte(sınıf içi erişim)))

en kapsamlı public en dar private


 Nesne Yönelimli Programlama'nın temel ilkelerinden olan Sarmalama ilkesi gereği,
 sınıf içindeki değişkenler sadece sınıf içinde doğrudan erişebilir olması gerekir.
 Bundan dolayı, genellikle değişkenler "private" olarak tanımlanır.
 Bazı zamanlarda ise sadece o sınıfta çağrılmasını istediğimiz değişkenler veya metotları da private olarak tanımlarız.


*/