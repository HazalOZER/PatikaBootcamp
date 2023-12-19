package week2;

public class C05_Recursice {
     static int f (int n){
         if (n == 1){
             return 1;
         }
         return f(n-1)+n;
     }

    public static void main(String[] args) {
        System.out.println(f(4));
        /*f(4)= f(3)+4
        * f(3)=f(2)+3
        * f(2)=f(1)+2
        * f(1)=1*/

    }
}
