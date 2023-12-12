package week1;

import java.util.Scanner;

public class C05_P_UcgeninAlani {
    //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b, c, u, area, areaSquare;

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz." +
                "\nGirdiğiniz her kenar uzunluğundan sonra enter tuşuna basınız");

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        u=(a+b+c)/2;
        areaSquare= u*(u-a)*(u-b)*(u-c);//Patikanın verdiği formül

        area=Math.sqrt( areaSquare);// MATH SINIFI OLMADAN NASIL YAPIlACAK???

        System.out.println("Kenar uzunluklarını girdiğiniz üçgenin alanı: "+area);



    }
}
