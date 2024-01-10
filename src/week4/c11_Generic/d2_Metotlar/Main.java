package week4.c11_Generic.d2_Metotlar;

public class Main {
    public static void main(String[] args) {
        String[] a ={"Java","102","Patika","Dev"};
        Integer [] b = {1,2,3,4};
        Character [] c = {'J','a','v','A'};

       /* for (String i:a) {
            System.out.println(i);
        }
        for (Integer i :b) {
            System.out.println(i);
        }
        for (Character i:c) {
            System.out.println(i);
        }
*/
        Print.printArray(a,b);


    }

}
