package week2;

public class C18_CokBoyutluDizeler {
    public static void main(String[] args) {
        int[] listTekli = new int[5];
        int[] list2 = {1, 2, 3};
        int[][] matris = new int[6][6];//satır-sutun

        matris[0][0] = 0;
        matris[2][3] = 839;
        System.out.println(matris[2][3]);

        int[][] matris2 = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        int[][] matrisGezdirme = new int[3][5];
        //matris[0][0],matris [0][1]

        int num = 1;

        for (int i = 0; i < matrisGezdirme.length; i++) {

            for (int j = 0; j < matrisGezdirme[i].length; j++) {
                matrisGezdirme[i][j] = num++;
            }
        }

        for (int i = 0; i <matrisGezdirme.length ; i++) {
            for (int j = 0; j <matrisGezdirme[i].length ; j++) {
                System.out.print(matrisGezdirme[i][j]+" ");
            }
            System.out.println();
        }
       /* System.out.println(matrisGezdirme[2][3]);
        System.out.println(matrisGezdirme.length);// satır
        System.out.println(matrisGezdirme[0].length);//sütun*/


// Farklı sütun sayılı matrisler yapılabilir. her satır aynı sayıya sahip olmak zorunda değil

        int[][] matrixx = new int[3][];
        matrixx[0] = new int[1];
        matrixx[1] = new int[2];
        matrixx[2] = new int[3];

    }
}
