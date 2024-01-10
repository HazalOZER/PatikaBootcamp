package week4.c09_nested;

import week4.c08_maceraOyunu.Location;

import java.lang.reflect.AnnotatedArrayType;

//Nested class(İç içe Sınıflar)
//Inner
public class Main {
    public static void main(String[] args) {
        Out out = new Out();
        out.run();
      //  Out.In in= new Out.In();Static değil

        Out.In in =out.new In();//Veya =Out.getIn(); //OuterClass.InnerClass innerNesnesi = outerNesnesi.new. InnerClass();
        in.run();

        Out.InStatic.run();

        Local local= new Local();
        local.run();

        Anonim anonim = new Anonim(){
            public int a = 10;
            @Override
            public void run() {
                System.out.println(this.a);//10
                System.out.println(this.b);//45
                System.out.println(a);//10

                System.out.println("Anonim olarak yazılmış run metodu çalıştı");
                print();
                //super.run();
            }
            public void print(){
                System.out.println("print metodu");
            }
        };
        anonim.run();
      //  anonim.print(); HATA. Sadece override yaptırıyor

    }
}
