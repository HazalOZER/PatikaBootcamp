package week2;

public class C06_P_Palindrom {
    static boolean isPalindrom(int num) {

        int temp = num, reverseNum = 0, lastNum;

        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = reverseNum * 10 + lastNum;
            temp /= 10;
        }
        if (reverseNum==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4));
    }
}
