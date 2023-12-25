package week2;
/*for (veritipi degisken: diziAdi) {
  // kod bloğu
}*/
public class C19_ForEach {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4};


        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);

        }
//yukarıdaki metot ile aynı

        for (double i : list) { //int yerine double yaptık
            System.out.println(i);
        }

        int sum = 0;

        //listedeki elamanları toplayan program

        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);

        String[] cars = {"BMW", "Mercedes", "Audi"};
        for (String str : cars) {
            System.out.println(str);
        }

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0; i < matris.length; i++) {//satır
            for (int j = 0; j < matris[0].length; j++) {//sütun
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        for (int [] row : matris) {
            for (int col:row) {
                System.out.print(col+" ");

            }
            System.out.println();

        }

        //soru
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }

    }
}
