package week2;

import java.util.Arrays;

public class C25_P_TekrarEdenCift {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {3, 7,10, 3, 20, 3, 2, 9,20, 10, 21, 1, 33, 9, 1};

        int[] dublicate = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr.length; j++) {

                if ((i != j) && (arr[i] == arr[j])) {

                    if (!isFind(dublicate, arr[i])) {
                        dublicate[startIndex++] = arr[j];

                    }
                    break;
                }
            }
        }



    }
}
