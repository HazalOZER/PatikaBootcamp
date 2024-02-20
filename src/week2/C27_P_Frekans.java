package week2;


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

        int[] arr = {10, 5, 23, 20, 20, 10, 5, 10, 20, 5, 20};

        int[] dublicate = new int[arr.length];

        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            int flag = 0;

            if (!isFind(dublicate, arr[i])) {

                for (int j = 0; j < arr.length; j++) {


                    if ((arr[i] == arr[j])) {

                        flag++;
                        dublicate[startIndex++] = arr[j];

                    }
                }

                System.out.println(arr[i] + " sayısı " + flag + " kere tekrar etti");
            }
        }
    }
}
