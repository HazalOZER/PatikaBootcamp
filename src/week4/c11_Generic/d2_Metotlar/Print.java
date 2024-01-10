package week4.c11_Generic.d2_Metotlar;

public class Print {
    public static <T,U> void printArray(T[] arr,U[]arr2){

        for (T i:arr) {
            System.out.println(i);
        }

        for (U i:arr2 ) {
            System.out.println(i);
        }
    }
}
