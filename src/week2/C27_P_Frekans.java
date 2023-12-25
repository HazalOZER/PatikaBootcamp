package week2;

import java.util.Arrays;

public class C27_P_Frekans {
    public static void main(String[] args) {

        int [] arr = { 10,20, 20, 10, 10, 20, 5, 20};

        int flag=1;
        Arrays.sort(arr);
        int num=arr[0]; ;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    num = arr[i];
                    flag++;
                }
            }

            System.out.println(num+" sayısı "+flag+" defa tekrar etti");
            flag=1;
        }
    }

}
