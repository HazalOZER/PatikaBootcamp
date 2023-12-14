

/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

package week1;

import java.util.Scanner;

public class C21_P_EtkinlikOnerme {
    public static void main(String[] args) {
        double heat;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hava sıcaklığı kaç derece?: ");
        heat = scan.nextDouble();

        if(heat<5) {
            System.out.println("Kayak takımlarını hazırla, bu havalar için en ideal etkinlik");
        }else if(heat<15){
            System.out.println("Bu serin havaların keyfi güzel bir filmle çıkar. Hadi sinemaya!");
        }else if (heat<25){
            System.out.println("Havalar ısındı, termosları kap ve pikniğe koş!");
        }else {
            System.out.println("Bu sıcak havalarda en güzeli serin sulara kendini bırakmaktır");
        }
    }
}
