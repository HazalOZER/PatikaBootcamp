package week2;

public class C28_P_Transpoz {

    public static void main(String[] args) {

        int[][] arr = {{0, 3, 7},//Array tanımlandı
                {3, 5, 12},
                {8, 37, -1},
                {18, 7, 2}};

        int[][] transpoz = new int[3][4];//transpoz tanımlandı. Eleman sayıları verildi

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                transpoz[j][i] = arr[i][j];//Arr 'in satırı Transpozun sütuna, Sütunu ise satırına atandı
            }
        }
        for (int[] row:transpoz) {
            for (int col:row) {
                System.out.print(col+" ");
            }//forEach ile transpoz dizisi ekrana yazdırıldı
            System.out.println();// satır atlandı
        }
        //Çıktı
        //0 3 8 18
        //3 5 37 7
        //7 12 -1 2
    }
}
