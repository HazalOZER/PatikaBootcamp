package week2;

import java.util.Arrays;
import java.util.Scanner;

public class C23_P_girilenSayiyaEnYakin {
    public static void main(String[] args) {


        int [] arr ={15,12,788,1,-1,-778,2,0};

        Scanner scan = new Scanner( System.in);

        System.out.print("Sayı: ");
        int num= scan.nextInt();

        int highest=num, least=num;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int x:arr) {

            if (num >=x){
            highest = x;

            }else {
                least=x;
                break;
            }
        }

        System.out.println( num+ " sayına dizideki küçük en yakın: "+highest);
        System.out.println(num+ " sayısına dizideki büyük en yakın: "+least);


    }
}
