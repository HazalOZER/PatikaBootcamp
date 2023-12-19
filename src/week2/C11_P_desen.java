package week2;

public class C11_P_desen {

    static void desen(int num, int again) {

        System.out.print(again + " ");

        if (num==again) {
            desen(num,num);
        }

        if(again>0){

            desen(num, again-5);
        }
        if (again <= 0) {
            desen(num, again + 5);
        }

    }

    public static void main(String[] args) {
        int a=13;
        desen(a,a-5);
    }
}
