package week2;

public class C10_P_asalSayi {

    static  boolean isPrime (int num){

        int deneme=num/2;

        if(num%deneme==0){
            return false;
        }


        return isPrime(deneme);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
