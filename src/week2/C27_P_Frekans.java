package week2;

import java.util.Arrays;

public class C27_P_Frekans {
    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {

            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10,5, 10, 20, 5, 20};

        int[] dublicate = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr.length; j++) {

                if ((i != j) && (arr[i] == arr[j])) {

                    if (!isFind(dublicate, arr[i])) {
                        dublicate[startIndex++] = arr[j];

                    }
                   // break;
                }

            }

            }for (int i : dublicate) {
          //  if ( i != 0) {
                System.out.println(i);
            //}
        }




    }

}

      /*  int flag = 1;
        Arrays.sort(arr);
        int num = arr[0];

        int again=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    num = arr[i];
                    flag++;
                }
            }
            if (i==0){
                again= num;
            }
            if (num != again) {
                System.out.println(num + " sayısı " + flag + " defa tekrar etti");
                flag = 1;
                again=num;
            }
        }*/