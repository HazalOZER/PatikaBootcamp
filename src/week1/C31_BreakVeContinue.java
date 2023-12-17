package week1;

public class C31_BreakVeContinue {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }//i 5e eşit olduğunda aşağıda kalan kodları okumaz
            //döngüye şart sağlıyorsa bir daha girer
            System.out.println(i);
        }

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }//break komutu kodu okumayı bitirir ve döngünün dışına atar
            System.out.println(i);
        }
    }
}
