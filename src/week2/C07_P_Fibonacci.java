package week2;

public class C07_P_Fibonacci {

    static int fibonacci(int n) {

        if (n == 1||n==2) {
            return 1;
        }
        //System.out.println(fibonacci(n));
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}
