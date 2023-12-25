package week2;

public class C24_P_bHarfi {
    public static void main(String[] args) {

        String[][] arr = new String[7][4];


        for (int i = 0; i < arr.length; i++) {

            if (i == 0 || i == 3 || i == 6) {
                for (int j = 0; j < arr[0].length; j++) {

                    arr[i][j] = " * ";

                }
            } else {
                for (int j = 0; j < arr[0].length; j++) {
                    if (j == 0 || j == 3) {
                        arr[i][j] = " * ";
                    } else {
                        arr[i][j] = "   ";
                    }
                }
            }

        }

        for (String[] row : arr){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
